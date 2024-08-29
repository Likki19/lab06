package com.indium.service;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WordService {
    private RestTemplate restTemplate = new RestTemplate();

    @Value("${palindrome-api.base-url}")
    private String palindromeApiBaseUrl;

    public String isPalindrome(String word) {
        // Code to connect to palindrome-api goes here
        String palindromeApiUrl = "http://localhost:8081/word/" + word;
        ResponseEntity<Boolean> result = restTemplate.getForEntity(palindromeApiUrl, Boolean.class);
        if (result.getBody()) {
            return word + " is a palindrome";
        }
        return word + " is not a palindrome";
    }
}