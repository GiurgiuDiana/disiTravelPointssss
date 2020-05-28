package com.university.disi.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.university.disi.entity.loginEntity.Tourist;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "wishlist")
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "tourist_id")
    @JsonBackReference(value="tourist-wishlist")
    public Tourist tourist;

    @OneToMany(mappedBy = "wishlist")
    @JsonManagedReference(value="objective-wishlist")
    private List<Objective> objective = new ArrayList<Objective>();

    public int getId() {
        return id;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }

//    public List<Objective> getObjectives() {
//        return objective;
//    }

    public void setObjectives(List<Objective> objectives) {
        this.objective = objectives;
    }
}
