package io.sohan.Spring_Swagger2.Controller;

import io.sohan.Spring_Swagger2.Service.ContactService;
import io.sohan.Spring_Swagger2.model.Contact;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
    @ApiOperation(value = "All contact list",notes = "Get List of all contacts information ",response = Contact.class)
    public List<Contact> getallContact(){
        return contactService.getAllContact();
    }

    @ApiOperation(value = "Find contacts by id",notes = "Provide a Specific contact id to get information",response = Contact.class)
    @GetMapping("/contacts/{id}")
    public Optional<Contact> getContactById(@ApiParam(value="ID value for the contact you need",required = true) @PathVariable String id){
        return contactService.getContactById(Integer.parseInt(id));
    }

    @ApiOperation(value = "Add new Contact",notes = "Create a new Contact",response = Contact.class)
    @PostMapping("/contact")
    public void addContact(@RequestBody Contact contact){
        contactService.addContact(contact);
    }
}
