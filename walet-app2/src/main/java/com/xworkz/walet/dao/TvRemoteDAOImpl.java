package com.xworkz.walet.dao;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.walet.entity.TvRemoteEntity;


public class TvRemoteDAOImpl implements TvRemoteDAO {


	private SessionFactory sessionFactory;
	
	public TvRemoteDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	
	public TvRemoteDAOImpl() {
		System.out.println("object created....");
	}
	
	@Override
	public void addTvRemoteEntity(TvRemoteEntity tvRemoteEntity) {
		System.out.println("invoked addTvRemoteEntity()");
		Session session = null;
		try {
			//SessionFactory sessionFactory = new Configuration().configure("hibernet.cfg.xml").buildSessionFactory();

			session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(tvRemoteEntity);
			session.getTransaction().commit();
			System.out.println("tvRemoteEntity is saved");

		} catch (HibernateException e) {
			System.out.println("Transction is filed... rool back.!!!");
			session.getTransaction().rollback();
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed");

			} else {
				System.out.println("Session is not closed");
			}

		}

	}

	
}
