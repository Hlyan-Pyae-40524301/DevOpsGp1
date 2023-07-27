package com.group1.cw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    //Testing for Countries Report by Population
    @Test
    void printCountriesTestNull()
    {
        app.printCountriesByPopulation(null);
    }
    @Test
    void printCountriesTestEmpty()
    {
        ArrayList<Country> country = new ArrayList<Country>();
        app.printCountriesByPopulation(country);
    }
    @Test
    void printCountriesTestContainsNull()
    {
        ArrayList<Country> country = new ArrayList<Country>();
        country.add(null);
        app.printCountriesByPopulation(country);
    }
    @Test
    void printCountries()
    {
        ArrayList<Country> country = new ArrayList<Country>();
        Country cou = new Country();
        cou.Code = "CHN";
        cou.Name = "China";
        cou.Continent = "Asia";
        cou.Region = "Eastern Asia";
        cou.Population = 1277558000;
        cou.Capital = "1891";
        country.add(cou);
        app.printCountriesByPopulation(country);
    }

    //Testing for Countries In Continent Report by Population
    @Test
    void printCountriesInContinentTestNull()
    {
        app.printCountriesInContinentByPopulation(null);
    }
    @Test
    void printCountriesInContinentTestEmpty()
    {
        ArrayList<Country> country1 = new ArrayList<Country>();
        app.printCountriesInContinentByPopulation(country1);
    }
    @Test
    void printCountriesInContinentTestContainsNull()
    {
        ArrayList<Country> country1 = new ArrayList<Country>();
        country1.add(null);
        app.printCountriesInContinentByPopulation(country1);
    }
    @Test
    void printCountriesInContinent()
    {
        ArrayList<Country> country1 = new ArrayList<Country>();
        Country cou = new Country();
        cou.Code = "CHN";
        cou.Name = "China";
        cou.Continent = "Asia";
        cou.Region = "Eastern Asia";
        cou.Population = 1277558000;
        cou.Capital = "1891";
        country1.add(cou);
        app.printCountriesInContinentByPopulation(country1);
    }

    //Testing for Countries In Region Report by Population
    @Test
    void printCountriesInRegionTestNull()
    {
        app.printCountriesInRegionByPopulation(null);
    }
    @Test
    void printCountriesInRegionTestEmpty()
    {
        ArrayList<Country> country2 = new ArrayList<Country>();
        app.printCountriesInRegionByPopulation(country2);
    }
    @Test
    void printCountriesInRegionTestContainsNull()
    {
        ArrayList<Country> country2 = new ArrayList<Country>();
        country2.add(null);
        app.printCountriesInRegionByPopulation(country2);
    }
    @Test
    void printCountriesInRegion()
    {
        ArrayList<Country> country2 = new ArrayList<Country>();
        Country cou = new Country();
        cou.Code = "BRA";
        cou.Name = "Brazil";
        cou.Continent = "South America";
        cou.Region = "South America";
        cou.Population = 170115000;
        cou.Capital = "211";
        country2.add(cou);
        app.printCountriesInRegionByPopulation(country2);
    }

    //Testing for Top Populated Countries Report by Population
    @Test
    void printTopPopulatedCountriesTestNull()
    {
        app.printTopPopulatedCountries(null);
    }
    @Test
    void printTopPopulatedCountriesTestEmpty()
    {
        ArrayList<Country> country3 = new ArrayList<Country>();
        app.printTopPopulatedCountries(country3);
    }
    @Test
    void printTopPopulatedCountriesTestContainsNull()
    {
        ArrayList<Country> country3 = new ArrayList<Country>();
        country3.add(null);
        app.printTopPopulatedCountries(country3);
    }
    @Test
    void printTopPopulatedCountries()
    {
        ArrayList<Country> country3 = new ArrayList<Country>();
        Country cou = new Country();
        cou.Code = "CHN";
        cou.Name = "China";
        cou.Continent = "Asia";
        cou.Region = "Eastern Asia";
        cou.Population = 1277558000;
        cou.Capital = "1891";
        country3.add(cou);
        app.printTopPopulatedCountries(country3);
    }

    //Testing for Top Populated Countries In Continent Report by Population
    @Test
    void printTopPopulatedCountriesInContinentTestNull()
    {
        app.printTopPopulatedCountriesInContinent(null);
    }
    @Test
    void printTopPopulatedCountriesInContinentTestEmpty()
    {
        ArrayList<Country> country4 = new ArrayList<Country>();
        app.printTopPopulatedCountriesInContinent(country4);
    }
    @Test
    void printTopPopulatedCountriesInContinentTestContainsNull()
    {
        ArrayList<Country> country4 = new ArrayList<Country>();
        country4.add(null);
        app.printTopPopulatedCountriesInContinent(country4);
    }
    @Test
    void printTopPopulatedCountriesInContinent()
    {
        ArrayList<Country> country4 = new ArrayList<Country>();
        Country cou = new Country();
        cou.Code = "CHN";
        cou.Name = "China";
        cou.Continent = "Asia";
        cou.Region = "Eastern Asia";
        cou.Population = 1277558000;
        cou.Capital = "1891";
        country4.add(cou);
        app.printTopPopulatedCountriesInContinent(country4);
    }

    //Testing for Top Populated Countries In Region Report by Population
    @Test
    void printTopPopulatedCountriesInRegionTestNull()
    {
        app.printTopPopulatedCountriesInRegion(null);
    }
    @Test
    void printTopPopulatedCountriesInRegionTestEmpty()
    {
        ArrayList<Country> country5 = new ArrayList<Country>();
        app.printTopPopulatedCountriesInRegion(country5);
    }
    @Test
    void printTopPopulatedCountriesInRegionTestContainsNull()
    {
        ArrayList<Country> country5 = new ArrayList<Country>();
        country5.add(null);
        app.printTopPopulatedCountriesInRegion(country5);
    }
    @Test
    void printTopPopulatedCountriesInRegion()
    {
        ArrayList<Country> country5 = new ArrayList<Country>();
        Country cou = new Country();
        cou.Code = "USA";
        cou.Name = "United States";
        cou.Continent = "North America";
        cou.Region = "North America";
        cou.Population = 278357000;
        cou.Capital = "3813";
        country5.add(cou);
        app.printTopPopulatedCountriesInRegion(country5);
    }

    //Testing for Cities Report by Population
    @Test
    void printCitiesTestNull()
    {
        app.printCitiesByPopulation(null);
    }
    @Test
    void printCitiesTestEmpty()
    {
        ArrayList<City> city = new ArrayList<City>();
        app.printCitiesByPopulation(city);
    }
    @Test
    void printCitiesTestContainsNull()
    {
        ArrayList<City> city = new ArrayList<City>();
        city.add(null);
        app.printCitiesByPopulation(city);
    }
    @Test
    void printCities()
    {
        ArrayList<City> city = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Mumbai (Bombay)";
        cit.CountryCode = "IND";
        cit.District = "Maharashtra";
        cit.Population = 10500000;
        city.add(cit);
        app.printCitiesByPopulation(city);
    }

    //Testing for Cities In Continent Report by Population
    @Test
    void printCitiesInContinentTestNull()
    {
        app.printCitiesInContinentByPopulation(null);
    }
    @Test
    void printCitiesInContinentTestEmpty()
    {
        ArrayList<City> city1 = new ArrayList<City>();
        app.printCitiesInContinentByPopulation(city1);
    }
    @Test
    void printCitiesInContinentTestContainsNull()
    {
        ArrayList<City> city1 = new ArrayList<City>();
        city1.add(null);
        app.printCitiesInContinentByPopulation(city1);
    }
    @Test
    void printCitiesInContinent()
    {
        ArrayList<City> city1 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Mumbai (Bombay)";
        cit.CountryCode = "IND";
        cit.District = "Maharashtra";
        cit.Population = 10500000;
        city1.add(cit);
        app.printCitiesByPopulation(city1);
    }

    //Testing for Cities In Region Report by Population
    @Test
    void printCitiesInRegionTestNull()
    {
        app.printCitiesInRegionByPopulation(null);
    }
    @Test
    void printCitiesInRegionTestEmpty()
    {
        ArrayList<City> city2 = new ArrayList<City>();
        app.printCitiesInRegionByPopulation(city2);
    }
    @Test
    void printCitiesInRegionTestContainsNull()
    {
        ArrayList<City> city2 = new ArrayList<City>();
        city2.add(null);
        app.printCitiesInRegionByPopulation(city2);
    }
    @Test
    void printCitiesInRegion()
    {
        ArrayList<City> city2 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Jakarta";
        cit.CountryCode = "IDN";
        cit.District = "Jakarta Raya";
        cit.Population = 9604900;
        city2.add(cit);
        app.printCitiesInRegionByPopulation(city2);
    }

    //Testing for Cities In Country Report by Population
    @Test
    void printCitiesInCountryTestNull()
    {
        app.printCitiesInCountryByPopulation(null);
    }
    @Test
    void printCitiesInCountryTestEmpty()
    {
        ArrayList<City> city3 = new ArrayList<City>();
        app.printCitiesInCountryByPopulation(city3);
    }
    @Test
    void printCitiesInCountryTestContainsNull()
    {
        ArrayList<City> city3 = new ArrayList<City>();
        city3.add(null);
        app.printCitiesInCountryByPopulation(city3);
    }
    @Test
    void printCitiesInCountry()
    {
        ArrayList<City> city3 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Rangoon (Yangon)";
        cit.CountryCode = "MMR";
        cit.District = "Rangoon [Yangon]";
        cit.Population = 3361700;
        city3.add(cit);
        app.printCitiesInCountryByPopulation(city3);
    }

    //Testing for Cities In District Report by Population
    @Test
    void printCitiesInDistrictTestNull()
    {
        app.printCitiesInDistrictByPopulation(null);
    }
    @Test
    void printCitiesInDistrictTestEmpty()
    {
        ArrayList<City> city4 = new ArrayList<City>();
        app.printCitiesInDistrictByPopulation(city4);
    }
    @Test
    void printCitiesInDistrictTestContainsNull()
    {
        ArrayList<City> city4 = new ArrayList<City>();
        city4.add(null);
        app.printCitiesInDistrictByPopulation(city4);
    }
    @Test
    void printCitiesInDistrict()
    {
        ArrayList<City> city4 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Mandalay";
        cit.CountryCode = "MMR";
        cit.District = "Mandalay";
        cit.Population = 885300;
        city4.add(cit);
        app.printCitiesInDistrictByPopulation(city4);
    }

    //Testing for Top Populated Cities Report by Population
    @Test
    void printTopPopulatedCitiesTestNull()
    {
        app.printTopPopulatedCities(null);
    }
    @Test
    void printTopPopulatedCitiesTestEmpty()
    {
        ArrayList<City> city5 = new ArrayList<City>();
        app.printTopPopulatedCities(city5);
    }
    @Test
    void printTopPopulatedCitiesTestContainsNull()
    {
        ArrayList<City> city5 = new ArrayList<City>();
        city5.add(null);
        app.printTopPopulatedCities(city5);
    }
    @Test
    void printTopPopulatedCities()
    {
        ArrayList<City> city5 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Mumbai (Bombay)";
        cit.CountryCode = "IND";
        cit.District = "Maharashtra";
        cit.Population = 10500000;
        city5.add(cit);
        app.printTopPopulatedCities(city5);
    }

    //Testing for Top Populated Cities In Continent Report by Population
    @Test
    void printTopPopulatedCitiesInContinentTestNull()
    {
        app.printTopPopulatedCitiesInContinent(null);
    }
    @Test
    void printTopPopulatedCitiesInContinentTestEmpty()
    {
        ArrayList<City> city6 = new ArrayList<City>();
        app.printTopPopulatedCitiesInContinent(city6);
    }
    @Test
    void printTopPopulatedCitiesInContinentTestContainsNull()
    {
        ArrayList<City> city6 = new ArrayList<City>();
        city6.add(null);
        app.printTopPopulatedCitiesInContinent(city6);
    }
    @Test
    void printTopPopulatedCitiesInContinent()
    {
        ArrayList<City> city6 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Mumbai (Bombay)";
        cit.CountryCode = "IND";
        cit.District = "Maharashtra";
        cit.Population = 10500000;
        city6.add(cit);
        app.printTopPopulatedCitiesInContinent(city6);
    }

    //Testing for Top Populated Cities In Region Report by Population
    @Test
    void printTopPopulatedCitiesInRegionTestNull()
    {
        app.printTopPopulatedCitiesInRegion(null);
    }
    @Test
    void printTopPopulatedCitiesInRegionTestEmpty()
    {
        ArrayList<City> city7 = new ArrayList<City>();
        app.printTopPopulatedCitiesInRegion(city7);
    }
    @Test
    void printTopPopulatedCitiesInRegionTestContainsNull()
    {
        ArrayList<City> city7 = new ArrayList<City>();
        city7.add(null);
        app.printTopPopulatedCitiesInRegion(city7);
    }
    @Test
    void printTopPopulatedCitiesInRegion()
    {
        ArrayList<City> city7 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Jakarta";
        cit.CountryCode = "IDN";
        cit.District = "Jakarta Raya";
        cit.Population = 9604900;
        city7.add(cit);
        app.printTopPopulatedCitiesInRegion(city7);
    }

    //Testing for Top Populated Cities In Country Report by Population
    @Test
    void printTopPopulatedCitiesInCountryTestNull()
    {
        app.printTopPopulatedCitiesInCountry(null);
    }
    @Test
    void printTopPopulatedCitiesInCountryTestEmpty()
    {
        ArrayList<City> city8 = new ArrayList<City>();
        app.printTopPopulatedCitiesInCountry(city8);
    }
    @Test
    void printTopPopulatedCitiesInCountryTestContainsNull()
    {
        ArrayList<City> city8 = new ArrayList<City>();
        city8.add(null);
        app.printTopPopulatedCitiesInCountry(city8);
    }
    @Test
    void printTopPopulatedCitiesInCountry()
    {
        ArrayList<City> city8 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Rangoon (Yangon)";
        cit.CountryCode = "MMR";
        cit.District = "Rangoon [Yangon]";
        cit.Population = 3361700;
        city8.add(cit);
        app.printTopPopulatedCitiesInCountry(city8);
    }

    //Testing for Top Populated Cities In District Report by Population
    @Test
    void printTopPopulatedCitiesInDistrictTestNull()
    {
        app.printTopPopulatedCitiesInDistrict(null);
    }
    @Test
    void printTopPopulatedCitiesInDistrictTestEmpty()
    {
        ArrayList<City> city9 = new ArrayList<City>();
        app.printTopPopulatedCitiesInDistrict(city9);
    }
    @Test
    void printTopPopulatedCitiesInDistrictTestContainsNull()
    {
        ArrayList<City> city9 = new ArrayList<City>();
        city9.add(null);
        app.printTopPopulatedCitiesInDistrict(city9);
    }
    @Test
    void printTopPopulatedCitiesInDistrict()
    {
        ArrayList<City> city9 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "New York";
        cit.CountryCode = "USA";
        cit.District = "New York";
        cit.Population = 8008278;
        city9.add(cit);
        app.printTopPopulatedCitiesInDistrict(city9);
    }


}