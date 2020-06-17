/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.helium.jraft.spring;

import com.alipay.sofa.jraft.entity.PeerId;

/**
 * @author wuhao
 */
public class ElectionBootstrap {


    public static void main(final String[] args) {
        ElectionConfig electionConfig = new ElectionConfig();

        final ElectionNodeOptions electionOpts = new ElectionNodeOptions();
        electionOpts.setDataPath(electionConfig.getDataPath());
        electionOpts.setGroupId(electionConfig.getGroupId());
        electionOpts.setServerAddress(electionConfig.getServerIdStr());
        electionOpts.setInitialServerAddressList(electionConfig.getInitialConfStr());

        final ElectionNode node = new ElectionNode();
        node.addLeaderStateListener(new LeaderStateListener() {

            PeerId serverId = node.getNode().getLeaderId();
            String ip = serverId.getIp();
            int port = serverId.getPort();

            @Override
            public void onLeaderStart(long leaderTerm) {
                System.out.println("[ElectionBootstrap] Leader's ip is: " + ip + ", port: " + port);
                System.out.println("[ElectionBootstrap] Leader start on term: " + leaderTerm);
            }

            @Override
            public void onLeaderStop(long leaderTerm) {
                System.out.println("[ElectionBootstrap] Leader stop on term: " + leaderTerm);
            }
        });
        node.init(electionOpts);
    }
}
