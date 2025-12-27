package com.churninsight.api.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class PredictionRequestDTO {
    @NotNull(message = "El tiempo de contrato es obligatorio")
    @Min(value = 0, message = "El tiempo de contrato no puede ser negativo")
    private Integer tiempoContratoMeses;

    @NotNull(message = "Los retrasos de pago son obligatorios")
    @Min(value = 0, message = "Los retrasos no pueden ser negativos")
    private Integer retrasosPago;

    @NotNull(message = "El uso mensual es obligatorio")
    @Positive(message = "El uso mensual debe ser mayor a cero")
    private Double usoMensual;

    @NotBlank(message = "El plan es obligatorio")
    private String plan;
}
