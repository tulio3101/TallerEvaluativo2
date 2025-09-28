package com.dosw.TallerEvaluativo2.dto.request;

import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Builder
public class TransactionRequestDTO {
    private String id;
    private String title;
    private LocalDateTime generationDate;
    private String autor;
    private String description;
}