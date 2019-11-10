package com.contact.contactmanager.rest;

import java.util.List;

import com.contact.contactmanager.entity.Contact;
import com.contact.contactmanager.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public  List<Contact> findall() {
        return contactservice.findall();
    }
    @GetMapping("/test")
    public String test() {
        return "hello";
    }
    @PostMapping("/contacts")
    public String test2()
    {
        return "test";
    }
}
