package com.contact.contactmanager.ContactDAO;


import java.util.List;

import com.contact.contactmanager.entity.*;

public interface ContactDAO {
    public List<Contact> findAll();

    public Contact findById(int Id);

    public void addContact(Contact contact);

    public void deleteById(int Id);

}