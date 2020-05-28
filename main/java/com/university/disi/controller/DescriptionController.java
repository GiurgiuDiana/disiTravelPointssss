package com.university.disi.controller;

import com.university.disi.dto.CommentDTO;
import com.university.disi.dto.DescriptionDTO;
import com.university.disi.entity.Comments;
import com.university.disi.entity.Description;
import com.university.disi.response.ApiResponse;
import com.university.disi.service.CommentsService;
import com.university.disi.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/description")
public class DescriptionController {
    @Autowired
    private DescriptionService descriptionService;

    @PostMapping
    public ApiResponse<Description> saveDescription(@RequestBody DescriptionDTO obj){
        return new ApiResponse<>(HttpStatus.OK.value(), "Description saved successfully.", descriptionService.save(obj));
    }

    @GetMapping
    public ApiResponse<List<Description>> listDescription(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Description list fetched successfully.",descriptionService.findAll());
    }

    @PutMapping("/{id}")
    public ApiResponse<DescriptionDTO> update(@PathVariable int id, @RequestBody DescriptionDTO objDTO) {
        descriptionService.update(id, objDTO);
        return new ApiResponse<>(HttpStatus.OK.value(), "Description updated successfully.", null);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        return new ApiResponse<>(HttpStatus.OK.value(), "Description deleted successfully.", null);
    }

}
