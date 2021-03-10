package com.example.studyMvc.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;
    @Autowired
    private EntityManager em;

    @AfterEach
    void afterEach(){
        em.flush();
        em.clear();
    }

    @Test
    public void save() throws Exception {
        //given
        Member member = new Member("yoon", 27);
        //when
        memberRepository.save(member);
        //then
        Member findMember = memberRepository.findById(member.getId()).orElse(null);
        assertThat(findMember).isEqualTo(member);

    }
    @Test
    public void findAll() throws Exception {
        //given
        Member member1 = new Member("member1", 20);
        Member member2 = new Member("member2", 30);
        memberRepository.save(member1);
        memberRepository.save(member2);
        //when
        List<Member> result = memberRepository.findAll();
        //then
        assertThat(result.size()).isEqualTo(2);
        assertThat(result)
                .extracting("username")
                .containsExactly("member1","member2");
    }
}