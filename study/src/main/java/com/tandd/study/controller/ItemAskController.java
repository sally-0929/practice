package com.tandd.study.controller;

import com.tandd.study.dto.ItemAskDTO;
import com.tandd.study.repository.ItemAskRepository;
import com.tandd.study.service.ItemAskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ItemAsk")
public class ItemAskController {

    @Autowired
    ItemAskService itemAskService;

    @Autowired
    ItemAskRepository itemAskRepository;

    @GetMapping("/register")
    public void reigster(){

    }

    @PostMapping("/register")
    public void register(ItemAskDTO itemAskDTO){

        itemAskRepository.save();
    }
}
