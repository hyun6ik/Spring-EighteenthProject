package com.example.studyMvc.domain.member;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Getter @Setter
public class Member {

    private Long id;
    private String username;
    private int age;

    public Member(){

    }

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
