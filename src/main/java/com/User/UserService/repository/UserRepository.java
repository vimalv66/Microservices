package com.User.UserService.repository;

import com.User.UserService.Entity.CustomUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<CustomUser,Long>{

    CustomUser findByUserid(Long id);
}
