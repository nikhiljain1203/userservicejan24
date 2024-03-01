package com.scaler.userservicemwfeve.controllers;

import com.scaler.userservicemwfeve.dtos.LoginRequestDto;
import com.scaler.userservicemwfeve.dtos.SignUpRequestDto;
import com.scaler.userservicemwfeve.dtos.SignUpResponseDto;
import com.scaler.userservicemwfeve.models.Token;
import com.scaler.userservicemwfeve.models.User;
import com.scaler.userservicemwfeve.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    public Token login(LoginRequestDto requestDto) {
        // check if email and password in db
        // if yes create token (use random string) return token
        // else throw some error
        return null;
    }

    @PostMapping("/signup")
    public SignUpResponseDto signUp(@RequestBody SignUpRequestDto requestDto) {

        // hash password
        // create user
        // return user
        return toSignUpResponseDto(userService.signUp(requestDto.getName(), requestDto.getEmail(), requestDto.getPassword()));
    }

    public ResponseEntity<Void> logout() {
        // delete token if exists -> 200
        // if doesn't exist give a 404
        return null;
    }

    public SignUpResponseDto toSignUpResponseDto(User user) {
        if (user == null) {
            return null; // Or throw an exception, based on your error handling policy
        }

        SignUpResponseDto dto = new SignUpResponseDto();
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setEmailVerified(user.isEmailVerified());

        return dto;
    }
}
