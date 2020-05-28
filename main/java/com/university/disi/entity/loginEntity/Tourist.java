package com.university.disi.entity.loginEntity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.university.disi.entity.Comments;
import com.university.disi.entity.Description;
import com.university.disi.entity.Visit;
import com.university.disi.entity.Wishlist;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tourist")
//@JsonIgnoreProperties("wishlist")
public class Tourist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String firstName;
    @Column
    public String lastName;
    @Column
    private String email;
    @Column
    private String phoneNumber;
    @Column
    private String address;
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_user", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;
    @OneToMany(mappedBy = "tourist")
    @JsonManagedReference(value="tourist-visit")
    private List<Visit> visits = new ArrayList<Visit>();
    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "tourist")
    @JsonManagedReference(value="tourist-wishlist")
    private Wishlist wishlist;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public User getUser() {
//        return user;
//    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setVisits(List<Visit> visits) { this.visits = visits; }

    public void setWishlist(Wishlist wishlist) { this.wishlist = wishlist; }
}
