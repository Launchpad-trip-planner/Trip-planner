package com.planner.Trip.Model;


import java.sql.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "MyPlans")
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Plan {
    @Id
    @GeneratedValue
    @Column(name="place_Id")
    @Getter @Setter
    private Integer placeId;
    @NotNull
    @Column(name="Place")
    @Getter @Setter
    private String place;

    @NotNull
    @Column(name="Address")
    @Getter @Setter
    private String address;

    @NotNull
    @Column(name="Hotel")
    @Getter @Setter
    private String hotel;

    @NotNull
    @Column(name="Dateoftravel")
    @Getter @Setter
    private Date dateTravel;

    @NotNull
    @Column(name="DateAdded")
    @Getter @Setter
    private Date dateAdded;

    @Column(name="Climate")
    @Getter @Setter
    private String climate;

    @Column(name="PlaceUrl")
    @Getter @Setter
    private String placeUrl;

    @Column(name="HotelUrl")
    @Getter @Setter
    private String hotelUrl;

    @ManyToOne
    @JoinColumn(name="userId", insertable=false, updatable=false)
    @Getter @Setter
    private User user;

    @Getter @Setter
    private Integer userId;

    @Transient
    @Getter @Setter
    private String emailId;

    @Transient
    @Getter @Setter
    private List<Integer> idList;

    public Plan(){
    }
}
