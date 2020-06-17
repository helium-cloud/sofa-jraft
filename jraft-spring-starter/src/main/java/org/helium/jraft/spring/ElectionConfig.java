package org.helium.jraft.spring;

public class ElectionConfig {
    private String dataPath = "/tmp/server1";
    private String groupId = "election_group";
    private String serverIdStr = "127.0.0.1:8081";
    private String initialConfStr = "127.0.0.1:8081";

    public String getDataPath() {
        return dataPath;
    }

    public void setDataPath(String dataPath) {
        this.dataPath = dataPath;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getServerIdStr() {
        return serverIdStr;
    }

    public void setServerIdStr(String serverIdStr) {
        this.serverIdStr = serverIdStr;
    }

    public String getInitialConfStr() {
        return initialConfStr;
    }

    public void setInitialConfStr(String initialConfStr) {
        this.initialConfStr = initialConfStr;
    }
}
