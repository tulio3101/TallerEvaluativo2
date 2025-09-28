package com.dosw.TallerEvaluativo2.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Transaction {
    @Id
    private String id;
    private String author;
    private double amount;
    private String description;
    private LocalDateTime generationTime;
}