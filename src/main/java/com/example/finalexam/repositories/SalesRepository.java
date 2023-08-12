package com.example.finalexam.repositories;

import com.example.finalexam.entities.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface SalesRepository extends JpaRepository<Sales, BigInteger> {
}
