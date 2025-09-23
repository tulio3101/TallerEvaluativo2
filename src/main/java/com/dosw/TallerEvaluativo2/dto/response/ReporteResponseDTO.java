package com.dosw.TallerEvaluativo2.dto.request;

@Data
@Builder
public class ReporteResponseDTO{
    private String titulo;
    private LocalDateTime fechaDeGeneracion;
    private String autor;
    private List<Transaccion> transacciones;
    private String descripcion;
}