package com.example.myapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
public class Applicant implements Serializable {
    @Id
    private int id;
    private String name;
    private String password;
    private String role;
}
