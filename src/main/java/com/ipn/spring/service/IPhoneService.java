package com.ipn.spring.service;

import com.ipn.spring.model.Phone;
import java.util.List;

public interface IPhoneService {

    public void addPhone(Phone p);

    public void updatePhone(Phone p);

    public List<Phone> listPhones();

    public Phone getPhoneById(int id);

    public void removePhone(int id);
}
