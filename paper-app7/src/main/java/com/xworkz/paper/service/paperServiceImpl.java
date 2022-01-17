package com.xworkz.paper.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.paper.dao.PaperDAO;
import com.xworkz.paper.dto.PaperDTO;
import com.xworkz.paper.entity.PaperEntity;

@Service
public class paperServiceImpl implements paperService {

	private HashMap<String, String> map = new HashMap<String, String>();

	@Autowired
	private PaperDAO paperDAO;

	public paperServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + " Created");
	}

	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}

	public PaperDAO getPaperDAO() {
		return paperDAO;
	}

	@Override
	public boolean validatePaperDTO(PaperDTO paperDTO) {

		System.out.println("invoked validatePaperDTO()");
		boolean flag = false;

		if (paperDTO.getNewsPaperName() != null && !paperDTO.getNewsPaperName().isEmpty()) {
			flag = true;
		} else {
			flag = false;
			System.err.println("invalid paperName");
			map.put("NEWSPAPERNAME", "invalid paperName");
			return flag;
		}

		if (paperDTO.getLanguage() != null && !paperDTO.getLanguage().isEmpty()) {
			flag = true;

		} else {
			flag = false;
			System.err.println("invalied langage");
			map.put("PRICE", "invalied langage");
			return flag;
		}

		if (paperDTO.getPrice() > 0) {
			flag = true;
		} else {
			flag = false;
			System.err.println("Price should be grater then zero");
			map.put("LANGUAGE", "Price should be grater then zero");
			return flag;
		}

		if (paperDTO.getNoOFPages() > 0) {
			flag = true;
		} else {
			flag = false;
			System.err.println("no of pages should be grater then zero");
			map.put("NOOFPAGES", "no of pages should be grater then zero");
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

		if (entity != null) {
			PaperDTO dto = new PaperDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;

		} else {
			return null;
		}

	}

	@Override
	public boolean validateLanguage(String language) {
		System.out.println("invoked validateLanguage()");
		boolean flag = false;
		if (!language.isEmpty() && language != null) {
			flag = true;
			return flag;
		} else {
			flag = false;
			System.out.println("invalid language");
			return flag;
		}
	}

	@Override
	public PaperDTO getPaperDTO1(String language) {
		System.out.println("invoked  getPaperDTO1()");
		PaperEntity entity = this.paperDAO.getpPaperEntity(language);
		if (entity != null) {
			PaperDTO dto = new PaperDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		} else {
			return null;
		}

	}

	@Override
	public List<Object> getAllNewsPaper() {
		System.out.println("Invoked getAllNewsPaper()");
		List<Object> newsPapercontainer = null;
		List<PaperEntity> PaperEntityContainer = this.paperDAO.getAllNewsPaper();

		if (PaperEntityContainer != null) {
			return newsPapercontainer = new ArrayList<Object>(PaperEntityContainer);

		}

		return newsPapercontainer;
	}

	
	
	@Override
	public boolean deleteNewsPaper(String newsPaperName) {
		System.out.println("invoked deleteNewsPaper..");

		boolean newsPaper = this.paperDAO.deleteNewsPaper(newsPaperName);

		return newsPaper;

	}
}
