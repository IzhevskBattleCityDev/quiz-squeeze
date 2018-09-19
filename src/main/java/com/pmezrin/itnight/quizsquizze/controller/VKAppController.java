package com.pmezrin.itnight.quizsquizze.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VKAppController {

    @GetMapping("/quiz/vk/start")
    public @ResponseBody String startQuiz(@RequestParam(name = "api_url", required = false) String api_url) {
        return "You came from " + api_url;
    }

}
