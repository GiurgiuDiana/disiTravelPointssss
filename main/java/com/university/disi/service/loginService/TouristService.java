package com.university.disi.service.loginService;

import com.university.disi.dto.loginDTO.TouristDTO;
import com.university.disi.entity.loginEntity.Tourist;

import java.util.List;

public interface TouristService {
    Tourist save(TouristDTO tourist);
    List<Tourist> findAll();
    void delete(int id);

    // List<Tourist> findByCaregiver_idCaregiver(Caregiver caregiver_idCaregiver);
//    Tourist findOne(String firstname);

    Tourist findById(int id);

    Tourist findByTouristname(String touristname,String password);

    TouristDTO update(TouristDTO touristDto);

    Tourist findByIdPatient(String idPatient);
}
