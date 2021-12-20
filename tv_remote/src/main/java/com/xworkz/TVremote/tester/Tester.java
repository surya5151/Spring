package com.xworkz.TVremote.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.TVremote.dao.TvRemoteDAOImpl;
import com.xworkz.TVremote.entity.TvRemoteEntity;
import com.xworkz.TVremote.service.TvRemoteService;
import com.xworkz.TVremote.service.TvRemoteServiceImpl;

public class Tester {

	public static void main(String[] args) {

		String springConfgFile = "applicationContext.xml";
		ApplicationContext springContiner = new ClassPathXmlApplicationContext(springConfgFile);

		TvRemoteEntity tvRemoteEntity = new TvRemoteEntity();
		tvRemoteEntity.setName("apple2");
		tvRemoteEntity.setColor("White");
		tvRemoteEntity.setPrice(100);
		tvRemoteEntity.setNoOfCells(3);
		tvRemoteEntity.setPowerButtonWorking(true); 

		TvRemoteService tvRemoteService = springContiner.getBean(TvRemoteService.class);
		//boolean result = tvRemoteService.validateTvRemoteEntity(tvRemoteEntity);
		boolean updateTvRemoteEntity = tvRemoteService.updateTvRemotePriceByID();
		
 
		if (updateTvRemoteEntity) {
			System.out.println("Data is saved");

		} else {
			System.out.println("Data is not saved..");
		}

		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) springContiner;

		classPathXmlApplicationContext.close();
	}

}
