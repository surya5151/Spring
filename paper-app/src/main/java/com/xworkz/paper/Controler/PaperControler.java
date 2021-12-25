package com.xworkz.paper.Controler;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class PaperControler {
	
	
	public PaperControler() {
		
		System.out.println(this.getClass().getSimpleName()+ " Created");
	}
	
	
	@RequestMapping("/news.do")
	void handlerFirstRequest1() {								//it is handler..
		System.out.println("invoked handlerFirstRequest1()");	
		
	}

	@RequestMapping("/abc.do")
	void handlerFirstRequest2() {								//it is handler..
		System.out.println("invoked handlerFirstRequest2()");	
		
	}
	
	@RequestMapping("/xyz.do")
	void handlerFirstRequest3() {								//it is handler..
		System.out.println("invoked handlerFirstRequest3()");	
		
	}


	
	
}
