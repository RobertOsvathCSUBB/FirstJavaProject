package com.robi.models;

public class ParticipantClass {
    String name;
    Integer age;
    String type;
    boolean presentedWork;

    public ParticipantClass(String name, Integer age, boolean presentedWork) {
        this.name = name;
        this.age = age;
        this.presentedWork = presentedWork;
    }
}
