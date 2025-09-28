package com.dosw.TallerEvaluativo2.decorator.impl;

import com.dosw.TallerEvaluativo2.decorator.ReportDecorator;
import com.dosw.TallerEvaluativo2.decorator.ReportInterface;
import java.util.logging.Logger;

public class StadisticReport extends ReportDecorator {

    private static final Logger logger = Logger.getLogger(StadisticReport.class.getName());

    public StadisticReport(ReportInterface decoratedReport) {
        super(decoratedReport);
    }

    @Override
    public void generateReport() {
        decoratedReport.generateReport();
        logger.info("Statitics has been added to the report.");
    }
}