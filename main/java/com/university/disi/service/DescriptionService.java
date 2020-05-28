package com.university.disi.service;

import com.university.disi.dto.DescriptionDTO;
import com.university.disi.entity.Description;

import java.util.List;

public interface DescriptionService {
    Description save(DescriptionDTO descriptionDTO);
    List<Description> findAll();
    void delete(int id);
    Description findById(int id);
    void update(int id, DescriptionDTO descriptionDTO);
}
