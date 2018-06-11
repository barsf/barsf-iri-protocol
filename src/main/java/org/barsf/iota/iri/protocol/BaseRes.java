package org.barsf.iota.iri.protocol;

import com.google.api.client.util.Key;

public class BaseRes {

    @Key("command")
    private String command;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
