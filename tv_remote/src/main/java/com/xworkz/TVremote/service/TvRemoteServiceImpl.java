package com.xworkz.TVremote.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.TVremote.dao.TvRemoteDAO;
import com.xworkz.TVremote.dao.TvRemoteDAOImpl;
import com.xworkz.TVremote.entity.TvRemoteEntity;

@Component
public class TvRemoteServiceImpl implements TvRemoteService {

	@Autowired
	public TvRemoteDAO tvRemoteDAO;

	public TvRemoteServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + " object Created");
	}

	@Override
	public boolean validateTvRemoteEntity(TvRemoteEntity tvRemoteEntity) {

		System.out.println("invoked validateTvRemoteEntity");

		boolean flag = false;

//		String name = tvRemoteEntity.getName(); // Ternary operator
//		flag = !name.isEmpty() && name != null ? true : false;

		if (!tvRemoteEntity.getName().isEmpty() && tvRemoteEntity.getName() != null) {
			flag = true;
		} else {
			System.out.println("Name can't empty...");
			return flag;
		}

		if (!tvRemoteEntity.getColor().isEmpty() && tvRemoteEntity.getColor() != null) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Color can't empty...");
			return flag;
		}
		if (tvRemoteEntity.getPrice() > 0) {
			flag = true;

		} else {
			flag = false;
			System.out.println("Price should be gater then zero");
			return flag;
		}
		if (tvRemoteEntity.getNoOfCells()> 2) {
			flag = true;

		} else {
			flag = false;
			System.out.println("Cell should be grater then two number");
			return flag;
		}

		if (tvRemoteEntity.isPowerButtonWorking()) {
			flag = true;

		} else {
			flag = false;
			System.out.println("power button not working");
			return flag;
		}

		if (flag) {

			System.out.println("All data valadating");
			this.tvRemoteDAO.addTvRemoteEntity(tvRemoteEntity);
			return flag;
		} else {
			System.out.println("Invalide date.... try once.......");
			return flag;
		}

	}

	@Override
	public boolean updateTvRemotePriceByID() {
		System.out.println("invoked validateTvRemoteEntity");
		return false;

			}

	
}
