package com.example.demo.services;

import com.example.demo.models.UserModel;
import com.example.demo.repositories.UserRepo;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepo UserRepository;

    UserService(UserRepo UserRepository){
        this.UserRepository=UserRepository;
    }

    public boolean Isuser(String email) {
        boolean user=UserRepository.existsByEmail(email);
        if (user) {
            return true;
        }
        return false;
    }

    public UserModel Adduser(UserModel User){
        return UserRepository.save(User);
    }

}
