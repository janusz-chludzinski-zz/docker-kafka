package com.gianni.consumer.controller;

import com.gianni.consumer.caller.RestCaller;
import com.gianni.consumer.entity.SomeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private final RestCaller caller;

    @Autowired
    public MainController(RestCaller caller) {
        this.caller = caller;
    }

    @GetMapping(path = "/getMessage")
    public SomeResponse callForMessage() {
        return caller.getMessageFromProducer();
    }

}
