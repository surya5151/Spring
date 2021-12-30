package com.xworkz.paper.service;

import org.springframework.stereotype.Component;

import com.xworkz.paper.dto.PaperDTO;

@Component
public class paperServiceImpl implements paperService {

	public paperServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + " Created");
	}

	@Override
	public boolean validatePaperDTO(PaperDTO paperDTO) {

		System.out.println("invoked validatePaperDTO()");
		boolean flag = false;

		if (paperDTO.getNewsPaperName() != null && !paperDTO.getNewsPaperName().isBlank()) {
			flag = true;
		} else {
			flag = false;
			System.out.println("invalid paperName");
			return flag;
		}

		if (paperDTO.getLanguage() != null && !paperDTO.getLanguage().isBlank()) {
			flag = true;

		} else {
			flag = false;
			System.out.println("invalied langage");
			return flag;
		}

		if (paperDTO.getPrice() > 0) {
			flag = true;
		} else {
			flag = false;
			System.out.println("Price should be grater then zero");
			return flag;
		}

		if (paperDTO.getNoOFPages() > 0) {
			flag = true;
		} else {
			flag = false;
			System.out.println("no of pages should be grater then zero");
			return flag;
		}

		return flag;

	}

}
