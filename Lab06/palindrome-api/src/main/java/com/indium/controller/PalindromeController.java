package com.indium.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;


@RestController
public class PalindromeController {

    @GetMapping("/word/{word}")
    public boolean isPalindrome(@PathVariable String word) {
        String reverse = new StringBuilder(word).reverse().toString();
        return word.equals(reverse);
    }
}