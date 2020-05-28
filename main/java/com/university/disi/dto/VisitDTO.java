package com.university.disi.dto;

import com.university.disi.dto.loginDTO.TouristDTO;
import java.sql.Date;
import java.time.LocalDate;

public class VisitDTO {
    private int id;
    private LocalDate date;
    private TouristDTO tourist;
    private int touristId;
    private ObjectiveDTO objective;
    private int objectiveId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TouristDTO getTourist() {
        return tourist;
    }

    public void setTourist(TouristDTO tourist) {
        this.tourist = tourist;
    }

    public int getTouristId() {
        return touristId;
    }

    public void setTouristId(int touristId) {
        this.touristId = touristId;
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
