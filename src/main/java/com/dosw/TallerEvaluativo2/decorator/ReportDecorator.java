package com.dosw.TallerEvaluativo2.decorator;

public abstract class ReportDecorator implements ReportInterface {

    protected ReportInterface decoratedReport;

    public ReportDecorator(ReportInterface decoratedReport) {
        this.decoratedReport = decoratedReport;

    }

    @Override
    public void generateReport() {
        decoratedReport.generateReport();
    }

}
