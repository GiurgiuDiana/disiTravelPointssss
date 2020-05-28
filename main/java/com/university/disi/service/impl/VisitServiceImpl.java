package com.university.disi.service.impl;

import com.university.disi.dto.VisitDTO;
import com.university.disi.entity.Objective;
import com.university.disi.entity.Visit;
import com.university.disi.entity.loginEntity.Tourist;
import com.university.disi.repository.ObjectiveRepository;
import com.university.disi.repository.VisitRepository;
import com.university.disi.repository.loginRepository.TouristRepository;
import com.university.disi.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service(value = "registeredVisitService")
public class VisitServiceImpl implements VisitService {
    @Autowired
    private VisitRepository registeredVisitRepository;

    @Autowired
    private ObjectiveRepository objectiveRepository;

    @Autowired
    private TouristRepository touristRepository;

    @Override
    public Visit save(VisitDTO visitDTO) {
        Visit newObj= new Visit();

        newObj.setDate(visitDTO.getDate());

        Optional<Tourist> optionalTourist = touristRepository.findById(visitDTO.getTouristId());
        Tourist tourist = optionalTourist.isPresent() ? optionalTourist.get() : null;
        newObj.setTourist(tourist);

        Optional<Objective> objective = Optional.of(new Objective());
        objective =  objectiveRepository.findById(visitDTO.getObjectiveId());
        Objective obiectiv = objective.isPresent() ? objective.get() : null;
        newObj.setObjective(obiectiv);

        return registeredVisitRepository.save(newObj);
    }

    @Override
    public List<Visit> findAll() {
        List<Visit> listVisits = new ArrayList<>();
        return registeredVisitRepository.findAll();    }

    @Override
    public Visit findById(int id) {
        Optional<Visit> optionalVisit = registeredVisitRepository.findById(id);
        return optionalVisit.isPresent() ? optionalVisit.get() : null;    }
}
