package com.dosw.TallerEvaluativo2.dto.request;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReportRequestDTO {

    private String id;
    private String title;
    private LocalDateTime generationDate;
    private String autor;
    private List<String> transaction;
    private String content;

}