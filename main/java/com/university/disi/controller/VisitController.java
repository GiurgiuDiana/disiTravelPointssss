package com.university.disi.controller;

import com.university.disi.dto.VisitDTO;
import com.university.disi.entity.Visit;
import com.university.disi.response.ApiResponse;
import com.university.disi.service.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/visit")
public class VisitController {
    @Autowired
    private VisitService visitService;

    @PostMapping
    public ApiResponse<Visit> saveVisit(@RequestBody VisitDTO obj){
        return new ApiResponse<>(HttpStatus.OK.value(), "Visit saved successfully.", visitService.save(obj));
    }

    @GetMapping
    public ApiResponse<List<Visit>> listVisit(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Visit list fetched successfully.", visitService.findAll());
    }
}
