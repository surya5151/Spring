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
		tvRemoteEntity.setTvRemoteID(5);
		tvRemoteEntity.setColor("White");
		tvRemoteEntity.setPowerButtonWorking(true);
		tvRemoteEntity.setName("samsung");
		tvRemoteEntity.setNoOfCells(3);
		tvRemoteEntity.setPrice(100);

		TvRemoteService tvRemoteService = springContiner.getBean(TvRemoteService.class);

		// write a validation in service impl

//		boolean result = tvRemoteService.validateTvRemoteEntity(tvRemoteEntity);
//
//		if (result) {
//			System.out.println("Data is saved");
//
//		} else {
//			System.out.println("Data is not saved..");
//		}

		
		
		// written validations in serviceimpl i.e to check color is empty or null

		boolean color = tvRemoteService.getColorByID(5);
		
		if(color) {
			System.out.println("color fetched");
		}else {
			System.out.println("Color is either  null or empty");

		}

		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) springContiner;

		classPathXmlApplicationContext.close();
	}

}
