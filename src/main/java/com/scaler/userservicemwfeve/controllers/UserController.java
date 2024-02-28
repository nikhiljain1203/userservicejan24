package com.scaler.userservicemwfeve.controllers;

import com.scaler.userservicemwfeve.dtos.LoginRequestDto;
import com.scaler.userservicemwfeve.models.Token;
import com.scaler.userservicemwfeve.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    public Token login(LoginRequestDto requestDto) {
        // check if email and password in db
        // if yes create token (use random string) return token
        // else throw some error
        return null;
    }

    public User signUp() {
        // no need to hash password for now
        // just store user as is in the db
        // for now no need to have email verification either
        return null;
    }

    public ResponseEntity<Void> logout() {
        // delete token if exists -> 200
        // if doesn't exist give a 404
        return null;
    }
}
