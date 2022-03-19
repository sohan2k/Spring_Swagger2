package io.sohan.Spring_Swagger2.Service;

import io.sohan.Spring_Swagger2.Repository.ContactRepository;
import io.sohan.Spring_Swagger2.model.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class ContactService {
    ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact>getAllContact(){
        List<Contact> contacts=new ArrayList<>();
        contactRepository.findAll().forEach(contacts::add);
        return contacts;
    }

    public Optional<Contact> getContactById(int id){
        return contactRepository.findById(id);
    }

    public void addContact(Contact contact){
        contactRepository.save(contact);
    }

}
