package com.example.myapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PhoneContact {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private long phoneNo;
}
