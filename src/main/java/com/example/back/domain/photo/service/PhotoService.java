package com.example.back.domain.photo.service;

import com.example.back.domain.photo.entity.Photo;
import com.example.back.domain.photo.entity.repository.PhotoRepository;
import com.example.backend.domain.photo.controller.dto.response.PhotoListResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PhotoService {
    private final PhotoRepository photoRepository;

    public PhotoListResponse getPhotoList(Integer number) {
         List<Photo> photoList = photoRepository.findAllByPersonnel(number);

         List<String> imageList = photoList.stream().map(photo -> photo.getImageUrl()).toList();
         return new PhotoListResponse(imageList);
    }
}
