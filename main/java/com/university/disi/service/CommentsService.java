package com.university.disi.service;

import com.university.disi.dto.CommentDTO;
import com.university.disi.entity.Comments;

import java.util.List;

public interface CommentsService {

    Comments save(CommentDTO commentDTO);
    List<Comments> findAll();
    void delete(int id);
    Comments findById(int id);
    void update(int id, CommentDTO commentDTO);
}
