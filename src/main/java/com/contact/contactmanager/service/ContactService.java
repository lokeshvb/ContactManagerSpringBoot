package com.contact.contactmanager.service;

import java.util.List;

import com.contact.contactmanager.entity.Contact;

public interface ContactService {
    public List<Contact> findall();

    public Contact getContactById(int Id);

    public void addContact(Contact contact);

    public void deleteContactByID(int Id);

}