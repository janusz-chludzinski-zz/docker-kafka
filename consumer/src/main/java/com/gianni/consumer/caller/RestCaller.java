package com.gianni.consumer.caller;

import com.gianni.consumer.entity.SomeResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

import static java.util.Optional.ofNullable;

@Service
public class RestCaller {

    private RestTemplate template = new RestTemplate();

    public SomeResponse getMessageFromProducer() {
        URI uri = URI.create("http://localhost:8090/message");
        return ofNullable(retriveMessage(uri)).orElseGet(() -> new SomeResponse("DEFAULT MESSAGE"));

    }

    private SomeResponse retriveMessage(URI uri) {
        return template.getForObject(uri, SomeResponse.class);
    }

}
