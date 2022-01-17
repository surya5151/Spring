package com.xworkz.paper.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.paper.entity.PaperEntity;

@Repository
public class PaperDAOImpl implements PaperDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public PaperDAOImpl() {

		System.out.println(this.getClass().getSimpleName() + " created");
	}

	@Override
	public boolean savePaperEntity(PaperEntity paperEntity) {

		System.out.println("invoked savePaperEntity()");

		Session session = null;

		try {
			session = sessionFactory.openSession();

			session.beginTransaction();
			session.save(paperEntity);
			session.getTransaction().commit();
			System.out.println("paperEntity is saved");
			return true;

		} catch (HibernateException e) {
			session.getTransaction().rollback();
			System.out.println("Transaction is roll back");

		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed");

			} else {
				System.out.println("Session is not closed");
			}
		}

		return false;
	}

	@Override
	public PaperEntity getPaperEntity(String newsPaperName) {

		System.out.println("Invoked getPaperEntity() in news paper search");
		Session session = null;

		try {
			session = sessionFactory.openSession();
			Query query = session.getNamedQuery("PaperEntity.getnewsPaperObject");
			query.setParameter("name", newsPaperName);
			PaperEntity entity = (PaperEntity) query.uniqueResult();

			System.out.println("Found newsPaperName" + entity);

			if (entity != null) {
				return entity;
			} else {
				System.out.println("newsPaperName not found");
				return null;
			}

		} catch (HibernateException e) {

			System.out.println("inside catch block...........");
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed");
			}
		}

		return null;
	}

	@Override
	public PaperEntity getpPaperEntity(String language) {
		System.out.println("invoked getpPaperEntity()");
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Query query = session.getNamedQuery("PaperEntity.getLanguageObject");
			query.setParameter("name", language);
			PaperEntity entity = (PaperEntity) query.uniqueResult();
			System.out.println("Found Language" + entity);
			if (entity != null) {
				return entity;
			} else {
				System.out.println("Language is not found");
				return null;
			}

		} catch (HibernateException e) {
			System.out.println("Language not found");
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed");
			}

		}
		return null;
	}

	@Override
	public List<PaperEntity> getAllNewsPaper() {
		System.out.println("Invoked  getAllNewsPaper()-dao");
		Session session = null;
		try {
			session = sessionFactory.openSession();
			Query query = session.getNamedQuery("PaperEntity.getAllNewsPaper");
			List<PaperEntity> list = query.list();
			if (!list.isEmpty() && list != null) {
				return list;
			} else {
				System.out.println("Table is emtity, add some papers");
			}
			return null;

		} catch (HibernateException e) {

		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed");

			} else {
				System.out.println("Session is not closed");
			}
		}

		return null;
	}

	@Override
	public boolean deleteNewsPaper(String newsPaperName) {
		System.out.println("Invoked deleteNewsPaper..");

		Session session = null;
		try {
			session = sessionFactory.openSession();
			Query query = session.getNamedQuery("deleteNewsPaper");
			query.setParameter("name", newsPaperName);
			PaperEntity object = (PaperEntity) query.uniqueResult();
			System.out.println("Delete NewsPaper" + object);

			session.beginTransaction();
			session.delete(object);
			session.getTransaction().commit();
			return true;

		} catch (HibernateException e) {
			session.getTransaction().rollback();
			System.out.println("Session is rollbacked.....");
		} finally {
			if (session != null) {
				session.close();
				System.out.println("Session is closed");
			} else {
				System.out.println("Session is not closed");
			}
		}

		return false;
	}

}
