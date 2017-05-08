package com.ipn.spring.test;

import com.ipn.spring.dao.PhoneDAO;
import com.ipn.spring.model.Phone;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Pruebas {

    private SessionFactory sessionFactory;

    public static void main(String[] args) {
        Pruebas p = new Pruebas();
        p.x();
    }

    public void x() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Phone> phonesList = session.createQuery("from Phone").list();
        System.out.println(phonesList.toString());
    }
}
