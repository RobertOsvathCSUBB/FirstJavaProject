package com.robi.models;

public class Student extends ParticipantClass implements ParticipantInterface {
    public Student(String name, Integer age, boolean presentedWork) {
        super(name, age, presentedWork);
        this.type = "Student";
    }

    public boolean checkIfTheyPresentedWork() {
        return this.presentedWork;
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Type: " + this.type + ", Presented Work: " + this.presentedWork;
    }
}
