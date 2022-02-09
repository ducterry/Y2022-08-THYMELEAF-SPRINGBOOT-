package com.ndangducbn.thymeleaf.controller;


import com.ndangducbn.thymeleaf.data.FakeData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

    @RequestMapping("/account")
    public String index(Model model) {
        model.addAttribute("accountList", FakeData.data);
        return "account";
    }
}
