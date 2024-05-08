package com.example.lab5_spring_prog_ing_2.repository;

import com.example.lab5_spring_prog_ing_2.entity.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
