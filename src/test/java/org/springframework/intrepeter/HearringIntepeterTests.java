package org.springframework.intrepeter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HearringIntepeterTests {
	
	@Test
	public void shouldReturnLaurel() {
		HearingInterpreter interpreter = new HearingInterpreter(new LarelWordProducer());
		assertEquals("Laurel", interpreter.whatIHeard());
	}
	
	@Test
	public void shouldReturnYanny() {
		HearingInterpreter interpreter = new HearingInterpreter(new YannyWordProducer());
		assertEquals("Yanny", interpreter.whatIHeard());
	}


}
