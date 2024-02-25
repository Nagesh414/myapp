package com.example.myapp.repo;

import com.example.myapp.entities.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Applicant, Long> {
}
