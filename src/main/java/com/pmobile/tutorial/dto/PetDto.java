package com.pmobile.tutorial.dto;

import java.util.Date;

public class PetDto {
	
	private Long id;
	private String name;
	private Date birthDate;
    private PetTypeDto type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public PetTypeDto getType() {
		return type;
	}

	public void setType(PetTypeDto type) {
		this.type = type;
	}
    
}
