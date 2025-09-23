package com.dosw.TallerEvaluativo2.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document(collection = "reportes")
@Data
@Builder
public class Reporte{
    @Id 
    private String id;
    private String titulo;
    private LocalDateTime fechaDeGeneracion;
    private String autor;
    private List<Transaccion> transacciones;
    private String descripcion;
}