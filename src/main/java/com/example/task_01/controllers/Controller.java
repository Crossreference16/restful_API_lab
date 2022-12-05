package com.example.task_01.controllers;

import com.example.task_01.models.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/greeting")
    public String myGreeting (
            @RequestParam(value = "khalil") String name,
            @RequestParam(value = "ToD")String timeOfDay){
        Greeting greeting = new Greeting(name, timeOfDay);
        return "Good " + greeting.getTimeOfDay() + ", " + " " + greeting.getName() + "!";


    }

//    @GetMapping("/greeting")
//    public ResponseEntity<Greeting>makeGreeting(){
//        Greeting greeting = new Greeting("Khalil", "Morning");
//        return new ResponseEntity<>(greeting, HttpStatus.OK);
//    }






}
