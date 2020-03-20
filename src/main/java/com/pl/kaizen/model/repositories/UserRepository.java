package com.pl.kaizen.model.repositories;

import com.pl.kaizen.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
