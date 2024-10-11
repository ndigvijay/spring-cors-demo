package com.example.demo.repositories;

import com.example.demo.models.UserModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<UserModel,String> {

    boolean existsByEmail(String email);

    UserModel findByEmail(String email);

}
