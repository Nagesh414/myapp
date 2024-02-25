package com.example.myapp.controller;

import com.example.myapp.entities.PhoneContact;
import com.example.myapp.services.PhoneContactService;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PhoneContactController {
    @Autowired
    PhoneContactService phoneContactService;

    @GetMapping("/getAllContacts")
    public List<PhoneContact> getAllContacts(){
        return phoneContactService.getAllContacts();
    }

    @PostMapping("/saveContact")
    public void saveContact(@PathVariable PhoneContact phoneContact){
        phoneContactService.saveContact(phoneContact);
    }

}
