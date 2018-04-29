package com.pmobile.tutorial.mapper;

import org.mapstruct.Mapper;

import com.pmobile.tutorial.dto.PetDto;
import com.pmobile.tutorial.model.Pet;

@Mapper(componentModel = "spring", uses = PetTypeMapper.class)
public interface PetMapper {

	Pet dtoToEntity(PetDto dto);

	PetDto entityToDto(Pet entity);

}
