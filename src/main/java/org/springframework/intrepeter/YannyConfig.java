package org.springframework.intrepeter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class YannyConfig {
	@Bean
	WordProducer wordProducer() {
		return new YannyWordProducer();
	}

}