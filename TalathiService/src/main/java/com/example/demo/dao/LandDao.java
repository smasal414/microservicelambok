package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LandInfo;

public interface LandDao  extends JpaRepository<LandInfo, Integer >{

}
