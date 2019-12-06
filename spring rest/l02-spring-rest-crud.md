# CRUD OPERATION USING SPRING REST
## create the model
package com.demo.model;

public class Country {
	private String countryId;
	private String countryName;
	private String population;
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName="
				+ countryName + ", population=" + population + "]";
	}
	public Country(){
		
	}
	public Country(String countryId, String countryName, String population) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.population = population;
	}

}

## create the repository
package com.demo.repo;

import java.util.List;

import com.demo.model.Country;

public interface ICountryRepo {
	public List<Country> getAllCountries();
	public void addCountry(Country country);
	public Country deleteCountry(int id);
	public Country searchCountry(int id);
}

package com.demo.repo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.demo.db.CountryDB;
import com.demo.model.Country;

@Repository
public class CountryRepoImpl
		implements ICountryRepo {

	@Override
	public List<Country> getAllCountries() {

		return CountryDB.getCountryList();
	}

	@Override
	public void addCountry(Country country) {

		CountryDB.getCountryList().add(country);
	}

	@Override
	public Country deleteCountry(int id) {

		return CountryDB.getCountryList()
				.remove(id);
	}

	@Override
	public Country searchCountry(int id) {
		//Java 8 Stream API
		Stream<Country> countryListStream = CountryDB.getCountryList().stream();
		Stream<Country> countryListFilteredStream = countryListStream.filter(country -> Integer.parseInt(country.getCountryId()) == id);
		Optional<Country> searchCountryOptional = countryListFilteredStream.findFirst();
		Country searchCountry = searchCountryOptional.get();
		return searchCountry;
		
//	return CountryDB.getCountryList().stream()
//	.filter(c -> Integer.parseInt(
//			c.getCountryId()) == id)
//	.findFirst().get();
	}
}


## create the service layer
package com.demo.service;

import java.util.List;

import com.demo.model.Country;

public interface ICountryService {
	public List<Country> getAllCountries();

	public void addCountry(Country country);

	public Country deleteCountry(int id);

	public Country searchCountry(int id);
}

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


## create the rest controller
http://localhost:9001/l02-spring-rest-crud/rest/get-all-countries
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
