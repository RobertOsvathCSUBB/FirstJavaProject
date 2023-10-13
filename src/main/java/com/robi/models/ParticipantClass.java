package com.robi.models;
import com.robi.exceptions.MyException;

public class ParticipantClass {
    String name;
    Integer age;
    String type;
    boolean presentedWork;

    public ParticipantClass(String name, Integer age, boolean presentedWork) throws MyException {
        if (name == null || name.length() == 0) {
            throw new MyException("Name cannot be null or empty");
        }

        if (age == null || age < 0 || age > 100) {
            throw new MyException("Age must be between 0 and 100");
        }

        this.name = name;
        this.age = age;
        this.presentedWork = presentedWork;
    }
}
