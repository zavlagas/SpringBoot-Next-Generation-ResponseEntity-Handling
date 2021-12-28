package com.app.scheduler.manager.services;

import com.app.scheduler.manager.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<List<User>> retrieveAllUsers();

    Optional<User> retrieveUserBy(String id);

    void deleteUserBy(String id);
}
