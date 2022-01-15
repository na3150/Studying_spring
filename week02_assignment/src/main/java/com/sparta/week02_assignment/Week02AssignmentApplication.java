package com.sparta.week02_assignment;

import com.sparta.week02_assignment.domain.Person;
import com.sparta.week02_assignment.domain.PersonRepository;
import com.sparta.week02_assignment.domain.PersonRequestDto;
import com.sparta.week02_assignment.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Week02AssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week02AssignmentApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PersonRepository personRepository, PersonService personService) {
        return (args) -> {

            personRepository.save(new Person("성나영", "화학"));

            System.out.println("데이터 인쇄");
            List<Person> personList = personRepository.findAll();
            for (int i =0;i <personList.size(); i++){
                Person person = personList.get(i);
                System.out.println(person.getId());
                System.out.println(person.getName());
                System.out.println(person.getMajor());
            }

            PersonRequestDto requestDto = new PersonRequestDto("성나영", "화학");
            personService.update(1L, requestDto);
            personList = personRepository.findAll();
            for (int i=0; i<personList.size(); i++) {
                Person person = personList.get(i);
                System.out.println(person.getId());
                System.out.println(person.getName());
                System.out.println(person.getMajor());
            }

        };
    }
}
