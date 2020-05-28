package com.university.disi.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String text;

    @ManyToOne
    @JoinColumn(name = "objective_id")
    @JsonBackReference(value = "objective-comments")
    public Objective objective;

    @Column
    private String authorName; //aici va fi legatura dintre turist si comments (one-to-many)

    public Comments() {
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Comments(int id, String text, Objective objective, String authorName) {
        this.id = id;
        this.text = text;
        this.objective = objective;
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

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }
}
