package org.springframework.clinic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.BDDMockito.given;

import org.springframework.samples.petclinic.model.PetType;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.repository.OwnerRepository;
import org.springframework.samples.petclinic.repository.PetRepository;
import org.springframework.samples.petclinic.repository.VetRepository;
import org.springframework.samples.petclinic.repository.VisitRepository;
import org.springframework.samples.petclinic.service.ClinicServiceImpl;

public class ClinicServiceImplTests {
	
	@Mock
	private PetRepository petRepository;
	
	@Mock
    private VetRepository vetRepository;
	
	@Mock
    private OwnerRepository ownerRepository;
	
	@Mock
    private VisitRepository visitRepository;
	
	@InjectMocks
	ClinicServiceImpl service;
	
	@Disabled
	@Test
	void shouldReturnPetType() {
		List<PetType> petTypes = new ArrayList<PetType>();
		given(petRepository.findPetTypes()).willReturn(petTypes);
		Collection<PetType> foundPetTypes = service.findPetTypes();
		assertTrue(foundPetTypes.isEmpty());
		
	}

}
