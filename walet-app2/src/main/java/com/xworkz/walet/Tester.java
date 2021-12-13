package com.xworkz.walet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

import com.xworkz.walet.dao.TvRemoteDAO;
import com.xworkz.walet.dao.TvRemoteDAOImpl;
import com.xworkz.walet.entity.TvRemoteEntity;

public class Tester {

	public static void main(String[] args) {

		String springConfgFile = "applicationContext.xml";
		

		ApplicationContext springContiner = new ClassPathXmlApplicationContext(springConfgFile);

		TvRemoteEntity tvRemoteEntity = new TvRemoteEntity();
		tvRemoteEntity.setName("sony2");
		tvRemoteEntity.setColor("block");
		tvRemoteEntity.setPrice(1000);
		tvRemoteEntity.setNoOfCells(2);
		tvRemoteEntity.setPowerButtonWorking(true);
		
		TvRemoteDAO tvRemoteDAO = springContiner.getBean(TvRemoteDAO.class);
		tvRemoteDAO.addTvRemoteEntity(tvRemoteEntity);
		
//		TvRemoteDAOImpl tvRemoteDAOImpl = springContiner.getBean(TvRemoteDAOImpl.class);
//		tvRemoteDAOImpl.addTvRemoteEntity(tvRemoteEntity);	
		
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext=(ClassPathXmlApplicationContext)springContiner;

		classPathXmlApplicationContext.close();
	}

}
