package com.dosw.TallerEvaluativo2.dto.request;

import java.time.LocalDateTime;
import java.util.List;

import com.dosw.TallerEvaluativo2.model.Transaction;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReportRequestDTO {
    private String id;
    private String title;
    private LocalDateTime generationDate;
    private String autor;
    private TransactionRequestDTO transaction;
    private String description;
}