package com.pmobile.tutorial.dpu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.pmobile.tutorial.model.PetType;
import com.pmobile.tutorial.repository.PetTypeRepository;

// Pet Type Data Populating Unit
@Component
@Order(value = 1)
public class PetTypeDpu implements ApplicationListener<ApplicationReadyEvent> {
  
    @Autowired
    private PetTypeRepository petTypeRepository;

    @Override
    public void onApplicationEvent(final ApplicationReadyEvent event) {
        seedData();
    }

    private void seedData() {
    	if(petTypeRepository.count() > 0) {
    		return;
    	}
    	
    	PetType dog = new PetType();
    	dog.setName("dog");
    	
    	PetType cat = new PetType();
    	cat.setName("cat");
    	
    	PetType bird = new PetType();
    	bird.setName("bird");
    	
    	petTypeRepository.save(dog);
    	petTypeRepository.save(cat);
    	petTypeRepository.save(bird);
    	
    	System.out.println("Uygulama başlatılırken eğer petType tablosu boşsa, eklenmesi gereken pet type'lar kaydediliyor");
    	
     }

}