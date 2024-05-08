package com.example.lab5_spring_prog_ing_2.repository;

import com.example.lab5_spring_prog_ing_2.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
