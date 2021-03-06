package com.app.scheduler.manager.advisors;

import com.app.scheduler.manager.annotations.Advisor;
import com.app.scheduler.manager.entities.User;
import com.app.scheduler.manager.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@Advisor
public class UserServiceAdvisorImpl implements UserServiceAdvisor {

    @Autowired
    private UserService service;


    @Override
    public ResponseEntity retrieveAllUsers() {
        Optional<List<User>> users = service.retrieveAllUsers();
        return ResponseEntity.ok().body(users.get());
    }

    @Override
    public ResponseEntity retrieveUserBy(String id) {
        Optional<User> user = service.retrieveUserBy(id);
        return  ResponseEntity.ok().body(user.get());
    }

    @Override
    public ResponseEntity deleteUserBy(String id) {
        service.deleteUserBy(id);
        return ResponseEntity.ok().build();
    }
}
