package com.example;

import com.example.types.Message;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        Message message = mapper.readValue("{\"something\": \"this is a required property\", \"somethingElse\": \"this is another required property\", \"metadata\": {\"p0\": \"These are properties we do not need to parse as we want to store them as a json string\", \"p1\": {}, \"p2\": 12345}}", Message.class);

        System.out.println(message.getSomething());
        System.out.println(message.getSomethingElse());
        System.out.println(mapper.writeValueAsString(message.getMetadata()));
    }
}
