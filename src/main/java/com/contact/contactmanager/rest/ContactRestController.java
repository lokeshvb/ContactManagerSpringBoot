package com.contact.contactmanager.rest;

import java.util.List;

import com.contact.contactmanager.entity.Contact;
import com.contact.contactmanager.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ContactRestController {
    
    private ContactService contactservice;

    @Autowired
	public ContactRestController(ContactService theContactService) {
		contactservice = theContactService;
	}
  
    @GetMapping("/contacts")
    public  List<Contact> getAllContact() {
        return contactservice.findall();
    }

    @GetMapping("/contacts/{contactId}")
    public Contact getContact( @PathVariable int contactId) {
        return contactservice.getContactById(contactId);
    }
    @PostMapping("/contacts")
    public Contact saveContact(@RequestBody Contact contact) {
        contact.setId(0);
        contactservice.addContact(contact);
        return contact;
    }
    @DeleteMapping("/contacts")
    public String deleteContact(@PathVariable int Id) {
        contactservice.deleteContactByID(Id);
        return "Deleted Employee";
    }
}
