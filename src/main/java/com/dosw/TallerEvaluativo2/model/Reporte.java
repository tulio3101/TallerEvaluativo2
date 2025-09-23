package com.dosw.TallerEvaluativo2.model;

import java.time.LocalDateTime;
import java.util.List;


import lombok.Builder;
import lombok.Data;

@Document(collection = "reportes")
@Data
@Builder
public class Reporte{
    private String titulo;
    private LocalDateTime fechaDeGeneracion;
    private String autor;
    private List<Transaccion> transacciones;
    private String descripcion;
}