package com.xworkz.paper.dao;

import java.util.List;

import com.xworkz.paper.dto.PaperDTO;
import com.xworkz.paper.entity.PaperEntity;

public interface PaperDAO {
	
	boolean savePaperEntity(PaperEntity paperEntity);
	
	PaperEntity getPaperEntity(String newsPaperName);
	
	PaperEntity getpPaperEntity(String language);
	
	List<PaperEntity> getAllNewsPaper();
	
	boolean deleteNewsPaperByName(String newsPaperName);
	
	boolean updateNewsPaperEntity(PaperDTO paperDTO);
	
	
}
