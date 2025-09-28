package com.dosw.TallerEvaluativo2.service.impl;

import com.dosw.TallerEvaluativo2.dto.request.ReportRequestDTO;
import com.dosw.TallerEvaluativo2.dto.response.ReportResponseDTO;
import com.dosw.TallerEvaluativo2.service.IReportService;

public abstract class ReportServiceDecorator implements IReportService {
    protected IReportService interfaceReport;

    public ReportServiceDecorator(IReportService interfaceReport) {
        this.interfaceReport = interfaceReport;
    }

    public ReportResponseDTO createReport(ReportRequestDTO dto) {
        return interfaceReport.createReport(dto);
    }

    public ReportResponseDTO updateReport(String id, ReportRequestDTO dto) {
        return interfaceReport.updateReport(id, dto);
    }

    public void deleteReport(String id) {
        interfaceReport.deleteReport(id);
    }
}
