package com.app.scheduler.manager.controllers;


import com.app.scheduler.manager.advisors.UserServiceAdvisor;
import com.app.scheduler.manager.exceptions.MyExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api/users")
public class UserController extends MyExceptionHandler {

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
