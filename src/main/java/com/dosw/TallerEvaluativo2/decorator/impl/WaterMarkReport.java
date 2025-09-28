package com.dosw.TallerEvaluativo2.decorator.impl;

import com.dosw.TallerEvaluativo2.decorator.ReportDecorator;
import com.dosw.TallerEvaluativo2.decorator.ReportInterface;

import java.util.logging.Logger;

public class WaterMarkReport extends ReportDecorator {

    private static final Logger logger = Logger.getLogger(WaterMarkReport.class.getName());

    public WaterMarkReport(ReportInterface decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public void generateReport() {
        decoratedReport.generateReport();
        logger.info("A watermark has been added to the report.");
    }

}