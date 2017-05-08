package com.ipn.spring.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ipn.spring.dao.PhoneDAO;
import com.ipn.spring.model.Phone;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PhoneService implements IPhoneService {

    @Autowired
    private PhoneDAO phoneDAO;

    public void setPhoneDAO(PhoneDAO phoneDAO) {
        this.phoneDAO = phoneDAO;
    }

    @Override
    @Transactional
    public void addPhone(Phone p) {
        this.phoneDAO.addPhone(p);
    }

    @Override
    @Transactional
    public void updatePhone(Phone p) {
        this.phoneDAO.updatePhone(p);
    }

    @Override
    @Transactional
    public List<Phone> listPhones() {
        return this.phoneDAO.listPhones();
    }

    @Override
    @Transactional
    public Phone getPhoneById(int id) {
        return this.phoneDAO.getPhoneById(id);
    }

    @Override
    @Transactional
    public void removePhone(int id) {
        this.phoneDAO.removePhone(id);
    }
}
