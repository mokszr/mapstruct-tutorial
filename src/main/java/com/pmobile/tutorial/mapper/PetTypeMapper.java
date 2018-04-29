package com.pmobile.tutorial.mapper;

import org.mapstruct.Mapper;

import com.pmobile.tutorial.dto.PetTypeDto;
import com.pmobile.tutorial.model.PetType;

@Mapper(componentModel = "spring")
public interface PetTypeMapper {

	PetType dtoToEntity(PetTypeDto dto);
	PetTypeDto entityToDto(PetType entity);

}
