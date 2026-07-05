package com.cognizant.springlearn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.Country;
import com.cognizant.springlearn.service.CountryService;
import com.cognizant.springlearn.service.exception.CountryNotFoundException;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/countries")
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        LOGGER.debug("CountryController constructed");
        this.countryService = countryService;
    }

    // Kept for backwards-compatibility with Hands-on "REST - Country Web Service" (/country -> India)
    @GetMapping("/india")
    public Country getCountryIndia() {
        LOGGER.info("START");
        Country result = countryService.getCountryIndia();
        LOGGER.info("END");
        return result;
    }

    @GetMapping
    public List<Country> getAllCountries() {
        LOGGER.info("START");
        List<Country> result = countryService.getAllCountries();
        LOGGER.info("END");
        return result;
    }

    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
        LOGGER.info("START");
        Country result = countryService.getCountry(code);
        LOGGER.info("END");
        return result;
    }

    @PostMapping
    public Country addCountry(@RequestBody @Valid Country country) {
        LOGGER.info("START");
        LOGGER.debug("Country received: {}", country);
        Country result = countryService.addCountry(country);
        LOGGER.info("END");
        return result;
    }
}
