package com.cognizant.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringRestApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringRestApplication.class);

    public static void main(String[] args) {
        LOGGER.info("START main()");
        SpringApplication.run(SpringRestApplication.class, args);
        displayDate();
        displayCountry();
        displayCountries();
        LOGGER.info("END main()");
    }

    /** Hands on 2 - Spring Core: Load SimpleDateFormat from Spring Configuration XML */
    public static void displayDate() {
        LOGGER.info("START");
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml")) {
            SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
            Date date = format.parse("31/12/2018");
            LOGGER.debug("{}", date);
        } catch (ParseException e) {
            LOGGER.error("Unable to parse date", e);
        }
        LOGGER.info("END");
    }

    /** Hands on 4 & 5 - Load Country from Spring Configuration XML + singleton scope demo */
    public static void displayCountry() {
        LOGGER.info("START");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        Country anotherCountry = context.getBean("country", Country.class);
        LOGGER.debug("Country : {}", country.toString());
        LOGGER.debug("Same instance? {}", country == anotherCountry);
        LOGGER.info("END");
    }

    /** Hands on 6 - Load list of countries from Spring Configuration XML */
    @SuppressWarnings("unchecked")
    public static void displayCountries() {
        LOGGER.info("START");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = (List<Country>) context.getBean("countryList", List.class);
        for (Country country : countries) {
            LOGGER.debug("Country : {}", country.toString());
        }
        LOGGER.info("END");
    }
}
