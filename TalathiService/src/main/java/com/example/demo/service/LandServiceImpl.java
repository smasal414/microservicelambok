package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.LandDao;
import com.example.demo.model.LandInfo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LandServiceImpl implements LandService {

	@Autowired
	LandDao landDao;
	@Override
	public String addDetails(LandInfo lands) {
		// TODO Auto-generated method stub
		landDao.save(lands);
		
		String mssg= "your land details succesfully saved";
		String methodName="addDetails()";
		
		log.info(methodName+"called");
		return mssg;
	}

}
