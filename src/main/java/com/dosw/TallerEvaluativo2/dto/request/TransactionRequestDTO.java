package com.dosw.TallerEvaluativo2.dto.request;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder
public class TransactionRequestDTO {
    private String id;
    private String author;
    private double amount;
    private String description;
    private LocalDateTime generationTime;
}