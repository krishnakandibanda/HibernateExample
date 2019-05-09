package com.app.test;

import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;

import com.app.model.Employee;
import com.app.util.HibernateUtil;

public class Test {
	public static void main(String[] args) {
		
		try(Session ses = HibernateUtil.getSf().openSession()){
			
		Transaction tx=ses.beginTransaction();
		
		Employee e=new Employee();
		e.setEmpId(100);
		e.setEmpName("yes");
		e.setEmpSal(920.23);
		
		ses.save(e);
		tx.commit();
		ses.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
