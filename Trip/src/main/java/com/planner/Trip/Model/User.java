package com.planner.Trip.Model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;



/**
 * @author ajaykumar
 *
 */
@Entity
@Table(name="User_Details")
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class User {
    @Id
    @GeneratedValue()
    @Column(name="UserId")
    @Getter @Setter
    private Long userId;

    @NotNull
    @Column(name="User_Name")
    @Getter
    @Setter
    private String userName;

    @NotNull
    @Column(name="Password")
    @Getter
    @Setter
    private String Password;

    @NotNull
    @Column(name="Email_Id")
    @Email
    @Getter @Setter
    private String Email;

    @Getter
    @Setter
    @NotNull
    private String sessionId;

    public User(){

    }
    public User(Long id){
        this.userId = id;
    }
    public User(String userName, String Password){
        this.userName = userName;
        this.Password = Password;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setsessionId(String s) {
        this.sessionId = sessionId;
    }
    public String getsessionId(String sessionId) {
        return this.sessionId;
    }

    public String getEmail() {
        return this.Email;
    }

    public String getPassword() {
        return this.Password;
    }
}
