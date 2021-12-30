package com.xworkz.paper.Controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.paper.dto.PaperDTO;
import com.xworkz.paper.service.paperServiceImpl;

@Component
@RequestMapping("/")
public class PaperControler {
	
	@Autowired
	private paperServiceImpl paperServiceImpl;

	public PaperControler() {

		System.out.println(this.getClass().getSimpleName() + " Created");
	}

	@RequestMapping("/subimtNewspaper.do")
	public String onSaved(@ModelAttribute PaperDTO paperDTO, Model model) {		
		System.out.println("Invoked onSaved()");
						
		if(this.paperServiceImpl.validatePaperDTO(paperDTO)){
			
		}else {
			model.addAttribute("ValidationMessage", "Invalidate data tray again");
		}
		
		
		return "WEB-INF/Pages/NewsPaperDetails.jsp";
	}

}
