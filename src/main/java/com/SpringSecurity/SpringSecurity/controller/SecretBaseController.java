package com.SpringSecurity.SpringSecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

    public class SecretBaseController {
        @GetMapping("/")
        public String hello() {
            return "Welcome to the SHIELD";      }

//
        @GetMapping("/avengers/assemble")
        public String avengers() {
            return "Avengers... Assemble";       }

//
        @GetMapping("/secret-bases")
        public String secretBases() {

            return "Barcelone, Berlin, Madrid, Lyon, Lille, Marseille";
        }
}
