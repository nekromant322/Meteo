package com.example.meteo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mail")
public class MailController {

    @GetMapping("/sendMail")
    public String showSendPage(){
        return "sendMail";
    }

    @PostMapping("/sendMail")
    public ModelAndView sendEmail(String email, String message){
        System.out.println(email);
        System.out.println(message);
        ModelAndView modelAndView = new ModelAndView();
        if(true) {
            modelAndView.addObject("status", "Sent success");
        } else {
            modelAndView.addObject("status","An error happened");
        }
        modelAndView.setViewName("sendMail");
        return modelAndView;
    }

    @GetMapping("/receiveMail")
    public String showReceivePage(){
        return "receiveMail";
    }
}
