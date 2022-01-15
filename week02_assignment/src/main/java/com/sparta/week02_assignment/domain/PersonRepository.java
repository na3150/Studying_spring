package com.sparta.week02_assignment.domain;

import org.springframework.data.jpa.repository.JpaRepository;


//< , > -> 어떤 걸 대상으로 어떤 걸 식별할 건지, Long -> 클래스의 id를 의미
public interface PersonRepository  extends JpaRepository<Person, Long> {
}
