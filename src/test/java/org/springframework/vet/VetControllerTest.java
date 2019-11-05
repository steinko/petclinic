package org.springframework.vet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.samples.petclinic.model.Vet;
import org.springframework.samples.petclinic.model.Vets;
import org.springframework.samples.petclinic.service.ClinicService;
import org.springframework.samples.petclinic.vet.VetController;
import static org.mockito.BDDMockito.given;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VetControllerTest {
	
	@Mock
	ClinicService service;
	
	@InjectMocks
	VetController controller;
	
	@Test
	void shouldReturnVetList() {
		Collection<Vet> vets = new ArrayList<Vet>();
		given(service.findVets()).willReturn(vets);
		Map<String,Object> model = new HashMap<String,Object>();
		assertEquals(controller.showVetList(model), "vets/vetList");
	}
	
	@Test
	void shouldReuturnResourceVetList() {
		Collection<Vet> vets = new ArrayList<Vet>();
		given(service.findVets()).willReturn(vets);
		Vets foundVets =controller.showResourcesVetList();
		List<Vet> foundVetList = foundVets.getVetList();
		assertTrue(foundVetList.isEmpty());
		
	}
	

}
