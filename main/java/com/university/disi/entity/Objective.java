package com.university.disi.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.university.disi.dto.ObjectiveDTO;
import com.university.disi.entity.loginEntity.Tourist;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
@Data
@NoArgsConstructor
@Table(name = "objective")
public class Objective {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String category;

    @Column
    private int nr_visits;

    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    @JsonBackReference
    private Location location;

    @OneToMany(mappedBy = "objective")
    @JsonManagedReference(value = "objective-comments")
    private List<Comments> comments = new ArrayList<Comments>();

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "objective")
    @JsonManagedReference
    private Description description;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "objective")
    @JsonManagedReference(value = "objective-visit")
    private Visit visit;

    @ManyToOne
    @JoinColumn(name = "wishlist_id")
    @JsonBackReference(value="objective-wishlist")
    private Wishlist wishlist;

//    public void setId(int id) {
//        this.id = id;
//    }


    public void deleteConnectiontoWishlist()
    {
        this.wishlist=null;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) { this.address = address; }

    public String getAddress() { return address; }
    public String getLocation() { return address; }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNr_visits(int nr_visits) {
        this.nr_visits = nr_visits;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public void setVisit(Visit visit) { this.visit = visit; }

    public Wishlist getWishlist() { return wishlist; }

    public void setWishlist(Wishlist wishlist) { this.wishlist = wishlist; }



}
