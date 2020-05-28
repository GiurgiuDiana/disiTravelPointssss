package com.university.disi.controller;

import com.university.disi.dto.ObjectiveDTO;
import com.university.disi.dto.ObjectiveFilterDTO;
import com.university.disi.entity.Objective;
import com.university.disi.response.ApiResponse;
import com.university.disi.service.ObjectiveService;
import com.university.disi.entity.Objective;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/objectiv")
public class ObjectiveController {
    @Autowired
    private ObjectiveService objectivService;
    @PostMapping
    public ApiResponse<Objective> saveObjective(@RequestBody ObjectiveDTO obj){
        return new ApiResponse<>(HttpStatus.OK.value(), "Objective saved successfully.",objectivService.save(obj));
    }

    @GetMapping
    public ApiResponse<List<Objective>> listObjective(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Objective list fetched successfully.",objectivService.findAll());
    }

    @GetMapping("/{id}")
    public ApiResponse<Objective> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "Patient fetched successfully.",objectivService.findById(id));
    }

    @PostMapping("/searchObjectives")
    public ApiResponse<List<Objective>> searchObjectives(@RequestBody ObjectiveFilterDTO objectiveFilterDTO) {
        return new ApiResponse<>(HttpStatus.OK.value(), "Objective list fetched successfully.", objectivService.searchObjectives(objectiveFilterDTO));
    }

    @PutMapping("/{id}")
    public ApiResponse<ObjectiveDTO> update(@RequestBody ObjectiveDTO objDTO) {
        return new ApiResponse<>(HttpStatus.OK.value(), "Objective updated successfully.",objectivService.update(objDTO));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        objectivService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "Objective deleted successfully.", null);
    }


}
