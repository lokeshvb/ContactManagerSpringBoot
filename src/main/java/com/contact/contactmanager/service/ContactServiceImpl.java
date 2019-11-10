package com.contact.contactmanager.service;

import java.util.List;

import com.contact.contactmanager.ContactDAO.ContactDAO;
import com.contact.contactmanager.entity.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactServiceImpl implements ContactService {
    private ContactDAO contactDAO;

    @Autowired
	public ContactServiceImpl(ContactDAO theContactDAO) {
		contactDAO = theContactDAO;
    }
    
    @Override
    public List<Contact> findall() {
        
        return contactDAO.findall();
    }

}