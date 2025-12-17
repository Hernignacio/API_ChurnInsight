package com.churninsight.api.service;


import com.churninsight.api.dto.PredictionRequestDTO;
import com.churninsight.api.dto.PredictionResponseDTO;
import org.springframework.stereotype.Service;

@Service
public class PredictionService {

    public PredictionResponseDTO predict(PredictionRequestDTO request) {

        boolean altoRiesgo =
                request.getRetrasosPago() > 2 ||
                        request.getTiempoContratoMeses() < 6 ||
                        request.getUsoMensual() < 10;

        if (altoRiesgo) {
            return new PredictionResponseDTO(
                    "Va a cancelar",
                    0.75
            );
        } else {
            return new PredictionResponseDTO(
                    "Va a continuar",
                    0.15
            );
        }
    }
}
