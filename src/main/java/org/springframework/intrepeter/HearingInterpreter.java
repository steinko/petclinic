package org.springframework.intrepeter;

public class HearingInterpreter {
	private WordProducer wordProducer; 

	public HearingInterpreter(WordProducer wordProducer) {
		this.wordProducer = wordProducer;
	}

	public String whatIHeard() {
		return wordProducer.whatIHeard();
	}

}
