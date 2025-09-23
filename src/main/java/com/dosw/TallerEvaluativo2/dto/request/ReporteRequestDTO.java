package com.dosw.TallerEvaluativo2.dto.request;

import java.time.LocalDateTime;
import java.util.List;

import com.dosw.TallerEvaluativo2.model.Transaccion;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReporteRequestDTO{
    private String id;
    private String titulo;
    private LocalDateTime fechaDeGeneracion;
    private String autor;
    private List<Transaccion> transacciones;
    private String descripcion;
}