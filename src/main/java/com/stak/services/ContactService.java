package com.stak.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stak.dao.ContactDao;
import com.stak.dao.SequenceDao;
import com.stak.model.Contact;

import java.math.BigInteger;
import java.util.List;

@Service
public class ContactService {
    @Autowired private SequenceDao sequenceDao;
    @Autowired private ContactDao contactDao;

    public void add(Contact contact) {
        contact.setId(sequenceDao.getNextSequenceId(Contact.COLLECTION_NAME));
        contactDao.save(contact);
    }

    public void update(Contact contact) {
        contactDao.save(contact);
    }

    public Contact get(Long id) {
        return contactDao.get(id);
    }

    public List<Contact> getAll() {
        return contactDao.getAll();
    }

    public void remove(Long id) {
        contactDao.remove(id);
    }
}
