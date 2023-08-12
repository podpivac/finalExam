package com.example.finalexam.web;

import com.example.finalexam.entities.Items;
import com.example.finalexam.entities.Sales;
import com.example.finalexam.repositories.ItemsRepository;
import com.example.finalexam.repositories.SalesRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigInteger;
import java.util.List;
import java.util.Random;

@Controller
@AllArgsConstructor
public class MainController {

    @Autowired
    private final ItemsRepository itemsRepository;

    @Autowired
    private final SalesRepository salesRepository;

    @GetMapping(path = "/")
    public String displayFrontPage(Model model) {
        List<Items> itemsList = itemsRepository.findAll();
        model.addAttribute("itemsList", itemsList);
        return "frontPage";
    }

    @PostMapping("/save")
    public String saveSales(@ModelAttribute Sales sales) {
        BigInteger id = new BigInteger(64, new Random());
        sales.setId(id);
        salesRepository.save(sales);
        return "redirect:/";
    }
}
