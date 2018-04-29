package com.pmobile.tutorial.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmobile.tutorial.dto.OwnerDto;
import com.pmobile.tutorial.mapper.OwnerMapper;
import com.pmobile.tutorial.model.Owner;
import com.pmobile.tutorial.model.Pet;
import com.pmobile.tutorial.model.PetType;
import com.pmobile.tutorial.repository.OwnerRepository;
import com.pmobile.tutorial.repository.PetTypeRepository;

@Transactional
@Service
public class OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;

	@Autowired
	private PetTypeRepository petTypeRepository;

	@Autowired
	private OwnerMapper ownerMapper;

	public List<Owner> listOwners() {
		return ownerRepository.findAll();
	}

	public List<OwnerDto> listOwnersCorrect() {
		return ownerMapper.entityListToDtoList(ownerRepository.findAll());
	}

	public void saveSampleOwner() {
		PetType petType = new PetType();
		petType.setName("köpek");
		petTypeRepository.save(petType);

		Pet pet = new Pet();
		pet.setBirthDate(new Date());
		pet.setName("karabas");
		pet.setType(petType);

		Owner owner = new Owner();
		owner.setAddress("çankaya");
		owner.setCity("ankara");
		owner.setName("mahmut");
		owner.setSurname("can");
		owner.setPhone("012345678910");
		owner.getPets().add(pet);
		pet.setOwner(owner);

		ownerRepository.save(owner);
	}
}
