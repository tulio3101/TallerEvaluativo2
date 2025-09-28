package com.dosw.TallerEvaluativo2.service.impl.decorators;

import com.dosw.TallerEvaluativo2.dto.request.ReportRequestDTO;
import com.dosw.TallerEvaluativo2.dto.response.ReportResponseDTO;
import com.dosw.TallerEvaluativo2.service.IReportService;
import com.dosw.TallerEvaluativo2.service.impl.ReportServiceDecorator;

import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PDFExcelDecorator extends ReportServiceDecorator {

    private static final Logger logger = Logger.getLogger(PDFExcelDecorator.class.getName());

    public PDFExcelDecorator(IReportService interfaceReport) {
        super(interfaceReport);
        logger.info("Report with Excel created");
    }

    @Override
    public ReportResponseDTO createReport(ReportRequestDTO dto) {
        return interfaceReport.createReport(dto);
    }

}