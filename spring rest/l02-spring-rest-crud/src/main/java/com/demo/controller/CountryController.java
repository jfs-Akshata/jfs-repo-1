package com.demo.controller;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Country;
import com.demo.service.ICountryService;

@RestController
public class CountryController {
	@Autowired
	ICountryService countryService;

	//@RequestMapping()
	@RequestMapping(value="/get-all-countries")
	public List<Country> getAllCounties() {
		return countryService.getAllCountries();
	}
}
