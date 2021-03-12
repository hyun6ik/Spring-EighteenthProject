package com.example.studyMvc.web.servlet.frontcontroller.v3.controller;

import com.example.studyMvc.domain.member.Member;
import com.example.studyMvc.domain.member.MemberRepository;
import com.example.studyMvc.web.servlet.frontcontroller.ModelView;
import com.example.studyMvc.web.servlet.frontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();

        ModelView mv = new ModelView("members");
        mv.getModel().put("members", members);
        return mv;
    }
}
