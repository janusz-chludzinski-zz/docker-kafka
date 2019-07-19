package com.gianni.producer.entity;


public class SomeResponse {

    private String message;

    public SomeResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
