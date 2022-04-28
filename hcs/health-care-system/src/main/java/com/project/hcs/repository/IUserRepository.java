package com.project.hcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.hcs.entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

}
