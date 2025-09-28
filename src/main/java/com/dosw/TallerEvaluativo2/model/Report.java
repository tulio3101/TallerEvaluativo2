package com.dosw.TallerEvaluativo2.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document(collection = "reports")
@Data
@Builder
public class Report {
    @Id
    private String id;
    private String title;
    private LocalDateTime generationDate;
    private String autor;
    private List<String> transaction;
    private String content;
}