package com.treasure_data.newclient;

public enum Protocol {

    HTTP("http"), HTTPS("https");

    private final String protocol;

    private Protocol(String protocol) {
        this.protocol = protocol;
    }

    @Override
    public String toString() {
        return protocol;
    }
}