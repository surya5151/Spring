package com.xworkz.paper.Controler;

import java.util.HashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.paper.dto.PaperDTO;
import com.xworkz.paper.service.paperServiceImpl;

import net.bytebuddy.asm.Advice.This;


@Controller
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

		if (this.paperServiceImpl.validatePaperDTO(paperDTO)) {
			boolean isSaved = this.paperServiceImpl.savePaperDTO(paperDTO);

			if (isSaved) {
				model.addAttribute("ValidationMessage", "Paper details have been saved, Thank you");
			} else {
				model.addAttribute("ValidationMessage", "Paper details not Stored, tray again");
			}

		} else {
				HashMap<String,String> map = this.paperServiceImpl.getMap();				
			
			model.addAttribute("validateName", map.get("NEWSPAPERNAME"));
			model.addAttribute("validatePrice", map.get("PRICE"));
			model.addAttribute("validateLanguage", map.get("LANGUAGE"));
			model.addAttribute("validatePages", map.get("NOOFPAGES"));

		}

		return "/welcom.jsp";
	}

	@RequestMapping("/searchNewsPaper.do")
	public String onSearchButtonClicked(@RequestParam String searchNewsPaper, Model model) {
		System.out.println("invoked onSearchButtonClicked()");

		if (this.paperServiceImpl.validateNewsPaperName(searchNewsPaper)) {
			PaperDTO paperDTO = this.paperServiceImpl.getPaperDTO(searchNewsPaper);

			if (paperDTO != null) {
				model.addAttribute("NEWSPAPERNAME", paperDTO.getNewsPaperName());
				model.addAttribute("PRICE", paperDTO.getPrice());
				model.addAttribute("LANGUAGE", paperDTO.getLanguage());
				model.addAttribute("NOOFPAGES", paperDTO.getNoOFPages());
				
				return "/welcom.jsp";
			}else {
				model.addAttribute("NOTFOUND", "News Paper not found, enter the valid News paper name");
				return "/welcom.jsp";
			}

		} else {
			model.addAttribute("searchvalidationMessage", "Invalid newspaperName, try again..");
		}
		
		return "/welcom.jsp";

	}
	  
	@RequestMapping("/searchLanguage.do")
	public String onSearchLanguage(@RequestParam String searchLanguage, Model model) {
		System.out.println("invoked onSearchLanguage()");
		if(this.paperServiceImpl.validateLanguage(searchLanguage)) {
			this.paperServiceImpl.getPaperDTO1(searchLanguage);
			
			
			
		}else {
			model.addAttribute("SearchValidation", "Invalid language, try again");
		}
		return "/welcom.jsp";
		
	}
	
	

}
