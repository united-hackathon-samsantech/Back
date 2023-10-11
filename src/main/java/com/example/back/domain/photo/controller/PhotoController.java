package com.example.back.domain.photo.controller;

import com.example.back.domain.photo.service.PhotoService;
import com.example.backend.domain.photo.controller.dto.response.PhotoListResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/photo")
@RestController
public class PhotoController {
    private final PhotoService photoService;

    @GetMapping("/list/{number}")
    @ResponseStatus(HttpStatus.OK)
    public PhotoListResponse getPhotoList(@PathVariable("number") Integer number) {
        return photoService.getPhotoList(number);
    }

}