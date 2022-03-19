package io.sohan.Spring_Swagger2.Repository;

import io.sohan.Spring_Swagger2.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
