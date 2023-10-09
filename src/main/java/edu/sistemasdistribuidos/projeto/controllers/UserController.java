package edu.sistemasdistribuidos.projeto.controllers;

import edu.sistemasdistribuidos.projeto.models.User;
import edu.sistemasdistribuidos.projeto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserController {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(UUID id) {
        return userRepository.findById(id);
    }

//    public Optional<User> findByEmail(String email) {
//        return userRepository.findByEmail(email);
//    }

    public void add(User user) {
        userRepository.save(user);
    }

    public User updateUser(UUID id, User updatedUserData) {
        return userRepository.findById(id)
                .map(existingUser -> {
                    if(updatedUserData.getName() != null) existingUser.setName(updatedUserData.getName());
                    if(updatedUserData.getEmail() != null) existingUser.setEmail(updatedUserData.getEmail());
                    if(updatedUserData.getPassword() != null) existingUser.setPassword(updatedUserData.getPassword());
                    return userRepository.save(existingUser);
                })
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
    }

    public void deleteUser(UUID id) {
        userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id));
        userRepository.deleteById(id);
    }
}
