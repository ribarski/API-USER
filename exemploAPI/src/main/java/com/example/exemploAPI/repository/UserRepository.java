package com.example.exemploAPI.repository;

import com.example.exemploAPI.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
