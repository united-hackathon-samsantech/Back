package com.example.back.domain.papago.controller;

import com.example.back.domain.papago.controller.dto.request.PapagoRequest;
import com.example.back.domain.papago.service.PapagoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class PapagoController {
    private final PapagoService papagoService;

    @PostMapping
    public String getTransSentence(@RequestBody PapagoRequest request) {
        return papagoService.getTransSentence(request);
    }
}
