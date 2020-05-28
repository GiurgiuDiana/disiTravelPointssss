package com.university.disi.service.impl;

import com.university.disi.dto.DescriptionDTO;
import com.university.disi.entity.Description;
import com.university.disi.entity.Objective;
import com.university.disi.repository.DescriptionRepository;
import com.university.disi.repository.ObjectiveRepository;
import com.university.disi.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service(value = "registeredDescriptionService")
public class DescriptionServiceImpl implements DescriptionService{

    @Autowired
    private DescriptionRepository registeredDescriptionRepository;

    @Autowired
    private ObjectiveRepository objectiveRepository;


    @Override
    public Description save(DescriptionDTO obj) {
        Description newObj= new Description();

        newObj.setText(obj.getText());
        newObj.setOffer(obj.getOffer());
        newObj.setPrice(obj.getPrice());

        Optional<Objective> objective = Optional.of(new Objective());
        objective =  objectiveRepository.findById(obj.getObjectiveId());
        Objective obiectiv = objective.isPresent() ? objective.get() : null;
        newObj.setObjective(obiectiv);

//        Optional<ObjectiveDTO> optionalObjective = objectiveRepository.findById(obj.getObjectiveId());
//        ObjectiveDTO objective = optionalObjective.isPresent() ? optionalObjective.get() : null;
//        //newObj.setObjective(objective);

        return registeredDescriptionRepository.save(newObj);
    }

    @Override
    public List<Description> findAll() {
        List<Description> listDescription = new ArrayList<>();
        return registeredDescriptionRepository.findAll();
    }

    @Override
    public void delete(int id) {
        registeredDescriptionRepository.deleteById(id);

    }

    @Override
    public Description findById(int id) {
        Optional<Description> optionalDescription = registeredDescriptionRepository.findById(id);
        return optionalDescription.isPresent() ? optionalDescription.get() : null;
    }

    @Override
    public void update(int id, DescriptionDTO descriptionDTO) {
        Optional<Description> descriptionToBeUpdated = registeredDescriptionRepository.findById(id);
        descriptionToBeUpdated.get().setText(descriptionDTO.getText());
        descriptionToBeUpdated.get().setOffer(descriptionDTO.getOffer());
        descriptionToBeUpdated.get().setPrice(descriptionDTO.getPrice());
        registeredDescriptionRepository.save(descriptionToBeUpdated.get());
    }
}


