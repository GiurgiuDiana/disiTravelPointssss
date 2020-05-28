package com.university.disi.dto;


public class DescriptionDTO {
    private int id;
    private String text;
    private String offer;
    private double price;
    public ObjectiveDTO objective_id;
    private int objectiveId;

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

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ObjectiveDTO getObjective_id() {
        return objective_id;
    }

    public void setObjective_id(ObjectiveDTO objective_id) {
        this.objective_id = objective_id;
    }

    public int getObjectiveId() {
        return objectiveId;
    }

    public void setObjectiveId(int objectiveId) {
        this.objectiveId = objectiveId;
    }
}
