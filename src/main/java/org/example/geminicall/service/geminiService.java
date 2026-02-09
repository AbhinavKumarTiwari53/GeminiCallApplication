package org.example.geminicall.service;

import org.example.geminicall.model.geminiModel;
import org.example.geminicall.repository.geminiRepository;
import org.springframework.stereotype.Service;

@Service
public class geminiService {

    private final geminiRepository repository;

    public geminiService(geminiRepository repository) {
        this.repository = repository;
    }

    public geminiModel addRequest(geminiModel req) {
        return repository.save(req);
    }
}
