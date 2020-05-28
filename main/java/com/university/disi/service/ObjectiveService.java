package com.university.disi.service;



import com.university.disi.dto.ObjectiveDTO;
import com.university.disi.dto.ObjectiveFilterDTO;
import com.university.disi.entity.Objective;

import java.util.List;

public interface ObjectiveService {

    Objective save(ObjectiveDTO obj);
    List<Objective> findAll();
    void delete(int id);
    Objective findById(int id);
    ObjectiveDTO update(ObjectiveDTO objectivDTO);
    List<Objective> searchObjectives(ObjectiveFilterDTO objectiveFilterDTO);
}
