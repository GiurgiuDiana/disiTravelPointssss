package com.university.disi.controller.loginController;

import com.university.disi.dto.loginDTO.AdminDTO;
import com.university.disi.entity.loginEntity.Admin;
import com.university.disi.response.ApiResponse;

import com.university.disi.service.loginService.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
    @PostMapping
    public ApiResponse<Admin> saveAdmin(@RequestBody AdminDTO admin){
        return new ApiResponse<>(HttpStatus.OK.value(), "Admin saved successfully.",adminService.save(admin));
    }

    @GetMapping
    public ApiResponse<List<Admin>> listAdmin(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Admin list fetched successfully.",adminService.findAll());
    }

    @PutMapping("/{id}")
    public ApiResponse<AdminDTO> update(@RequestBody AdminDTO adminDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "Admin updated successfully.",adminService.update(adminDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        adminService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "Admin deleted successfully.", null);
    }



}
