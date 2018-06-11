package org.barsf.iota.iri.protocol;

import com.google.api.client.util.Key;

public class BaseReq {

    @Key("command")
    private String command;

    public BaseReq(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}