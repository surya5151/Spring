package com.xworkz.paper.dao;

import com.xworkz.paper.entity.PaperEntity;

public interface PaperDAO {
	
	boolean savePaperEntity(PaperEntity paperEntity);
	
	PaperEntity getPaperEntity(String newsPaperName);
	
	PaperEntity getpPaperEntity(String language);
	
}
