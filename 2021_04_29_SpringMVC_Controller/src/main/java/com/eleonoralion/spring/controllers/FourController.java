package com.eleonoralion.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class FourController {

    @GetMapping("/four")
    public String four(@RequestParam Map<String, String> params,
                       Model model){

        model.addAttribute("params", params);

        return "four/four";
    }
}

