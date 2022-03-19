package io.sohan.Spring_Swagger2.Controller;

import io.sohan.Spring_Swagger2.Service.ContactService;
import io.sohan.Spring_Swagger2.model.Contact;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api")
public class IndexController {

    ContactService contactService;

    public IndexController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/contacts")
    public List<Contact> getallContact(){
        return contactService.getAllContact();
    }

    @GetMapping("/contacts/{id}")
    public Optional<Contact> getContactById(@PathVariable String id){
        return contactService.getContactById(Integer.parseInt(id));
    }

    @PostMapping("/contact")
    public void addContact(@RequestBody Contact contact){
        contactService.addContact(contact);
    }
}
