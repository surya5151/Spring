package com.xworkz.paper.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.paper.dao.PaperDAO;
import com.xworkz.paper.dto.PaperDTO;
import com.xworkz.paper.entity.PaperEntity;

@Component
public class paperServiceImpl implements paperService {

	@Autowired
	private PaperDAO paperDAO;

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
			System.err.println("invalid paperName");
			return flag;
		}

		if (paperDTO.getLanguage() != null && !paperDTO.getLanguage().isBlank()) {
			flag = true;

		} else {
			flag = false;
			System.err.println("invalied langage");
			return flag;
		}

		if (paperDTO.getPrice() > 0) {
			flag = true;
		} else {
			flag = false;
			System.err.println("Price should be grater then zero");
			return flag;
		}

		if (paperDTO.getNoOFPages() > 0) {
			flag = true;
		} else {
			flag = false;
			System.err.println("no of pages should be grater then zero");
			return flag;
		}

		return flag;

	}

	@Override
	public boolean savePaperDTO(PaperDTO paperDTO) {

		PaperEntity paperEntity = new PaperEntity();
//		paperEntity.setNewsPaperName(paperDTO.getNewsPaperName());
//		paperEntity.setPrice(paperDTO.getPrice());
//		paperEntity.setLanguage(paperDTO.getLanguage());
//		paperEntity.setNoOFPages(paperDTO.getNoOFPages());

		// or-- other method
		BeanUtils.copyProperties(paperDTO, paperEntity);
		boolean result = this.paperDAO.savePaperEntity(paperEntity);

		return result;

	}

	@Override
	public boolean validateNewsPaperName(String newsPaperName) {

		System.out.println("Invoked validateNewsPaperName()");
		boolean flag = false;

		if (!newsPaperName.isEmpty() && newsPaperName != null) {
			flag = true;
			return flag;

		} else {
			flag = false;
			System.out.println("invalid news paper name");
			return flag;
		}

	}

	@Override
	public PaperDTO getPaperDTO(String newsPaperName) {
		System.out.println("invoked getPaperDTO()");
		PaperEntity entity = this.paperDAO.getPaperEntity(newsPaperName);
		
		
		if(entity !=null) {
			PaperDTO dto = new PaperDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
			
		}else {
			return null;
		}
		
	
	}

}
