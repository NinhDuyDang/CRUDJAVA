package com.example.tmp.repository;

import com.example.tmp.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplicationRepo extends JpaRepository<Application,Integer> {
    Optional<Application> findApplicationById( Integer id);
}
