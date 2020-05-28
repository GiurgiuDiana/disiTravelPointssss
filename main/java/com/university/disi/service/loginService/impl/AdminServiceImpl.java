package com.university.disi.service.loginService.impl;

import com.university.disi.dto.loginDTO.AdminDTO;
import com.university.disi.entity.loginEntity.Admin;
import com.university.disi.entity.loginEntity.User;
import com.university.disi.repository.loginRepository.AdminRepository;
import com.university.disi.repository.loginRepository.UserRepository;
import com.university.disi.service.loginService.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service(value = "registeredAdminService")
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository registeredAdminRepository;
    @Autowired
    private UserRepository userRepository;
    // private CaregiverDao caregiverDao;

    public List<Admin> findAll() {
        List<Admin> list = new ArrayList<>();
        //registeredAdminDao.findAll().iterator().forEachRemaining(list::add);
        return registeredAdminRepository.findAll();
    }

    @Override
    public void delete(int id) {
        registeredAdminRepository.deleteById(id);
    }


    @Override
    public Admin findById(int id) {
        Optional<Admin> optionalAdmin = registeredAdminRepository.findById(id);
        return optionalAdmin.isPresent() ? optionalAdmin.get() : null;
    }


    @Override
    public AdminDTO update(AdminDTO registeredAdminDto) {
        return null;
    }



//    @Override
//    public  Admin findByIdPatient(String idPatient){
//        Admin findAdmin =  registeredAdminDao.findByIdPatient(idPatient);
//        if (findAdmin !=null){
//            return findAdmin;
//        }
//        return null;
//    }

//    @Override
//    public AdminDto update(AdminDto registeredAdminDto) {
//        Admin registeredAdmin = findById(registeredAdminDto.getId());
//        if (registeredAdmin != null) {
//            BeanUtils.copyProperties(registeredAdminDto, registeredAdmin, "password", "registeredAdminname");
//            registeredAdminDao.save(registeredAdmin);
//        }
//        return registeredAdminDto;
//    }

    @Override
    public Admin save(AdminDTO registeredAdmin) {
        Admin newAdmin = new Admin();
        newAdmin.setFirstName(registeredAdmin.getFirstName());
        newAdmin.setLastName(registeredAdmin.getLastName());

        User userNou = new User();
        // userNou.setUsername(caregiver.getUser().getUsername());
//        userNou =  userDAO.findByUsername(registeredAdmin.getUser().getUsername());
////        Users userLocal = new Users();
////        userLocal.setId(caregiver.getUser().getId());
//        newAdmin.setUser(userNou);
        newAdmin.setUser(registeredAdmin.getUser());


        return registeredAdminRepository.save(newAdmin);
    }
}