package com.university.disi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import com.university.disi.dto.loginDTO.TouristDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class EmailDTO {
    private int id;
    private String subject;
    private String message;
    private TouristDTO tourist;
    private int touristId;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public TouristDTO getTourist() { return tourist; }

    public void setTourist(TouristDTO tourist) { this.tourist = tourist; }

    public int getTouristId() { return touristId; }

    public void setTouristId(int touristId) { this.touristId = touristId; }
}
