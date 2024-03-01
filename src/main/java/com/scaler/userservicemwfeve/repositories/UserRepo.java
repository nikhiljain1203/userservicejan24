package com.scaler.userservicemwfeve.repositories;

import com.scaler.userservicemwfeve.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
