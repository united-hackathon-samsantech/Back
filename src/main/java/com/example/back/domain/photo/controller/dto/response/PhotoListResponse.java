package com.example.back.domain.photo.controller.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter

public class PhotoListResponse {
    private final List<String> photoList;
}
