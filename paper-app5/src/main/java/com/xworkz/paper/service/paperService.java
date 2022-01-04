package com.xworkz.paper.service;

import com.xworkz.paper.dto.PaperDTO;

public interface paperService {
	
	boolean validatePaperDTO(PaperDTO paperDTO);
	
	boolean savePaperDTO(PaperDTO paperDTO);
	
	boolean validateNewsPaperName(String newsPaperName);
	
	PaperDTO getPaperDTO(String newsPaperName);
	
	
	
	
	
		
	

}
