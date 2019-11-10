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
    public List<Contact> findall() {

        Session curretSession = entityManager.unwrap(Session.class);

        Query<Contact> Query = curretSession.createQuery("from Contact" , Contact.class);
     
        List<Contact> contacts = Query.getResultList();
        if (contacts == null) {
			throw new RuntimeException("Employee id not found - ");
		}

        return contacts;
    }
}