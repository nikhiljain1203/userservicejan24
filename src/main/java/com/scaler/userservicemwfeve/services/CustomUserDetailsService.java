package com.scaler.userservicemwfeve.services;

import com.scaler.userservicemwfeve.models.User;
import com.scaler.userservicemwfeve.repositories.UserRepo;
import com.scaler.userservicemwfeve.security.models.CustomUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private UserRepo userRepo;

    public CustomUserDetailsService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException
    {
        Optional<User> user = userRepo.findByEmail(username);
        if(user.isEmpty()) {
            throw new UsernameNotFoundException("User not found for " +  username);
        }

        return new CustomUserDetails(user.get());
    }
}
