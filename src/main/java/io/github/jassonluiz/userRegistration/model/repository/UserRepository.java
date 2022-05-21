package io.github.jassonluiz.userRegistration.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.jassonluiz.userRegistration.model.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
