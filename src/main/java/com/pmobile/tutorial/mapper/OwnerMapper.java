package com.pmobile.tutorial.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.pmobile.tutorial.dto.OwnerDto;
import com.pmobile.tutorial.model.Owner;

@Mapper(componentModel = "spring", uses = PetMapper.class)
public interface OwnerMapper {

	Owner dtoToEntity(OwnerDto dto);
	OwnerDto entityToDto(Owner entity);
	List<OwnerDto> entityListToDtoList(List<Owner> entityList);
	List<Owner> dtoListToEntityList(List<OwnerDto> entityList);
}
