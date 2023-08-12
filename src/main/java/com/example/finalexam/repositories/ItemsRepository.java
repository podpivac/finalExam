package com.example.finalexam.repositories;

import com.example.finalexam.entities.Category;
import com.example.finalexam.entities.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsRepository extends JpaRepository<Items, Integer> {
}
