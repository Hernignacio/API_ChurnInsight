package com.churninsight.api.controller;


import com.churninsight.api.dto.PredictionRequestDTO;
import com.churninsight.api.dto.PredictionResponseDTO;
import com.churninsight.api.service.PredictionService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/predict")
public class PredictionController {


    private final PredictionService service;

    public PredictionController(PredictionService service) {
        this.service = service;
    }

    @GetMapping("/test")
    public String test() {
        return "API OK";
    }


    @PostMapping
    public ResponseEntity<PredictionResponseDTO> predict(
            @Valid @RequestBody PredictionRequestDTO request) {

        return ResponseEntity.ok(service.predict(request));
    }
}
