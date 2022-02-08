package com.educavalieri.dscatolog.repositories;

import com.educavalieri.dscatolog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
