package com.university.disi.dto;

import com.university.disi.entity.Description;
import com.university.disi.entity.Location;
import com.university.disi.entity.Wishlist;

public class ObjectiveDTO {

    private int id;
    private String name;
    private String address;
    private Location location;
    private int locationId;
    private String category;
    private String reviews;
    private DescriptionDTO descriptionDTO;
    private VisitDTO visitDTO;
    private WishlistDTO wishlistDTO;
    private int wishlistId;


    public int getLocationId() {
        return locationId;
    }

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

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public Location getLocation() {
        return location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public VisitDTO getVisitDTO() { return visitDTO; }

    public void setVisitDTO(VisitDTO visitDTO) { this.visitDTO = visitDTO; }

    public WishlistDTO getWishlistDTO() { return wishlistDTO; }

    public void setWishlistDTO(WishlistDTO wishlistDTO) { this.wishlistDTO = wishlistDTO; }

    public int getWishlistId() { return wishlistId; }

    public void setWishlistId(int wishlistId) { this.wishlistId = wishlistId; }
}
