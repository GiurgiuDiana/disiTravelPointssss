package com.university.disi.dto;

import com.university.disi.dto.loginDTO.TouristDTO;

public class WishlistDTO {
    private int id;
    private String name;
    private TouristDTO tourist;
    private int touristId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
