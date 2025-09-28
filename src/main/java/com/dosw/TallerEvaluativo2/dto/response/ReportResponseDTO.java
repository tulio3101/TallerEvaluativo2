package com.dosw.TallerEvaluativo2.dto.response;

import java.time.LocalDateTime;
import java.util.List;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReportResponseDTO {

    private String title;
    private LocalDateTime generationDate;
    private String autor;
    private List<String> transaction;
    private String content;
}