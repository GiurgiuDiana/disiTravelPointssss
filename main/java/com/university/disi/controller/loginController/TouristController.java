package com.university.disi.controller.loginController;

import com.university.disi.dto.loginDTO.TouristDTO;
import com.university.disi.entity.loginEntity.Tourist;
import com.university.disi.response.ApiResponse;
import com.university.disi.service.loginService.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/tourist")
public class TouristController {

    @Autowired
    private TouristService touristService;
    @PostMapping
    public ApiResponse<Tourist> saveTourist(@RequestBody TouristDTO tourist){
        return new ApiResponse<>(HttpStatus.OK.value(), "Tourist saved successfully.",touristService.save(tourist));
    }

    @GetMapping
    public ApiResponse<List<Tourist>> listTourist(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Tourist list fetched successfully.",touristService.findAll());
    }

    @PutMapping("/{id}")
    public ApiResponse<TouristDTO> update(@RequestBody TouristDTO touristDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "Tourist updated successfully.",touristService.update(touristDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        touristService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "Tourist deleted successfully.", null);
    }



}
