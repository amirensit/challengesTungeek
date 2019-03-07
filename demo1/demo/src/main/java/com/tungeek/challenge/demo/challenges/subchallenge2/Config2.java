package com.tungeek.challenge.demo.challenges.subchallenge2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import com.tungeek.challenge.demo.challenges.First;
import com.tungeek.challenge.demo.challenges.Second;

@Configuration
public class Config2 {

	@Bean
	public Second example2() {
		Second second =  new Second();
		second.setName("exemple2Name");
		return second;
		
	}
}
