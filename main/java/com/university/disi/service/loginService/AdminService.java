package com.university.disi.service.loginService;

import com.university.disi.dto.loginDTO.AdminDTO;
import com.university.disi.entity.loginEntity.Admin;

import java.util.List;

public interface AdminService {

    Admin save(AdminDTO admin);
    List<Admin> findAll();
    void delete(int id);

    // List<Admin> findByCaregiver_idCaregiver(Caregiver caregiver_idCaregiver);
//    Admin findOne(String firstname);

    Admin findById(int id);

    AdminDTO update(AdminDTO adminDto);

//    Admin findByIdPatient(String idPatient);
}
