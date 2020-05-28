package com.university.disi.service;

import com.university.disi.dto.VisitDTO;
import com.university.disi.entity.Visit;

import java.util.List;

public interface VisitService {
    Visit save(VisitDTO visitDTO);
    List<Visit> findAll();
    Visit findById(int id);
}
