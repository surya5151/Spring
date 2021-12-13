
package com.xworkz.walet.dao;

import org.springframework.stereotype.Component;

@Component
public class DAO {
	
	public DAO() {
		System.out.println(this.getClass().getSimpleName() +" Bean created");
	}

}
