package com.app.scheduler.manager.services;

import com.app.scheduler.manager.entities.User;
import com.app.scheduler.manager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public Optional<List<User>> retrieveAllUsers() {
        return Optional.of(userRepository.findAll());
    }

    @Override
    public Optional<User> retrieveUserBy(String id) {
        return userRepository.findById(Integer.parseInt(id));

    }

    @Override
    public void deleteUserBy(String id) {

        userRepository.deleteById(Integer.parseInt(id));
    }


}
