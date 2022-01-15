package com.sparta.week02_assignment.controller;

import com.sparta.week02_assignment.domain.Person;
import com.sparta.week02_assignment.domain.PersonRepository;
import com.sparta.week02_assignment.domain.PersonRequestDto;
import com.sparta.week02_assignment.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController { //요청/응답을 처리하는 부분

    private final PersonRepository personRepository;

    private final PersonService personService;

    //GET
    @GetMapping("/api/persons")
    public List<Person> getPersons(){
        return personRepository.findAll();
    }

    //POST
    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto){
        Person person = new Person(requestDto);
        return personRepository.save(person);
    }

    //PUT
    @PutMapping("api/persons/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto){
        return personService.update(id, requestDto);
    }

    //DELETE
    @DeleteMapping("/api/persons/{id}")
    public Long deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
        return id;
    }

}
