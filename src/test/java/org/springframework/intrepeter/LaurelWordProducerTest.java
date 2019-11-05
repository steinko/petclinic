package org.springframework.intrepeter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LarelWordProducerTests {

	@Test
	void shouldReturnLaurel() {
		WordProducer producer = new LarelWordProducer();
		assertEquals(producer.whatIHeard(),"Laurel");
	}

}
