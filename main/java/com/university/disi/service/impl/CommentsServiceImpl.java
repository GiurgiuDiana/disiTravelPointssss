package com.university.disi.service.impl;

import com.university.disi.dto.CommentDTO;
import com.university.disi.entity.Comments;
import com.university.disi.entity.Objective;
import com.university.disi.repository.CommentsRepository;
import com.university.disi.repository.ObjectiveRepository;
import com.university.disi.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service(value = "registeredCommentsService")
public class CommentsServiceImpl implements CommentsService {

    @Autowired
    private CommentsRepository registeredCommentsRepository;

    @Autowired
    private ObjectiveRepository registeredObjectiveRepository;

    @Override
    public Comments save(CommentDTO commentDTO) {
        Comments newObj= new Comments();
        newObj.setText(commentDTO.getText());
//        newObj.setObjective(commentDTO.getObjective());
        newObj.setAuthorName(commentDTO.getAuthorName());
        Optional<Objective> optionalObjective = registeredObjectiveRepository.findById(commentDTO.getObjectiveId());
        Objective objective = optionalObjective.isPresent() ? optionalObjective.get() : null;
        newObj.setObjective(objective);
        return registeredCommentsRepository.save(newObj);

    }

    @Override
    public List<Comments> findAll() {
        List<Comments> listComments = new ArrayList<>();
        return registeredCommentsRepository.findAll();
    }

    @Override
    public void delete(int id) {
        registeredCommentsRepository.deleteById(id);
    }

    @Override
    public Comments findById(int id) {
        Optional<Comments> optionalComment = registeredCommentsRepository.findById(id);
        return optionalComment.isPresent() ? optionalComment.get() : null;
    }

    @Override
    public void update(int id, CommentDTO commentDTO) {
        Optional<Comments> commentToBeUpdated = registeredCommentsRepository.findById(id);
        commentToBeUpdated.get().setText(commentDTO.getText());
//        commentToBeUpdated.get().setObjective(commentDTO.getObjective());
        commentToBeUpdated.get().setAuthorName(commentDTO.getAuthorName());
        registeredCommentsRepository.save(commentToBeUpdated.get());
    }
}
