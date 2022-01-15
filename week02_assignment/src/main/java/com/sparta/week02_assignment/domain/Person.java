package com.sparta.week02_assignment.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Person {

    @Id //Primary키로 사용하겠다는 의미
    @GeneratedValue(strategy = GenerationType.AUTO) //자동증가명령
    private Long id;

    @Column(nullable = false) //반드시 값이 존재해야함을 의미
    private String name;

    @Column(nullable = false)
    private String major;

    public Person(PersonRequestDto requestDto){
        this.name = requestDto.getName();
        this.major = requestDto.getMajor();
    }

    public Person(String name, String major){
        this.name = name;
        this.major = major;
    }

    public void update(PersonRequestDto requestDto){
        this.name = requestDto.getName();
        this.major = requestDto.getMajor();
    }

}
