package com.gianni.producer.controller;

import com.gianni.producer.entity.SomeResponse;
import com.gianni.producer.file.FileWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class Controller {

    @Autowired
    private FileWriter writer;

    @GetMapping(path = "/test")
    public String test(@RequestParam String message) {
        return writer.writeToFile(message);
    }

    @GetMapping(path = "/message")
    public SomeResponse getMessage() {
        return new SomeResponse("A very HAPPY MESSAGE");
    }

}
