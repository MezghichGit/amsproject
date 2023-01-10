package com.sip.ams;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sip.ams.entities.Provider;
import com.sip.ams.repositories.ProviderRepository;

@SpringBootApplication
public class AmsApplication {


	
	
	public static void main(String[] args) {
		SpringApplication.run(AmsApplication.class, args);
		
		
	}

}
