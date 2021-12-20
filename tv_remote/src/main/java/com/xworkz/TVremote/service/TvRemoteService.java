package com.xworkz.TVremote.service;

import com.xworkz.TVremote.entity.TvRemoteEntity;

public interface TvRemoteService {
	
	boolean validateTvRemoteEntity(TvRemoteEntity tvRemoteEntity);
	
	boolean updateTvRemotePriceByID();
	
	
}
