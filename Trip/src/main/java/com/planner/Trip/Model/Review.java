package com.planner.Trip.Model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Review_table")
public class Review {
    @Id
    @GeneratedValue
    @Column(name = "review_id")
    @Getter @Setter
    private Integer reviewId;

    @NotNull
    @Column(name = "review")
    @Getter @Setter
    private String review;

    @NotNull
    @Column(name = "rating")
    @Getter @Setter
    private float rating;

    @NotNull
    @Column(name = "place")
    @Getter @Setter
    private String place;

    @NotNull
    @Column(name = "DateAdded")
    @Getter @Setter
    private Date dateAdded;


    @ManyToOne
    @JoinColumn(name = "userId", insertable = false, updatable = false)
    @Getter @Setter
    private User user;

    @Getter @Setter
    private Integer userId;


    public Review() {

    }
}