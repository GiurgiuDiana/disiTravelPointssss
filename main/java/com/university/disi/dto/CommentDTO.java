package com.university.disi.dto;

import com.university.disi.entity.Objective;

import javax.persistence.Column;

public class CommentDTO {
    private int id;
    private String text;
    private ObjectiveDTO objective;
    private String authorName;
    private int objectiveId;

    public CommentDTO(int id, String text, ObjectiveDTO objective, String authorName) {
        this.id = id;
        this.text = text;
        this.objective = objective;
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ObjectiveDTO getObjective() {
        return objective;
    }

    public void setObjective(ObjectiveDTO objective) {
        this.objective = objective;
    }

    public int getObjectiveId() {
        return objectiveId;
    }

    public void setObjectiveId(int objectiveId) {
        this.objectiveId = objectiveId;
    }
}
