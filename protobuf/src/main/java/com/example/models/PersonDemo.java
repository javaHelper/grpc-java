package com.example.models;

import com.google.protobuf.Int32Value;

public class PersonDemo {
    public static void main(String[] args) {
        Person sam = Person.newBuilder()
                .setName("sam")
                .setAge(Int32Value.newBuilder().setValue(10).build())
                .build();

        Person sam1 = Person.newBuilder()
                .setName("sam")
                .setAge(Int32Value.newBuilder().setValue(10).build())
                .build();

        Person sam2 = Person.newBuilder()
                .setName("Sam")
                .setAge(Int32Value.newBuilder().setValue(10).build())
                .build();

        System.out.println(sam.toString());
        System.out.println(sam.equals(sam1));
        System.out.println(sam.equals(sam2));
    }
}
