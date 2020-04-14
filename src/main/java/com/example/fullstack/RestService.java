package com.example.fullstack;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class RestService {
    @GetMapping(value = "/")
    public ResponseEntity<String> pong()
    {
        return new ResponseEntity<String>("Réponse du serveur : " + HttpStatus.OK.name(),HttpStatus.OK);
    }
}
