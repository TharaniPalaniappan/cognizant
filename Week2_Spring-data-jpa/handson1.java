package com.cognizant.ormlearn;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// =====================================================
// Country.java
// =====================================================

@Entity
@Table(name = "country")
class Country {

    @Id
    @Column(name = "co_code")
    private String code;

    @Column(name = "co_name")
    private String name;

    public Country() {
    }

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return code + " - " + name;
    }
}

// =====================================================
// CountryRepository.java
// =====================================================

@Repository
interface CountryRepository extends JpaRepository<Country, String> {

    // Find by country code
    Country findByCode(String code);

    // Search by containing text
    List<Country> findByNameContaining(String text);

    // Search by containing text and sort ascending
    List<Country> findByNameContainingOrderByNameAsc(String text);

    // Search countries starting with a letter
    List<Country> findByNameStartingWith(String alphabet);
}
