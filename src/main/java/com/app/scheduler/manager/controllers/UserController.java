package com.app.scheduler.manager.controllers;


import com.app.scheduler.manager.advisors.UserServiceAdvisor;
import com.app.scheduler.manager.entities.User;
import com.app.scheduler.manager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {


    @Autowired
    private UserServiceAdvisor advisor;


    @GetMapping("/all")
    public ResponseEntity getAllUsers(){
        return advisor.retrieveAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity getUserBy(@PathVariable("id") String id){
        return advisor.retrieveUserBy(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity removeUserBy(@PathVariable("id") String id){
        return advisor.deleteUserBy(id);
    }
}
