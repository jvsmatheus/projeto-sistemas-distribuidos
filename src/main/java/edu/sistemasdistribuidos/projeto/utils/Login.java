package edu.sistemasdistribuidos.projeto.utils;

import edu.sistemasdistribuidos.projeto.controllers.UserController;
import edu.sistemasdistribuidos.projeto.models.User;
import edu.sistemasdistribuidos.projeto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static edu.sistemasdistribuidos.projeto.utils.PasswordSecurity.*;

@Service
public class Login {

//    @Autowired
//    UserRepository userRepository;
//
//    public boolean login(String email, String pass) {
//        var user = userRepository.findByEmail(email);
//        if (user.isEmpty()) {
//            return false;
//        }
//        return (checkPassword(pass, user.getClass().getFields())) ? true : false;
//
//    }
}
