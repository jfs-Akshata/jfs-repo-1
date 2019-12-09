http://localhost:9090/l02-spring-rest-crud-v1/rest/countries/search/1001
Path Variable : 1001

@RequestMapping(value = "/countries/search/{id}", method = RequestMethod.GET)
public Country getCounty(
			@PathVariable int id) {
		return countryService.searchCountry(id);
	}


    @RequestMapping(value = "/countries/search", method = RequestMethod.GET)
public Country getCounty(
			 int id) {
		return countryService.searchCountry(id);
	}


# submit data using postman client.
