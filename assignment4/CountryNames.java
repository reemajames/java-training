package assignment4;

import java.util.Arrays;
import java.util.List;

public class CountryNames {
    public static void main(String[] args) {
        List<String> countries = Arrays.asList("United Kingdom", "India","United States of America","Australia", "Canada", "China");

        String countryWithLongestName = countries.stream()
                .reduce((country1, country2) -> country1.length() > country2.length() ? country1 : country2)
                .orElse(null);

        System.out.println("Country with the longest name: " + countryWithLongestName);
    }
}
