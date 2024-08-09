package com.example.puzzle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GameController {

    @GetMapping("/index")
    public String showHomePage() {
        return "index";
    }

    @PostMapping("/puzzlePage")
    public String showPuzzlePage() {
        return "puzzlePage";
    }
    
}
