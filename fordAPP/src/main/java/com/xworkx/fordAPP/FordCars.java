package com.xworkx.fordAPP;



import org.springframework.stereotype.Component;

@Component
public class FordCars  {	
	
	public FordCars() {
		
		System.out.println(this.getClass().getSimpleName() +"bean created");
	}

}
