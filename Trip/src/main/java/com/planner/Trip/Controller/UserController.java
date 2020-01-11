package com.planner.Trip.Controller;


import javax.servlet.http.HttpServletResponse;

import com.planner.Trip.Authenticate;
import com.planner.Trip.Create;
import com.planner.Trip.Model.User;
import com.planner.Trip.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/dev")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        super();
        this.userService = userService;
    }

    public UserController() {

    }

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public User register(@Validated(Create.class) @RequestBody User user) {
        return userService.createUser(user);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public User login(@Validated(Authenticate.class) @RequestBody User user, HttpServletResponse response) {

        user = userService.loginUser(user);
        if (user == null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return null;
        } else {
            user.setsessionId("");
            return user;
        }
    }

    public void setService(UserService service) {
        this.userService = service;
    }

}
