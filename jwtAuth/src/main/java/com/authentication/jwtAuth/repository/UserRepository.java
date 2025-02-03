package com.authentication.jwtAuth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.authentication.jwtAuth.models.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    
} 
