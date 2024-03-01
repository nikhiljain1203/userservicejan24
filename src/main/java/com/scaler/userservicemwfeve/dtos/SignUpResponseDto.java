package com.scaler.userservicemwfeve.dtos;

import com.scaler.userservicemwfeve.models.Role;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class SignUpResponseDto {
    private String name;
    private String email;
    private boolean isEmailVerified;
}
