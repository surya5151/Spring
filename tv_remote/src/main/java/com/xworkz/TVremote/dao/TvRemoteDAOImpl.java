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
		System.out.println(this.getClass().getSimpleName() + " object created....");
	}

	@Override
	public void addTvRemoteEntity(TvRemoteEntity tvRemoteEntity) {
		System.out.println("invoked addTvRemoteEntity()");
		Session session = null;
		Transaction transaction = null;
		try {
			// SessionFactory sessionFactory = new
			// Configuration().configure("hibernet.cfg.xml").buildSessionFactory();

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
	public String getColorByID(int tvRemoteID) {
		Session session = null;
		String color = null;
		try {
			session = sessionFactory.openSession();
			String hqlQuery = "SELECT COLOR FROM tvremote.tv_remote WHERE TVREMOTE_ID=?";
			Query query = session.createQuery(hqlQuery);
			color = (String) query.uniqueResult();
		} catch (HibernateException exp) {
			System.out.println(exp.getMessage());
		} finally {
			if (session != null) {
				session.close();
				System.out.println("session closed");
			} else {
				System.out.println("session not closed");
			}

		}
		return color;
	}

	

	
	
	
	
	
	
//	@Override
//	public void updateTvRemotePriceByID(int tvRemote, double price) {
//		System.out.println("invoked updateTvRemoteEntity().......");
//		Session session = null;
//		try {
//
//			session = sessionFactory.openSession();
//			session.beginTransaction();
//			String hqlQuery = "update tvremote.tv_remote set PRICE=? where TVREMOTE_ID=?";			
//			Query query = session.update(TvRemoteEntity);
//			int noOfRowsEfected = query.executeUpdate();		
//			System.out.println("noOfRowsEfected " + noOfRowsEfected);
//
//			session.getTransaction().commit();
//
//		} catch (HibernateException e) {
//			session.getTransaction().rollback();
//			System.out.println("Transction is filed... rool back.!!!");
//
//		} finally {
//			if (session != null) {
//				session.close();
//				System.out.println("Session is closed");
//
//			} else {
//				System.out.println("Session is not closed");
//			}
//		}
//	}
}
