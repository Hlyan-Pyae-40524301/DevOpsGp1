package com.group1.cw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppIntegrationTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
        app.connect("localhost:33060", 30000);

    }

    // Integration Testing for Countries Report by Population
    @Test
    void getAllCountryByPopulation()
    {
        ArrayList<Country> cou = app.getAllCountryByPopulation();
        assertEquals(cou.get(0).Capital, "Peking");
        assertEquals(cou.get(0).Code, "CHN");
        assertEquals(cou.get(0).Name, "China");
        assertEquals(cou.get(0).Continent, "Asia");
        assertEquals(cou.get(0).Region, "Eastern Asia");
        assertEquals(cou.get(0).Population, 1277558000);
    }

    // Integration Testing for Countries In Continent Report by Population
    @Test
    void getAllCountryInContinentByPopulation()
    {
        ArrayList<Country> cou = app.getAllCountryInContinentByPopulation();
        assertEquals(cou.get(0).Capital, "Peking");
        assertEquals(cou.get(0).Code, "CHN");
        assertEquals(cou.get(0).Name, "China");
        assertEquals(cou.get(0).Continent, "Asia");
        assertEquals(cou.get(0).Region, "Eastern Asia");
        assertEquals(cou.get(0).Population, 1277558000);
    }

    // Integration Testing for Countries In Region Report by Population
    @Test
    void getAllCountryInRegionByPopulation()
    {
        ArrayList<Country> cou = app.getAllCountryInRegionByPopulation();
        assertEquals(cou.get(0).Capital, "Brasília");
        assertEquals(cou.get(0).Code, "BRA");
        assertEquals(cou.get(0).Name, "Brazil");
        assertEquals(cou.get(0).Continent, "South America");
        assertEquals(cou.get(0).Region, "South America");
        assertEquals(cou.get(0).Population, 170115000);
    }

    // Integration Testing for Top Populated Countries Report by Population
    @Test
    void getTopPopulatedCountries()
    {
        ArrayList<Country> cou = app.getTopPopulatedCountries();
        assertEquals(cou.get(0).Capital, "Peking");
        assertEquals(cou.get(0).Code, "CHN");
        assertEquals(cou.get(0).Name, "China");
        assertEquals(cou.get(0).Continent, "Asia");
        assertEquals(cou.get(0).Region, "Eastern Asia");
        assertEquals(cou.get(0).Population, 1277558000);
    }

    // Integration Testing for Top Populated Countries In Continent Report by Population
    @Test
    void getTopPopulatedCountriesInContinent()
    {
        ArrayList<Country> cou = app.getTopPopulatedCountriesInContinent();
        assertEquals(cou.get(0).Capital, "Peking");
        assertEquals(cou.get(0).Code, "CHN");
        assertEquals(cou.get(0).Name, "China");
        assertEquals(cou.get(0).Continent, "Asia");
        assertEquals(cou.get(0).Region, "Eastern Asia");
        assertEquals(cou.get(0).Population, 1277558000);
    }

    // Integration Testing for Top Populated Countries In Region Report by Population
    @Test
    void getTopPopulatedCountriesInRegion()
    {
        ArrayList<Country> cou = app.getTopPopulatedCountriesInRegion();
        assertEquals(cou.get(0).Capital, "Washington");
        assertEquals(cou.get(0).Code, "USA");
        assertEquals(cou.get(0).Name, "United States");
        assertEquals(cou.get(0).Continent, "North America");
        assertEquals(cou.get(0).Region, "North America");
        assertEquals(cou.get(0).Population, 278357000);
    }

    // Integration Testing for Cities Report by Population
    @Test
    void getAllCitiesByPopulation()
    {
        ArrayList<City> cit = app.getAllCitiesByPopulation();
        assertEquals(cit.get(0).Name, "Mumbai (Bombay)");
        assertEquals(cit.get(0).CountryCode, "India");
        assertEquals(cit.get(0).District, "Maharashtra");
        assertEquals(cit.get(0).Population, 10500000);
    }

    // Integration Testing for Cities In Continent Report by Population
    @Test
    void getAllCitiesInContinentByPopulation()
    {
        ArrayList<City> cit = app.getAllCitiesInContinentByPopulation();
        assertEquals(cit.get(0).Name, "Mumbai (Bombay)");
        assertEquals(cit.get(0).CountryCode, "India");
        assertEquals(cit.get(0).District, "Maharashtra");
        assertEquals(cit.get(0).Population, 10500000);
    }

    // Integration Testing for Cities In Region Report by Population
    @Test
    void getAllCitiesInRegionByPopulation()
    {
        ArrayList<City> cit = app.getAllCitiesInRegionByPopulation();
        assertEquals(cit.get(0).Name, "Jakarta");
        assertEquals(cit.get(0).CountryCode, "Indonesia");
        assertEquals(cit.get(0).District, "Jakarta Raya");
        assertEquals(cit.get(0).Population, 9604900);
    }

    //Testing for Cities In Country Report by Population
    @Test
    void getAllCitiesInCountryByPopulation()
    {
        ArrayList<City> cit = app.getAllCitiesInCountryByPopulation();
        assertEquals(cit.get(0).Name, "Rangoon (Yangon)");
        assertEquals(cit.get(0).CountryCode, "Myanmar");
        assertEquals(cit.get(0).District, "Rangoon [Yangon]");
        assertEquals(cit.get(0).Population, 3361700);
    }

    //Testing for Cities In District Report by Population
    @Test
    void getAllCitiesInDistrictByPopulation()
    {
        ArrayList<City> cit = app.getAllCitiesInDistrictByPopulation();
        assertEquals(cit.get(0).Name, "Mandalay");
        assertEquals(cit.get(0).CountryCode, "Myanmar");
        assertEquals(cit.get(0).District, "Mandalay");
        assertEquals(cit.get(0).Population, 885300);
    }

    //Testing for Top Populated Cities Report by Population
    @Test
    void getTopPopulatedCities()
    {
        ArrayList<City> cit = app.getTopPopulatedCities();
        assertEquals(cit.get(0).Name, "Mumbai (Bombay)");
        assertEquals(cit.get(0).CountryCode, "India");
        assertEquals(cit.get(0).District, "Maharashtra");
        assertEquals(cit.get(0).Population, 10500000);
    }

    //Testing for Top Populated Cities In Continent Report by Population
    @Test
    void getTopPopulatedCitiesInContinent()
    {
        ArrayList<City> cit = app.getTopPopulatedCitiesInContinent();
        assertEquals(cit.get(0).Name, "Mumbai (Bombay)");
        assertEquals(cit.get(0).CountryCode, "India");
        assertEquals(cit.get(0).District, "Maharashtra");
        assertEquals(cit.get(0).Population, 10500000);
    }

    //Testing for Top Populated Cities In Region Report by Population
    @Test
    void getTopPopulatedCitiesInRegion()
    {
        ArrayList<City> cit = app.getTopPopulatedCitiesInRegion();
        assertEquals(cit.get(0).Name, "Jakarta");
        assertEquals(cit.get(0).CountryCode, "Indonesia");
        assertEquals(cit.get(0).District, "Jakarta Raya");
        assertEquals(cit.get(0).Population, 9604900);
    }

    //Testing for Top Populated Cities In Country Report by Population
    @Test
    void getTopPopulatedCitiesInCountry()
    {
        ArrayList<City> cit = app.getTopPopulatedCitiesInCountry();
        assertEquals(cit.get(0).Name, "Rangoon (Yangon)");
        assertEquals(cit.get(0).CountryCode, "Myanmar");
        assertEquals(cit.get(0).District, "Rangoon [Yangon]");
        assertEquals(cit.get(0).Population, 3361700);
    }

    //Testing for Top Populated Cities In District Report by Population
    @Test
    void getTopPopulatedCitiesInDistrict()
    {
        ArrayList<City> cit = app.getTopPopulatedCitiesInDistrict();
        assertEquals(cit.get(0).Name, "New York");
        assertEquals(cit.get(0).CountryCode, "United States");
        assertEquals(cit.get(0).District, "New York");
        assertEquals(cit.get(0).Population, 8008278);
    }

    //Testing for Capital Cities Report by Population
    @Test
    void getAllCapitalCitiesByPopulation()
    {
        ArrayList<City> cit = app.getAllCapitalCitiesByPopulation();
        assertEquals(cit.get(0).Name, "Seoul");
        assertEquals(cit.get(0).CountryCode, "South Korea");
        assertEquals(cit.get(0).Population, 9981619);
    }

    //Testing for Capital Cities In Continent Report by Population
    @Test
    void getAllCapitalCitiesInContinentByPopulation()
    {
        ArrayList<City> cit = app.getAllCapitalCitiesInContinentByPopulation();
        assertEquals(cit.get(0).Name, "Seoul");
        assertEquals(cit.get(0).CountryCode, "South Korea");
        assertEquals(cit.get(0).Population, 9981619);
    }

    //Testing for Capital Cities In Region Report by Population
    @Test
    void getAllCapitalCitiesInRegionByPopulation()
    {
        ArrayList<City> cit = app.getAllCapitalCitiesInRegionByPopulation();
        assertEquals(cit.get(0).Name, "Jakarta");
        assertEquals(cit.get(0).CountryCode, "Indonesia");
        assertEquals(cit.get(0).Population, 9604900);
    }

    //Testing for Top Populated Capital Cities Report by Population
    @Test
    void getTopPopulatedCapitalCities()
    {
        ArrayList<City> cit = app.getTopPopulatedCapitalCities();
        assertEquals(cit.get(0).Name, "Seoul");
        assertEquals(cit.get(0).CountryCode, "South Korea");
        assertEquals(cit.get(0).Population, 9981619);
    }

    //Testing for Top Populated Capital Cities In Continent Report by Population
    @Test
    void getTopPopulatedCapitalCitiesInContinent()
    {
        ArrayList<City> cit = app.getTopPopulatedCapitalCitiesInContinent();
        assertEquals(cit.get(0).Name, "Seoul");
        assertEquals(cit.get(0).CountryCode, "South Korea");
        assertEquals(cit.get(0).Population, 9981619);
    }

    //Testing for Top Populated Capital Cities In Region Report by Population
    @Test
    void getTopPopulatedCapitalCitiesInRegion()
    {
        ArrayList<City> cit = app.getTopPopulatedCapitalCitiesInRegion();
        assertEquals(cit.get(0).Name, "Jakarta");
        assertEquals(cit.get(0).CountryCode, "Indonesia");
        assertEquals(cit.get(0).Population, 9604900);
    }

    //Testing for Population Of People In Continent Report
    @Test
    void getPopulationOfPeopleInContinent()
    {
        ArrayList<Country> cou = app.getPopulationOfPeopleInContinent();
        assertEquals(cou.get(0).Continent, "North America");
        assertEquals(cou.get(0).TotalPopulation, 482993000);
        assertEquals(cou.get(0).PeopleLivingInCities, 168250381);
        assertEquals(cou.get(0).PercentagePeopleLivingInCities, (float) 34.835);
        assertEquals(cou.get(0).PeopleNotLivingInCities, 314742619);
        assertEquals(cou.get(0).PercentagePeopleNotLivingInCities, (float) 65.165);
    }

    //Testing for Population Of People In Region Report
    @Test
    void getPopulationOfPeopleInRegion()
    {
        ArrayList<Country> cou = app.getPopulationOfPeopleInRegion();
        assertEquals(cou.get(0).Region, "Caribbean");
        assertEquals(cou.get(0).TotalPopulation, 38140000);
        assertEquals(cou.get(0).PeopleLivingInCities, 11067550);
        assertEquals(cou.get(0).PercentagePeopleLivingInCities, (float) 29.0182);
        assertEquals(cou.get(0).PeopleNotLivingInCities, 27072450);
        assertEquals(cou.get(0).PercentagePeopleNotLivingInCities, (float) 70.9818);
    }
}