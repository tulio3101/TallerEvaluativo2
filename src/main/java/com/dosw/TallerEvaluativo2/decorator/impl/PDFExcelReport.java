package com.dosw.TallerEvaluativo2.decorator.impl;

import com.dosw.TallerEvaluativo2.decorator.ReportDecorator;
import com.dosw.TallerEvaluativo2.decorator.ReportInterface;

import java.util.logging.Logger;

public class PDFExcelReport extends ReportDecorator {

    private static final Logger logger = Logger.getLogger(PDFExcelReport.class.getName());

    public PDFExcelReport(ReportInterface decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public void generateReport() {
        decoratedReport.generateReport();
        logger.info("PDFExcel has been added to the report.");

    }

}