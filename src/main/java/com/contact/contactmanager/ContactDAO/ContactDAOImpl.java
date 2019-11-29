package com.contact.contactmanager.ContactDAO;

import java.util.*;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;

import com.contact.contactmanager.entity.Contact;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDAOImpl implements ContactDAO {
    private EntityManager entityManager;

    @Autowired
    public ContactDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public List<Contact> findAll() {

        Session curretSession = entityManager.unwrap(Session.class);

        Query<Contact> Query = curretSession.createQuery("from Contact" , Contact.class);
     
        List<Contact> contacts = Query.getResultList();
        if (contacts == null) {
			throw new RuntimeException("Employee id not found - ");
		}

        return contacts;
    }
    @Override
    public Contact findById(int Id) {
        Session curretSession = entityManager.unwrap(Session.class);
        Contact contact = curretSession.get(Contact.class, Id);

        return contact;
    }
    @Override
    public void addContact(Contact contact) {
        Session currSession = entityManager.unwrap(Session.class);

        currSession.saveOrUpdate(contact);
    }
    @Override
    public void deleteById(int Id) {
        Session currentSession = entityManager.unwrap(Session.class);

        Query query = currentSession.createQuery("delete from Contact where id =:contactId");
        query.setParameter("contactId", Id);
    }
}