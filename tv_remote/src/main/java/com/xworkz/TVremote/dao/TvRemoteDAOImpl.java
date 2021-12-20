package com.xworkz.TVremote.dao;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.stereotype.Component;

import com.xworkz.TVremote.entity.TvRemoteEntity;

@Component
public class TvRemoteDAOImpl implements TvRemoteDAO {

@Autowired
	private SessionFactory sessionFactory;

	public TvRemoteDAOImpl() {
		System.out.println(this.getClass().getSimpleName() +" object created....");
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

	@Override
	public void updateTvRemotePriceByID() {
		System.out.println("invoked updateTvRemoteEntity()");
		Session session = null;
		try {
			//SessionFactory sessionFactory = new Configuration().configure("hibernet.cfg.xml").buildSessionFactory();

			session = sessionFactory.openSession();
			session.beginTransaction();
			String hqlQuery = "update tvremote.tv_remote set PRICE='300' where TVREMOTE_ID=1";
			
			Query query = session.createQuery(hqlQuery);
			int noOfRowsEfected = query.executeUpdate();
			
			session.getTransaction().commit();
			System.out.println("noOfRowsEfected "+noOfRowsEfected);

		} catch (HibernateException e) {
			session.getTransaction().rollback();
			System.out.println("Transction is filed... rool back.!!!");

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
