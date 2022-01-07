package com.sparta.week01.controller;

import com.sparta.week01.Course;
import com.sparta.week01.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getCourses() {
        Person person = new Person();
        person.setName("Isabelle");
        person.setAge(23);
        person.setJob("student");
        return person;
    }

}
