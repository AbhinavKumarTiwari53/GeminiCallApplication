package org.example.geminicall.repository;

import org.example.geminicall.model.geminiModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface geminiRepository extends MongoRepository <geminiModel, String> {
}
