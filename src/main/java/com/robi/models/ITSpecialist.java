package com.robi.models;

public class ITSpecialist extends ParticipantClass implements ParticipantInterface {
    public ITSpecialist(String name, Integer age, boolean presentedWork) {
        super(name, age, presentedWork);
        this.type = "IT Specialist";
    }

    public boolean checkIfTheyPresentedWork() {
        return this.presentedWork;
    }

    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Type: " + this.type + ", Presented Work: " + this.presentedWork;
    }
}
