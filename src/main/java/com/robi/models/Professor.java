package com.robi.models;

public class Professor extends ParticipantClass implements ParticipantInterface {
    public Professor(String name, Integer age, boolean presentedWork) {
        super(name, age, presentedWork);
        this.type = "Professor";
    }

    public boolean checkIfTheyPresentedWork() {
        return this.presentedWork;
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Type: " + this.type + ", Presented Work: " + this.presentedWork;
    }
}
