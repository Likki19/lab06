package com.indium.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



import com.indium.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
    @Autowired
    private WordService wordService;

    @GetMapping("/palindrome/{word}")
    public String isPalindrome(@PathVariable String word) {
        return wordService.isPalindrome(word);
    }
}