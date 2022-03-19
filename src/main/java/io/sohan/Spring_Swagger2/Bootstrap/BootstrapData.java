package io.sohan.Spring_Swagger2.Bootstrap;

import io.sohan.Spring_Swagger2.Repository.ContactRepository;
import io.sohan.Spring_Swagger2.model.Contact;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    ContactRepository contactRepository;

    public BootstrapData(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Contact c1=new Contact("sohan",123456);
        contactRepository.save(c1);

        Contact c2=new Contact("Ayan",12345654);
        contactRepository.save(c2);
    }
}
