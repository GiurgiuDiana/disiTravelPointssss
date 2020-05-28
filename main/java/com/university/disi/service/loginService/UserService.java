package com.university.disi.service.loginService;

import com.university.disi.dto.loginDTO.AdminDTO;
import com.university.disi.dto.loginDTO.UserDTO;
import com.university.disi.entity.loginEntity.User;

import java.util.List;

public interface UserService {

    User save(UserDTO user);
    List<User> findAll();
    void delete(int id);

    // List<User> findByCaregiver_idCaregiver(Caregiver caregiver_idCaregiver);
//    User findOne(String firstname);

    User findById(int id);

    User findByUsername(String username,String password);

    UserDTO update(UserDTO userDto);

    User findByIdPatient(String idPatient);


}
