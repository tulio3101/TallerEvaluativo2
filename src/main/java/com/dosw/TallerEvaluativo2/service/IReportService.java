package com.dosw.TallerEvaluativo2.service;

import com.dosw.TallerEvaluativo2.dto.response.ReportResponseDTO;
import com.dosw.TallerEvaluativo2.dto.request.ReportRequestDTO;

public interface IReportService {

    ReportResponseDTO createReport(ReportRequestDTO dto);

    ReportResponseDTO updateReport(String id, ReportRequestDTO reportRequestDTO);

    void deleteReport(String id);
}
