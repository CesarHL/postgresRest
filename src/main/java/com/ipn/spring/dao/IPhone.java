package com.ipn.spring.dao;

import com.ipn.spring.model.Phone;
import java.util.List;

public interface IPhone {

    public void addPhone(Phone p);

    public void updatePhone(Phone p);

    public List<Phone> listPhones();

    public Phone getPhoneById(int id);

    public void removePhone(int id);
}
