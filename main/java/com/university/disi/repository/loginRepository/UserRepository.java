package com.university.disi.repository.loginRepository;

import com.university.disi.entity.loginEntity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByUsername(String username);
//    public  User findByIdPatient(String idPatient);



}