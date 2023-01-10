package com.sip.ams.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sip.ams.entities.Provider;
import com.sip.ams.repositories.ProviderRepository;

@Controller
public class ProviderController {
	private final ProviderRepository providerRepository;
	
	@Autowired
    public ProviderController(ProviderRepository providerRepository) {
        this.providerRepository = providerRepository;
    }

	
	@RequestMapping("/add")
	@ResponseBody
	public String add()
	{
		Provider p = new Provider("orange","orange@hotmail.com","france");
		Provider res = providerRepository.save(p);
		System.out.println(res.toString());
		return "Success";
	}
}
