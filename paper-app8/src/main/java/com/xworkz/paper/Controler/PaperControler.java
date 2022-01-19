package com.xworkz.paper.Controler;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.paper.dto.PaperDTO;
import com.xworkz.paper.service.paperServiceImpl;

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
			HashMap<String, String> map = this.paperServiceImpl.getMap();

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
			} else {
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
		if (this.paperServiceImpl.validateLanguage(searchLanguage)) {
			this.paperServiceImpl.getPaperDTO1(searchLanguage);

		} else {
			model.addAttribute("SearchValidation", "Invalid language, try again");
		}
		return "/welcom.jsp";

	}

	@RequestMapping("/getAllNewsPaper.do")
	public String onGetAllPaperClicked(Model model) {
		System.out.println("Invoked onGetAllPaperClicked()");
		List<Object> allNewsPaper = this.paperServiceImpl.getAllNewsPaper();

		model.addAttribute("ListOfNewspaper", allNewsPaper);

		return "/welcom.jsp";

	}

	@RequestMapping("/deleteNewsPaper.do")

	public String onDeleteButtonClicked(@RequestParam String newsPaperName, Model model) {

		System.out.println("Invoked onDeleteButtonClicked");
		boolean result = this.paperServiceImpl.validateNewsPaperName(newsPaperName);
		if (result) {
			boolean isDeleted = this.paperServiceImpl.deleteNewsPaper(newsPaperName);

			if (isDeleted) {
				model.addAttribute("Message", "NewsPaper details deleted successfully...Thank You");
				return "/welcom.jsp";

			} else {
				model.addAttribute("Message", "Could not delete the data, Try Again..");
				return "/welcom.jsp";
			}
		} else {
			model.addAttribute("Message", "Could not delete the data, Try Again..");
		}

		return "/welcom.jsp";
	}

	@RequestMapping("/updateNewsPaper.do")
	public String onUpdate(@RequestParam("newsPaperName") String newsPaperName, @ModelAttribute PaperDTO paperDTO, Model model) {
		System.out.println("invoked onUpdate()");
		
		boolean isupdate = this.paperServiceImpl.updateNewsPaper(paperDTO);
		System.out.println("NewsPaper DTO :" +isupdate);	
		
		if (paperDTO != null) {
			model.addAttribute("newspapername", paperDTO.getNewsPaperName());
			model.addAttribute("price", paperDTO.getPrice());
			model.addAttribute("language", paperDTO.getLanguage());
			model.addAttribute("noofpages", paperDTO.getNoOFPages());

			model.addAttribute("Message","Updated Newspaper sucessfully");
			return "/welcom.jsp";
			
		}else {

		model.addAttribute("Message"," NOT Updated Newspaper.......!!!! ");
		return "/welcom.jsp";
		}

}
	
}
