package com.tandd.study.controller;

import com.tandd.study.dto.ItemDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/study")
public class ItemController {

    @GetMapping("/list")
    public void List(Model model){

    }

    @GetMapping("/register")
    public void register(){}

    @PostMapping("/register")
    public String register(ItemDTO itemDTO, RedirectAttributes redirectAttributes){

    }
}
