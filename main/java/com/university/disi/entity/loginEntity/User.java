package com.university.disi.entity.loginEntity;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String role;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "user")
    private Admin admin;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "user")
    private Tourist tourist;

    @Column
    private String idAdmin;

    @Column
    private String idTourist;

    public String getIdAdmin() {
        if (this.admin !=null)
            return String.valueOf(this.admin.getId());
        else
            return null;
    }

    public String getIdTourist() {
        if (this.tourist !=null)
            return String.valueOf(this.tourist.getId());
        else
            return null;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

//    public String getIdCaregiver() {
//        if (this.caregiver !=null)
//            return String.valueOf(this.caregiver.getId());
//        else
//            return null;
//    }
//
//    public String getIdPatient() {
//        if (this.patient !=null)
//            return String.valueOf(this.patient.getId());
//        else
//            return null;
//    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Tourist getTourist() {
        return tourist;
    }

    public void setTourist(Tourist tourist) {
        this.tourist = tourist;
    }


    public String getEmail() {
        return this.username;
    }
}
