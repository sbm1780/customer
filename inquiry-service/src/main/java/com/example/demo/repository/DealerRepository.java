package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Dealer;

@Repository
public interface DealerRepository extends JpaRepository<Dealer, Long> {

}
