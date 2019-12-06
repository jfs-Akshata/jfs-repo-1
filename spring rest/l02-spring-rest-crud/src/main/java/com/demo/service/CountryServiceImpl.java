package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Country;
import com.demo.repo.ICountryRepo;

@Service
public class CountryServiceImpl
		implements ICountryService {
	@Autowired
	ICountryRepo countryRepo;

	@Override
	public Country searchCountry(int id) {
		return countryRepo.searchCountry(id);
	}

	@Override
	public List<Country> getAllCountries() {

		return countryRepo.getAllCountries();
	}

	@Override
	public void addCountry(Country country) {

		countryRepo.addCountry(country);
	}

	@Override
	public Country deleteCountry(int id) {

		return countryRepo.deleteCountry(id);
	}

}
