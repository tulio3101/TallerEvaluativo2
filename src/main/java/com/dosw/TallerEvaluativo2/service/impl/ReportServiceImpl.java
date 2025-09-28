package com.dosw.TallerEvaluativo2.service.impl;

import org.apache.el.stream.Optional;
import org.bson.types.ObjectId;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.dosw.TallerEvaluativo2.dto.request.ReportRequestDTO;
import com.dosw.TallerEvaluativo2.dto.response.ReportResponseDTO;
import com.dosw.TallerEvaluativo2.exception.ResourceNotFoundException;
import com.dosw.TallerEvaluativo2.mapper.TransactionMapper;
import com.dosw.TallerEvaluativo2.model.Report;
import com.dosw.TallerEvaluativo2.repository.ReportRepository;
import com.dosw.TallerEvaluativo2.service.IReportService;

import lombok.RequiredArgsConstructor;

/**
 * Service responsible for managing operations related to reports
 * Contains the business logic for creating, updating, deleting, and mapping
 * reports.
 */
@Service
@Primary
@RequiredArgsConstructor
public class ReportServiceImpl implements IReportService {

    private final ReportRepository reportRepository;

    private final TransactionMapper transactionMapper;

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
                .transaction(transactionMapper.toEntity(dto.getTransaction()))
                .description(dto.getDescription())
                .build();

        Report saved = reportRepository.save(report);

        return ReportResponseDTO.builder()
                .title(saved.getTitle())
                .generationDate(saved.getGenerationDate())
                .autor(saved.getAutor())
                .transaction(transactionMapper.toDto(saved.getTransaction()))
                .description(saved.getDescription())
                .build();

    }

    /**
     * Updates an existing report in the database.
     * 
     * @param id  unique identifier of the report to update.
     * @param dto containing the new data.
     * @return a with the updated report's details.
     * @throws ResourceNotFoundException if no report exists with the given ID.
     */
    public ReportResponseDTO updateReport(String id, ReportRequestDTO dto) {
        Report report = reportRepository.findById(id).orElseThrow(() -> ResourceNotFoundException.create("ID", id));
        report.setId(dto.getId());
        report.setTitle(dto.getTitle());
        report.setAutor(dto.getAutor());
        report.setTransaction(transactionMapper.toEntity(dto.getTransaction()));
        report.setDescription(dto.getDescription());
        report.setGenerationDate(dto.getGenerationDate());
        Report updatedReport = reportRepository.save(report);
        return ReportResponseDTO.builder()
                .title(updatedReport.getTitle())
                .generationDate(updatedReport.getGenerationDate())
                .autor(updatedReport.getAutor())
                .transaction(transactionMapper.toDto(updatedReport.getTransaction()))
                .description(updatedReport.getDescription())
                .build();
    }

    /**
     * Deletes an existing report from the database.
     * 
     * @param id unique identifier of the report to delete.
     * @throws ResourceNotFoundException if no report exists with the given ID.
     */
    public void deleteReport(String id) {
        if (!reportRepository.existsById(id)) {
            throw ResourceNotFoundException.create("ID", id);
        }
        reportRepository.deleteById(id);
    }

}