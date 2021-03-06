package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="land_info")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LandInfo {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int landId;
	
	private String landOwnerName;
	
	private double acres;
	
	private long mobNo;
	

}
