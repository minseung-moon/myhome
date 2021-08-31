package com.example.myhome.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Model 임을 선언하는 어노테이션
@Data
public class Board {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동증가
    private Long id;
    private  String title;
    private String content;
}
