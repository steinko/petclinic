package org.springframework.intrepeter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class YannyWordProducerTests {

	@Test
	void shouldReturnLaurel() {
		WordProducer producer = new YannyWordProducer();
		assertEquals(producer.whatIHeard(),"Yanny");
	}

}
