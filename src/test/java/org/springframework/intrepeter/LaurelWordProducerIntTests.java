package org.springframework.intrepeter;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


@SpringJUnitConfig(classes= {BaseConfig.class,LaurelConfig.class })
class HearingIntepretedIntTests {
	@Autowired
	HearingInterpreter interpreter;

	@Test
	void shouldReturnLaurel() {
		
		assertEquals(interpreter.whatIHeard(),"Laurel");
	}

}

