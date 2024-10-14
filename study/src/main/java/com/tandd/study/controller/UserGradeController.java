package com.tandd.study.controller;


import com.tandd.study.dto.UserGradeDTO;
import com.tandd.study.status.UserGradeName;
import com.tandd.study.repository.UserGradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grade")
public class UserGradeController {

    @Autowired
    private UserGradeRepository userGradeRepository;

    // 사용자 등급 등록 페이지
    @GetMapping("/register")
    public String showRegisterPage(Model model) {
        model.addAttribute("userGradeDTO", new UserGradeDTO());
        model.addAttribute("grades", UserGradeName.values()); // 수정된 부분
        return "register";
    }
}