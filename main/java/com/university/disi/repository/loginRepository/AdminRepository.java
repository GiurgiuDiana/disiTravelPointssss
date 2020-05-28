package com.university.disi.repository.loginRepository;

import com.university.disi.entity.loginEntity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

//    Caregiver findByFirstName(String firstName);

}