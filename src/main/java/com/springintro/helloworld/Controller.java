package com.springintro.helloworld;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/web")
    public String print(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        return "hello";
    }
}
