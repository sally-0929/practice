package com.tandd.study.controller;

import com.tandd.study.dto.ItemCategoryDTO;
import com.tandd.study.entity.ItemCategory;
import com.tandd.study.repository.ItemCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemCategoryController {
    @Autowired
    private ItemCategoryRepository itemCategoryRepository;

    @GetMapping("/categories")
    public String getCategories(Model model) {
        model.addAttribute("categories", itemCategoryRepository.findAll());
        return "categories"; // This is the name of the HTML file in the templates folder
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("itemCategoryDTO", new ItemCategoryDTO());
        return "register"; // This is the name of the form HTML file in the templates folder
    }

    @PostMapping("/register")
    public String registerCategory(@ModelAttribute ItemCategoryDTO itemCategoryDTO) {
        ItemCategory itemCategory = new ItemCategory();
        itemCategory.setCName(itemCategoryDTO.getCname());
        itemCategory.setCDesc(itemCategoryDTO.getC_desc());

        itemCategoryRepository.save(itemCategory);
        return "redirect:/categories";
    }

}
