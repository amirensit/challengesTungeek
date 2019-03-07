package com.tungeek.challenge.demo.challenges.subchallenge1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;

import com.tungeek.challenge.demo.challenges.First;
import com.tungeek.challenge.demo.challenges.Second;
import com.tungeek.challenge.demo.challenges.subchallenge2.Config2;

@Configuration
@Import(Config2.class)
public class Config1 {
	
	@Autowired
	Second example2;
	
	@Bean
	@Scope("prototype")
	public First example1() {
		System.out.println(this.example2.getName());
		return new First();
	}

}
