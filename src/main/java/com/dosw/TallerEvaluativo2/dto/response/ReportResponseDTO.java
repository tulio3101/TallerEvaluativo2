package com.dosw.TallerEvaluativo2.dto.response;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReportResponseDTO {

    private String title;
    private LocalDateTime generationDate;
    private String autor;
    private List<String> transaction;
    private String content;
}