package com.university.disi.repository.loginRepository;
import com.university.disi.entity.loginEntity.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TouristRepository extends JpaRepository<Tourist, Integer> {

//    Caregiver findByFirstName(String firstName);

}