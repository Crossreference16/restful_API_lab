package com.example.task_01.models;
//this is the DTO class.

public class Celebration {

    private String message;


    public Celebration(String message){
        this.message = message;
    }

    public Celebration(){}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
