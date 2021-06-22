package com.example.BeanValidationSpringBoot.jpa;

import com.example.BeanValidationSpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
