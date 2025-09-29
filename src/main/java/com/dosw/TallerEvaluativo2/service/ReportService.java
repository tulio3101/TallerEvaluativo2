package com.dosw.TallerEvaluativo2.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.el.stream.Optional;
import org.bson.types.ObjectId;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dosw.TallerEvaluativo2.decorator.ReportBase;
import com.dosw.TallerEvaluativo2.decorator.ReportInterface;
import com.dosw.TallerEvaluativo2.dto.request.ReportRequestDTO;
import com.dosw.TallerEvaluativo2.dto.response.ReportResponseDTO;
import com.dosw.TallerEvaluativo2.exception.ResourceNotFoundException;
import com.dosw.TallerEvaluativo2.mapper.ReportMapper;
import com.dosw.TallerEvaluativo2.model.Report;
import com.dosw.TallerEvaluativo2.repository.ReportRepository;

import lombok.RequiredArgsConstructor;

/**
 * Service responsible for managing operations related to reports
 * Contains the business logic for creating, updating, deleting, and mapping
 * reports.
 */
@Service
@RequiredArgsConstructor
public class ReportService {

    private final ReportRepository reportRepository;

    private final ReportMapper reportMapper;

    @Transactional
    /**
     * Creates a new report in the database based on the provided DTO.
     * 
     * @param dto containing the report data to create.
     * @return builder containing the created report's details.
     */
    public ReportResponseDTO createReport(ReportRequestDTO dto) {

        Report report = Report.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .generationDate(dto.getGenerationDate())
                .autor(dto.getAutor())
                .transaction(dto.getTransaction())
                .content(dto.getContent())
                .build();

        ReportInterface reportC = new ReportBase(report);

        Report saved = reportRepository.save(report);

        return ReportResponseDTO.builder()
                .title(saved.getTitle())
                .generationDate(saved.getGenerationDate())
                .autor(saved.getAutor())
                .transaction(saved.getTransaction())
                .content(saved.getContent())
                .build();

    }

    /**
     * Retrieves all reports from the database and maps them to DTOs.
     *
     * @return list of report DTOs.
     */

    public List<ReportResponseDTO> listAll() {
        List<Report> reports = reportRepository.findAll();
        return reportMapper.toDtoList(reports);
    }

}