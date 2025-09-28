package com.dosw.TallerEvaluativo2.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dosw.TallerEvaluativo2.dto.request.ReportRequestDTO;
import com.dosw.TallerEvaluativo2.dto.response.ReportResponseDTO;
import com.dosw.TallerEvaluativo2.service.IReportService;

@Service("ReportServiceDecorator")
public abstract class ReportServiceDecorator implements IReportService {
    protected IReportService interfaceReport;

    public ReportServiceDecorator(@Qualifier("ReportServiceImpl")IReportService interfaceReport) {
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
