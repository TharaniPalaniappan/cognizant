// =====================================================
// CountryService.java
// =====================================================

@Service
class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Get Country by Code
    public Country getCountry(String code) {
        return countryRepository.findByCode(code);
    }

    // Add Country
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    // Search Countries containing text
    public List<Country> searchCountries(String text) {
        return countryRepository.findByNameContaining(text);
    }

    // Search Countries containing text in ascending order
    public List<Country> searchCountriesSorted(String text) {
        return countryRepository.findByNameContainingOrderByNameAsc(text);
    }

    // Search Countries starting with alphabet
    public List<Country> searchCountriesStartingWith(String alphabet) {
        return countryRepository.findByNameStartingWith(alphabet);
    }
}


// =====================================================
// OrmLearnApplication.java
// =====================================================

@SpringBootApplication
public class OrmLearnApplication {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {

        var context = SpringApplication.run(OrmLearnApplication.class, args);

        OrmLearnApplication app = context.getBean(OrmLearnApplication.class);

        app.testSearchByContainingText();

        app.testSearchByContainingTextSorted();

        app.testSearchByStartingAlphabet();

    }

    // ------------------------------------------

    public void testSearchByContainingText() {

        System.out.println("\nCountries containing 'ou'\n");

        List<Country> list = countryService.searchCountries("ou");

        for (Country country : list) {
            System.out.println(country);
        }

    }

    // ------------------------------------------

    public void testSearchByContainingTextSorted() {

        System.out.println("\nCountries containing 'ou' (Ascending)\n");

        List<Country> list = countryService.searchCountriesSorted("ou");

        for (Country country : list) {
            System.out.println(country);
        }

    }

    // ------------------------------------------

    public void testSearchByStartingAlphabet() {

        System.out.println("\nCountries starting with 'Z'\n");

        List<Country> list = countryService.searchCountriesStartingWith("Z");

        for (Country country : list) {
            System.out.println(country);
        }

    }

}
