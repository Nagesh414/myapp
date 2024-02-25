package com.example.myapp.repo;

import com.example.myapp.entities.PhoneContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneContactRepository extends JpaRepository<PhoneContact, Integer> {
}
