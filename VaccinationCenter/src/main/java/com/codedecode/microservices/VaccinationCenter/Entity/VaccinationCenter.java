package com.codedecode.microservices.VaccinationCenter.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccinationCenter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String centerName;
	
	private String centerAddress;
	
	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}
	
	public String getcenterAddress() {
		return centerAddress;
	}

	public void setvaccinationCenterId(String centerAddress) {
		this.centerAddress = centerAddress;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = this.id;
	}
	

}
