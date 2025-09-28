package com.dosw.TallerEvaluativo2.mapper;

import org.mapstruct.Mapper;

import com.dosw.TallerEvaluativo2.dto.request.TransactionRequestDTO;
import com.dosw.TallerEvaluativo2.dto.response.TransactionResponseDTO;
import com.dosw.TallerEvaluativo2.model.Transaction;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    Transaction toEntity(TransactionRequestDTO dto);

    TransactionResponseDTO toDto(Transaction entity);

}
