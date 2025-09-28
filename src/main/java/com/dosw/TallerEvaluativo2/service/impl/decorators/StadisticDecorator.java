package com.dosw.TallerEvaluativo2.service.impl.decorators;

import com.dosw.TallerEvaluativo2.service.IReportService;
import com.dosw.TallerEvaluativo2.service.impl.ReportServiceDecorator;

import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.dosw.TallerEvaluativo2.dto.request.ReportRequestDTO;
import com.dosw.TallerEvaluativo2.dto.response.ReportResponseDTO;

@Service("StadisticDecorator")
@Slf4j
public class StadisticDecorator extends ReportServiceDecorator {
    private static final Logger logger = Logger.getLogger(StadisticDecorator.class.getName());

    public StadisticDecorator(@Qualifier("ReportServiceDecorator")IReportService interfaceReport) {
        super(interfaceReport);
        logger.info("Report with Stadistics created");
    }

    @Override
    public ReportResponseDTO createReport(ReportRequestDTO dto) {
        return interfaceReport.createReport(dto);
    }

}