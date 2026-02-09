package org.example.geminicall.controller;

import org.example.geminicall.model.geminiModel;
import org.example.geminicall.service.geminiService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class geminiController {

    private final geminiService service;

    public geminiController(geminiService service) {
        this.service = service;
    }

    @PostMapping("/add-request")
    public geminiModel addStart(@RequestBody geminiModel req) {// creates object of data with the help of @requestBody
        return service.addRequest(req);
    }
}
