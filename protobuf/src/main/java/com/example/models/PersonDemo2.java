package com.example.models;

import com.google.protobuf.Int32Value;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonDemo2 {
    public static void main(String[] args) throws IOException {
        Person sam = Person.newBuilder()
                .setName("sam")
                .setAge(Int32Value.newBuilder().setValue(10).build())
                .build();

        Path path = Paths.get("sam1.ser");
        Files.write(path, sam.toByteArray());

        byte[] bytes = Files.readAllBytes(path);
        Person person = Person.parseFrom(bytes);
        System.out.println(person);
    }
}
