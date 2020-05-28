package com.university.disi.service.loginService.impl;

import com.university.disi.dto.loginDTO.TouristDTO;
import com.university.disi.entity.loginEntity.Tourist;
import com.university.disi.entity.loginEntity.User;
import com.university.disi.repository.loginRepository.TouristRepository;
import com.university.disi.repository.loginRepository.UserRepository;
import com.university.disi.service.loginService.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service(value = "touristService")
public class TouristServiceImpl implements TouristService {

    @Autowired
    private TouristRepository registeredTouristRepository;

    @Autowired
    private UserRepository userRepository;
    // private CaregiverDao caregiverDao;

    public List<Tourist> findAll() {
        List<Tourist> list = new ArrayList<>();
        //registeredTouristDao.findAll().iterator().forEachRemaining(list::add);
        return registeredTouristRepository.findAll();
    }

    @Override
    public void delete(int id) {
        registeredTouristRepository.deleteById(id);
    }


//@PersistenceContext
//private EntityManager entityManager;
//
//    @SuppressWarnings("unchecked")
//    @Override
//    public  List<Tourist> findByCaregiver_idCaregiver(Caregiver caregiver) {
//
//        return this.entityManager.
//                createQuery("select e from registeredTourist e where e.registeredTourist_id like '"+caregiver.getId()+"'").
//                getResultList();
//        List<Tourist> list = new ArrayList<>();
//
//        registeredTouristDao.findByCaregiver(caregiver).iterator().forEachRemaining(list::add);
//
//        Optional<Caregiver> optionalCaregiver = caregiverDao.findById(caregiver.getId());
//        caregiver = optionalCaregiver.isPresent() ? optionalCaregiver.get() : null;
//        if (caregiver != null) {
//            return (List<Tourist>) registeredTouristDao.findByCaregiver(caregiver);
//        }
//        return null;

    //  }


    @Override
    public Tourist findById(int id) {
        Optional<Tourist> optionalTourist = registeredTouristRepository.findById(id);
        return optionalTourist.isPresent() ? optionalTourist.get() : null;
    }

    @Override
    public Tourist findByTouristname(String touristname, String password) {
        return null;
    }

//    @Override
//    public Tourist findByTouristname(String registeredTouristname,String password) {
//        Tourist findTourist =  registeredTouristDao.findByTouristname(registeredTouristname);
//        Tourist findTourist2 =  new Tourist();
//        findTourist2.setPassword(findTourist.getPassword());
//        findTourist2.setTouristname(findTourist.getTouristname());
//
//
//        if (findTourist !=null){
//
//            if(password.compareTo(findTourist.getPassword())==0)
//            {
//                return findTourist;
//            }
//
//        }
//        else {
//            return null;
//        }
//        return null;
//    }

    @Override
    public TouristDTO update(TouristDTO registeredTouristDto) {
        return null;
    }

    @Override
    public Tourist findByIdPatient(String idPatient) {
        return null;
    }

//    @Override
//    public  Tourist findByIdPatient(String idPatient){
//        Tourist findTourist =  registeredTouristDao.findByIdPatient(idPatient);
//        if (findTourist !=null){
//            return findTourist;
//        }
//        return null;
//    }

//    @Override
//    public TouristDto update(TouristDto registeredTouristDto) {
//        Tourist registeredTourist = findById(registeredTouristDto.getId());
//        if (registeredTourist != null) {
//            BeanUtils.copyProperties(registeredTouristDto, registeredTourist, "password", "registeredTouristname");
//            registeredTouristDao.save(registeredTourist);
//        }
//        return registeredTouristDto;
//    }

    @Override
    public Tourist save(TouristDTO registeredTourist) {
        Tourist newTourist = new Tourist();
        newTourist.setFirstName(registeredTourist.getFirstName());
        newTourist.setLastName(registeredTourist.getLastName());
        newTourist.setLastName(registeredTourist.getLastName());
        newTourist.setAddress(registeredTourist.getAddress());
        newTourist.setEmail(registeredTourist.getEmail());


        User userNou = new User();
        // userNou.setUsername(caregiver.getUser().getUsername());
        userNou =  userRepository.findByUsername(registeredTourist.getUser().getUsername());
//        Users userLocal = new Users();
//        userLocal.setId(caregiver.getUser().getId());
        newTourist.setUser(userNou);
        // newCaregiver.setPatientsList(caregiver.getPatients());

//        newTourist.se.setCaregiver_idCaregiver(localCaregiver);

        return registeredTouristRepository.save(newTourist);
    }
}