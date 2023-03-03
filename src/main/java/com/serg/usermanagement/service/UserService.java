package com.serg.usermanagement.service;

import com.serg.usermanagement.exception.ResourceNotFoundException;
import com.serg.usermanagement.model.UserEntity;
import com.serg.usermanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
    }

    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public UserEntity updateUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public void deleteUser(UserEntity userEntity) {
        userRepository.delete(userEntity);
    }
}
