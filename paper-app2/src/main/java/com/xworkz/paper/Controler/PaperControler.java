package com.xworkz.paper.Controler;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class PaperControler {

	public PaperControler() {

		System.out.println(this.getClass().getSimpleName() + " Created");
	}

	@RequestMapping("/subimtNewspaper.do")
	public String onSaved(@RequestParam String newsPaperName, @RequestParam double price,
			@RequestParam String language, @RequestParam short noOFPages, Model model) {
		System.out.println("Invoked onSaved()");
		
		System.out.println("NewsPaperName=" +newsPaperName);
		System.out.println("Price=" +price);
		System.out.println("Language=" +language);
		System.out.println("NoOFPages=" +noOFPages);
		
		model.addAttribute("NAME", newsPaperName);
		model.addAttribute("PRICE", price);
		model.addAttribute("LANGUAGE", language);
		model.addAttribute("NOOFPAGES", noOFPages);
		
		return "WEB-INF/Pages/NewsPaperDetails.jsp";
	}

}
