package com.sparta.week03.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();
    //수정된 날짜를 기준으로 내림차순으로 정렬하고, 찾아줘줘
}