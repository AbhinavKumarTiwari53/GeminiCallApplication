package org.example.geminicall.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@Document(collection = "gemini")
public class geminiModel {
    @Id
    private String id;
    private String request;
    private String response;
}
