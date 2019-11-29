package com.contact.contactmanager.service;

import java.util.List;

import com.contact.contactmanager.ContactDAO.ContactDAO;
import com.contact.contactmanager.entity.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ContactServiceImpl implements ContactService {
    private ContactDAO contactDAO;

    @Autowired
	public ContactServiceImpl(ContactDAO theContactDAO) {
		contactDAO = theContactDAO;
    }
    
    @Override
	@Transactional
	public List<Contact> findall() {
		return contactDAO.findAll();
	}

	@Override
	@Transactional
	public Contact getContactById(int Id) {
		return contactDAO.findById(Id);
	}

	@Override
	@Transactional
	public void addContact(Contact contact) {
		contactDAO.addContact(contact);
	}

	@Override
	@Transactional
	public void deleteContactByID(int Id) {
		contactDAO.deleteById(Id);
	}



}