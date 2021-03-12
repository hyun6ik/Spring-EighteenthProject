package com.example.studyMvc.web.servlet.frontcontroller.v3;

import com.example.studyMvc.web.servlet.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    ModelView process(Map<String, String> paramMap);
}
