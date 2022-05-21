package io.github.jassonluiz.userRegistration.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.jassonluiz.userRegistration.model.entity.Card;

public interface CardRepository extends JpaRepository<Card, Integer>{

}
