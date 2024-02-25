package com.example.myapp.services;

import com.example.myapp.entities.PhoneContact;
import com.example.myapp.repo.PhoneContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PhoneContactService {
    @Autowired
    PhoneContactRepository repo;

    public List<PhoneContact> getAllContacts(){
        ArrayList list = new ArrayList<>();
        List<PhoneContact> contacts = repo.findAll();
        return contacts;
    }

    public PhoneContact getReferencedContactByID(int id){
        Optional<PhoneContact> referenceById = Optional.of(repo.getReferenceById(id));
        return referenceById.get();
    }

    public void saveContact(PhoneContact contact){
        repo.save(contact);
    }
}
