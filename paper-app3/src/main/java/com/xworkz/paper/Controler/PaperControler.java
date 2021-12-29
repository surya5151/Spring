package com.xworkz.paper.Controler;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.paper.dto.PaperDTO;

@Component
@RequestMapping("/")
public class PaperControler {

	public PaperControler() {

		System.out.println(this.getClass().getSimpleName() + " Created");
	}

	@RequestMapping("/subimtNewspaper.do")
	public String onSaved(@ModelAttribute PaperDTO paperDTO, Model model) {
		
		System.out.println("Invoked onSaved()");
						
		model.addAttribute("NAME", paperDTO.getNewsPaperName());
		model.addAttribute("PRICE", paperDTO.getPrice());
		model.addAttribute("LANGUAGE", paperDTO.getLanguage());
		model.addAttribute("NOOFPAGES", paperDTO.getNoOFPages());
		
		return "WEB-INF/Pages/NewsPaperDetails.jsp";
	}

}
