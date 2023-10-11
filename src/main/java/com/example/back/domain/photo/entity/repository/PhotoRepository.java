package com.example.back.domain.photo.entity.repository;

import com.example.back.domain.photo.entity.Photo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhotoRepository extends CrudRepository<Photo, Long> {
    List<Photo> findAllByPersonnel(Integer number);
}
