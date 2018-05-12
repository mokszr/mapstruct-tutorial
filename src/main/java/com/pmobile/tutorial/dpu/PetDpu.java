package com.pmobile.tutorial.dpu;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pmobile.tutorial.model.Pet;
import com.pmobile.tutorial.model.PetType;
import com.pmobile.tutorial.repository.PetRepository;
import com.pmobile.tutorial.repository.PetTypeRepository;

// Pet Data Populating Unit
@Component
@Order(value = 2)
public class PetDpu implements ApplicationListener<ApplicationReadyEvent> {

	@Autowired
	private PetRepository petRepository;

	@Autowired
	private PetTypeRepository petTypeRepository;

	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		seedData();
	}

	private void seedData() {
		if (petRepository.count() > 0) {
			return;
		}

		PetType dogType = petTypeRepository.findByName("dog");

		Pet dogPet = new Pet();
		dogPet.setType(dogType);
		dogPet.setName("karabaş");
		dogPet.setBirthDate(new Date());

		petRepository.save(dogPet);

		System.out.println(
				"Uygulama başlatılırken eğer pet tablosu boşsa, eklenmesi gereken petler kaydediliyor");

	}

}