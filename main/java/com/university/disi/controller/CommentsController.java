package com.university.disi.controller;

import com.university.disi.dto.CommentDTO;
import com.university.disi.entity.Comments;
import com.university.disi.response.ApiResponse;
import com.university.disi.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/comment")
public class CommentsController {
    @Autowired
    private CommentsService commentsService;
    @PostMapping
    public ApiResponse<Comments> saveComment(@RequestBody CommentDTO obj){
        return new ApiResponse<>(HttpStatus.OK.value(), "Comment saved successfully.",commentsService.save(obj));
    }

    @GetMapping
    public ApiResponse<List<Comments>> listComments(){
        return new ApiResponse<>(HttpStatus.OK.value(), "Comments list fetched successfully.",commentsService.findAll());
    }

    @PutMapping("/{id}")
    public ApiResponse<CommentDTO> update(@PathVariable int id, @RequestBody CommentDTO objDTO) {
        //return new ApiResponse<>(HttpStatus.OK.value(), "Comment updated successfully.", commentsService.update(id, objDTO));
        commentsService.update(id, objDTO);
        return new ApiResponse<>(HttpStatus.OK.value(), "Admin updated successfully.", null);
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        // ObjectivService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "Comment deleted successfully.", null);
    }

}
