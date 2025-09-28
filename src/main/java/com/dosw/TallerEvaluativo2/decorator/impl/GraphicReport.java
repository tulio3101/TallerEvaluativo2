package com.dosw.TallerEvaluativo2.decorator.impl;

import com.dosw.TallerEvaluativo2.decorator.ReportDecorator;
import com.dosw.TallerEvaluativo2.decorator.ReportInterface;

import java.util.logging.Logger;

public class GraphicReport extends ReportDecorator {

    private static final Logger logger = Logger.getLogger(GraphicReport.class.getName());

    public GraphicReport(ReportInterface decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public void generateReport() {
        decoratedReport.generateReport();
        logger.info("Graphics has been added to the report.");

    }

}