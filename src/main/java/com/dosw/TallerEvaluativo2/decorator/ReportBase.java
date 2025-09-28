package com.dosw.TallerEvaluativo2.decorator;

import java.util.logging.Logger;

import com.dosw.TallerEvaluativo2.decorator.impl.PDFExcelReport;
import com.dosw.TallerEvaluativo2.model.Report;

public class ReportBase implements ReportInterface {

    private static final Logger logger = Logger.getLogger(ReportBase.class.getName());

    private Report report;

    public ReportBase(Report report) {
        this.report = report;
    }

    public void generateReport() {
        logger.info("A Report has been created");
    }
}
