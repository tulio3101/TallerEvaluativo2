package com.dosw.TallerEvaluativo2.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dosw.TallerEvaluativo2.dto.request.ReportRequestDTO;
import com.dosw.TallerEvaluativo2.dto.response.ReportResponseDTO;

import com.dosw.TallerEvaluativo2.service.ReportService;

import org.springframework.web.bind.annotation.RequestBody;

import lombok.RequiredArgsConstructor;

/**
 * REST controller for managing reports.
 */
@RestController
@RequestMapping("/reports")
@RequiredArgsConstructor
public class ReportController {

    private final ReportService reportService;

    /**
     * Creates a new report.
     *
     * @param report report data to create
     * @return created report with status 201
     */
    @PostMapping("")
    public ResponseEntity<ReportResponseDTO> createReport(@RequestBody ReportRequestDTO report) {

        System.out.println(report);

        ReportResponseDTO created = reportService.createReport(report);

        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    /**
     * Retrieves all reports.
     *
     * @return list of reports
     */
    @GetMapping("/allReports")
    public ResponseEntity<List<ReportResponseDTO>> getAllReports() {

        List<ReportResponseDTO> reports = reportService.listAll();

        return ResponseEntity.ok(reports);
    }

}