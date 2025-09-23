package com.dosw.TallerEvaluativo2.model;

import lombok.Builder;
import lombok.Data;

@Document(collection = "transacciones")
@Builder
@Data
public class Transaccion{
    @Id
    private String id;
}