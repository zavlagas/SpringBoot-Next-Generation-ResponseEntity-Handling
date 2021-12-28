package com.app.scheduler.manager.advisors;

import com.app.scheduler.manager.entities.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserServiceAdvisor {
    ResponseEntity retrieveAllUsers();

    ResponseEntity retrieveUserBy(String id);

    ResponseEntity deleteUserBy(String id);
}
