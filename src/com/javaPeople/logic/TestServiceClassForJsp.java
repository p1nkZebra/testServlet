package com.javaPeople.logic;

public class TestServiceClassForJsp {

    public String getGreeting() {
        return "Ку!";
    }

    public String getGreeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Ку! Ку!";
        }

        return "Ку! " + name;
    }
}
