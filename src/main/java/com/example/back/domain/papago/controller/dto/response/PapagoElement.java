package com.example.back.domain.papago.controller.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
public class PapagoElement {
    private final String type;

    private final String service;

    private final String version;

    private final List<String> result;
}
