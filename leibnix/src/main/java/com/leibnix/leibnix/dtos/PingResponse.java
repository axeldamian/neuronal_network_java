package com.leibnix.leibnix.dtos;

public class PingResponse {
        
    private String ping;

    public PingResponse(String value) {
        super();
        this.ping = value;
    }

    public String getResponse() {
        return this.ping;
    }
    
}