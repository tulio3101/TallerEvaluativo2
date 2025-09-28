package com.dosw.TallerEvaluativo2.dto.response;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TransactionResponseDTO {

    private String author;
    private double amount;
    private String description;
    private LocalDateTime generationTime;

}
