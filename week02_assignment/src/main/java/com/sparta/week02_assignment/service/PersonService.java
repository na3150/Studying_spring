package com.sparta.week02_assignment.service;

import com.sparta.week02_assignment.domain.Person;
import com.sparta.week02_assignment.domain.PersonRepository;
import com.sparta.week02_assignment.domain.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

//중간 부분, 실제 중요한 작동이 많이 일어나는 부분
@RequiredArgsConstructor
@Service //이 클래스는 서비스임을 명시
public class PersonService {

    private final PersonRepository personRepository;

    @Transactional // SQL 쿼리가 일어나야 함을 스프링에게 알려줌
    public  Long update(Long id, PersonRequestDto requestDto) {
        Person person1 = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        person1.update(requestDto);
        return person1.getId();
    }
}
