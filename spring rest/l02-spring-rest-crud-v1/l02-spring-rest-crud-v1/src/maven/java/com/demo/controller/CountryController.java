package com.demo.controller;

import java.lang.reflect.Method;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Country;
import com.demo.service.ICountryService;

@RestController
public class CountryController {
	@Autowired
	ICountryService countryService;

	// @RequestMapping()
	@RequestMapping(value = "/countries")
	public List<Country> getAllCounties() {
		return countryService.getAllCountries();
	}

	@RequestMapping(value = "/countries/search/{id}", method = RequestMethod.GET)
	public Country getCounty(@PathVariable int id) {
		return countryService.searchCountry(id);
	}
	
//	@RequestMapping(value = "/countries/create/{id}/{name}/{population}")
	@RequestMapping(value = "/countries/create/{id}/{name}/{population}", method = RequestMethod.POST)
	public List<Country> createCountry(
			@PathVariable String id,
			@PathVariable String name,
			@PathVariable String population,
			ModelAndView model) {
		Country country = new Country();
		country.setCountryId(id);
		country.setCountryName(name);
		country.setPopulation(population);
		countryService.addCountry(country);
		return countryService.getAllCountries();
		// model.setViewName("show.jsp");
	}
	
	//@RequestMapping(value = "/countries/delete/{id}", headers = "Accept=application/json", method = {RequestMethod.DELETE})
	//http://localhost:9002/3a-spring-rest-crud/rest/countries/delete/2
	@RequestMapping(value = "/countries/delete/{id}", method = {
			RequestMethod.DELETE })
	public List<Country> deleteCountry(
			@PathVariable int id) {
		countryService.deleteCountry(id);
		return countryService.getAllCountries();
	}
}
