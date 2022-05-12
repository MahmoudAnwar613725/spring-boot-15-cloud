package edu.miu.cs.cs544.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import edu.miu.cs.cs544.domain.Country;
import edu.miu.cs.cs544.repository.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryController {

	@Autowired
	private CountryRepository countryRepository;

	@GetMapping
	public List<Country> findAll() {
		return countryRepository.findAll();
	}

	@GetMapping("/{id}")
	public Country findById(@PathVariable(name = "id") String countryId) {
		return countryRepository.findById(countryId).get();
	}

	@PutMapping
	public void updateCountry(@RequestBody Country country) {
		countryRepository.save(country);
	}

	@GetMapping(params = "paged=true")
	public Page<Country> findAll(Pageable pageable) {
		return countryRepository.findAll(pageable);
	}

}
