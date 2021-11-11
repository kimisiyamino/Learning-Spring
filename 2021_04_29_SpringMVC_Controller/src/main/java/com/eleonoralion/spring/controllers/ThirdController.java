package com.eleonoralion.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class ThirdController {

    // Внедрение HttpServletRequest и HttpServletResponse спрингом, тест параметров
    @GetMapping("/name1")
    public String testParamsHttp(HttpServletRequest request, HttpServletResponse response){
        try {
            String name = request.getParameter("name");
            String id = request.getParameter("id");

            if(name == null){
                name = "NULL";
            }
            if(id == null){
                id = "NULL";
            }

            PrintWriter p = response.getWriter();
            p.write(name);
            p.write(" ");
            p.write(id);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "third/name";
    }

    // Аннотация @RequestParam, параметр required
    @GetMapping("/name2")
    public String testParamsAnnotations(@RequestParam(value = "name", required = false) String name,
                                 @RequestParam(value = "id", required = false) String id){

        System.out.println(name + " " + id);
        return "third/name";
    }


    // Model - Самостоятельная работа
//    @GetMapping("/calc")
//    public String testParamsModel(@RequestParam("num1") String num1,
//                                  @RequestParam("num2") String num2,
//                                  @RequestParam("action") String action,
//                                  Model model){
//        model.addAttribute("num1", num1);
//        model.addAttribute("num2", num2);
//        model.addAttribute("action", action);
//
//
//        int inum1 = Integer.parseInt(num1);
//        int inum2 = Integer.parseInt(num2);
//
//        // add, sub, mult, div
//        switch (action){
//            case "add": model.addAttribute("result", inum1+inum2); break;
//            case "sub": model.addAttribute("result", inum1-inum2); break;
//            case "mult": model.addAttribute("result", inum1*inum2); break;
//            case "div": model.addAttribute("result", inum1/inum2); break;
//            default: model.addAttribute("result", 0); break;
//        }
//
//        return "third/calc";
//    }

    // Model - Решение
    @GetMapping("/calc")
    public String testParamsModel(@RequestParam("num1") int num1,
                                  @RequestParam("num2") int num2,
                                  @RequestParam("action") String action,
                                  Model model){
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("action", action);

        int result = 0;
        // add, sub, mult, div
        switch (action){
            case "add": result=num1+num2; break;
            case "sub": result=num1-num2; break;
            case "mult": result=num1*num2; break;
            case "div": result=num1/num2; break;
        }

        model.addAttribute("result", result);

        return "third/calc";
    }

}
