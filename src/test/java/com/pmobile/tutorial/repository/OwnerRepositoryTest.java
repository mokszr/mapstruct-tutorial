package com.pmobile.tutorial.repository;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pmobile.tutorial.dto.OwnerDto;
import com.pmobile.tutorial.dto.PetDto;
import com.pmobile.tutorial.dto.PetTypeDto;
import com.pmobile.tutorial.mapper.OwnerMapper;
import com.pmobile.tutorial.mapper.PetMapper;
import com.pmobile.tutorial.mapper.PetTypeMapper;
import com.pmobile.tutorial.model.Owner;
import com.pmobile.tutorial.model.Pet;
import com.pmobile.tutorial.model.PetType;

@RunWith(SpringRunner.class)
@DataJpaTest
public class OwnerRepositoryTest {
	
	@Autowired
	private PetTypeRepository petTypeRepository;
	
	@Autowired
	private OwnerRepository ownerRepository;
	
	@Autowired
	private PetTypeMapper petTypeMapper;
	
	@Autowired
	private PetMapper petMapper;
	
	@Autowired
	private OwnerMapper ownerMapper;
	
	@Test public void
	saveOwnerWithPets(){
		PetType petType = new PetType();
		petType.setName("köpek");
		petTypeRepository.save(petType);	
		
		PetTypeDto petTypeDto = petTypeMapper.entityToDto(petType);
		
		assertThat(petTypeDto, notNullValue());
		
		Pet pet = new Pet();
		pet.setBirthDate(new Date());
		pet.setName("karabas");
		pet.setType(petType);
		
		PetDto petDto = petMapper.entityToDto(pet);
		
		assertThat(petDto, notNullValue());
		
		Owner owner = new Owner();
		owner.setAddress("çankaya");
		owner.setCity("ankara");
		owner.setName("mahmut");
		owner.setSurname("can");
		owner.setPhone("012345678910");
		owner.getPets().add(pet);
		pet.setOwner(owner);
		
		ownerRepository.save(owner);
		
		OwnerDto ownerDto = ownerMapper.entityToDto(owner);
		
		assertThat(ownerDto.getPets().size(), equalTo(1));
		assertThat(owner.getId(),notNullValue());
		assertThat(pet.getId(),notNullValue());
		
	}

}
