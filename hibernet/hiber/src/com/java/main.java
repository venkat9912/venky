package com.java;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.IdGenerator;
import org.hibernate.mapping.List;

public class main {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernet.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	Session session=factory.openSession();
	Transaction t=session.beginTransaction();
	java.util.List employee = session.createQuery("from employe").list();
     for (Iterator iterator = employee.iterator(); iterator.hasNext();) {
         employe e1 = (employe) iterator.next();
         System.out.println(e1.getId() + "  "+ e1.getUsername() + "  " + e1.getPassword());
     }
	t.commit();
}
}
