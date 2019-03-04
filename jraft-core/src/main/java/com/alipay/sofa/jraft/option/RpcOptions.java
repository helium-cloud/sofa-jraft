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
package com.alipay.sofa.jraft.option;

import com.codahale.metrics.MetricRegistry;

public class RpcOptions {

    /**
     * Rpc connect timeout in milliseconds
     * Default: 1000(1s)
     */
    private int            rpcConnectTimeoutMs        = 1000;

    /**
     * RPC request default timeout in milliseconds
     * Default: 5000(5s)
     */
    private int            rpcDefaultTimeout          = 5000;

    /**
     * Rpc process thread pool size
     * Default: 80
     */
    private int            rpcProcessorThreadPoolSize = 80;

    /**
     * Metric registry for RPC services, user should not use this field.
     */
    private MetricRegistry metricRegistry;

    public MetricRegistry getMetricRegistry() {
        return metricRegistry;
    }

    public void setMetricRegistry(MetricRegistry metricRegistry) {
        this.metricRegistry = metricRegistry;
    }

    public int getRpcProcessorThreadPoolSize() {
        return this.rpcProcessorThreadPoolSize;
    }

    public void setRpcProcessorThreadPoolSize(int rpcProcessorThreadPoolSize) {
        this.rpcProcessorThreadPoolSize = rpcProcessorThreadPoolSize;
    }

    public int getRpcConnectTimeoutMs() {
        return this.rpcConnectTimeoutMs;
    }

    public void setRpcConnectTimeoutMs(int rpcConnectTimeoutMs) {
        this.rpcConnectTimeoutMs = rpcConnectTimeoutMs;
    }

    public int getRpcDefaultTimeout() {
        return this.rpcDefaultTimeout;
    }

    public void setRpcDefaultTimeout(int rpcDefaultTimeout) {
        this.rpcDefaultTimeout = rpcDefaultTimeout;
    }

    @Override
    public String toString() {
        return "RpcOptions{" + "rpcConnectTimeoutMs=" + rpcConnectTimeoutMs + ", rpcDefaultTimeout="
               + rpcDefaultTimeout + ", rpcProcessorThreadPoolSize=" + rpcProcessorThreadPoolSize + ", metricRegistry="
               + metricRegistry + '}';
    }
}