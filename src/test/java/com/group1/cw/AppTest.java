package com.group1.cw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class AppTest
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

    //Testing for Capital Cities Report by Population
    @Test
    void printCapitalCitiesTestNull()
    {
        app.printAllCapitalCitiesByPopulation(null);
    }
    @Test
    void printCapitalCitiesTestEmpty()
    {
        ArrayList<City> city10 = new ArrayList<City>();
        app.printAllCapitalCitiesByPopulation(city10);
    }
    @Test
    void printCapitalCitiesTestContainsNull()
    {
        ArrayList<City> city10 = new ArrayList<City>();
        city10.add(null);
        app.printAllCapitalCitiesByPopulation(city10);
    }
    @Test
    void printCapitalCities()
    {
        ArrayList<City> city10 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Seoul";
        cit.CountryCode = "South Korea";
        cit.Population = 9981619;
        city10.add(cit);
        app.printAllCapitalCitiesByPopulation(city10);
    }

    //Testing for Capital Cities In Continent Report by Population
    @Test
    void printCapitalCitiesInContinentTestNull()
    {
        app.printAllCapitalCitiesInContinentByPopulation(null);
    }
    @Test
    void printCapitalCitiesInContinentTestEmpty()
    {
        ArrayList<City> city11 = new ArrayList<City>();
        app.printAllCapitalCitiesInContinentByPopulation(city11);
    }
    @Test
    void printCapitalCitiesInContinentTestContainsNull()
    {
        ArrayList<City> city11 = new ArrayList<City>();
        city11.add(null);
        app.printAllCapitalCitiesInContinentByPopulation(city11);
    }
    @Test
    void printCapitalCitiesInContinent()
    {
        ArrayList<City> city11 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Seoul";
        cit.CountryCode = "South Korea";
        cit.Population = 9981619;
        city11.add(cit);
        app.printAllCapitalCitiesInContinentByPopulation(city11);
    }

    //Testing for Capital Cities In Region Report by Population
    @Test
    void printCapitalCitiesInRegionTestNull()
    {
        app.printAllCapitalCitiesInRegionByPopulation(null);
    }
    @Test
    void printCapitalCitiesInRegionTestEmpty()
    {
        ArrayList<City> city12 = new ArrayList<City>();
        app.printAllCapitalCitiesInRegionByPopulation(city12);
    }
    @Test
    void printCapitalCitiesInRegionTestContainsNull()
    {
        ArrayList<City> city12 = new ArrayList<City>();
        city12.add(null);
        app.printAllCapitalCitiesInRegionByPopulation(city12);
    }
    @Test
    void printCapitalCitiesInRegion()
    {
        ArrayList<City> city12 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Jakarta";
        cit.CountryCode = "Indonesia";
        cit.Population = 9604900;
        city12.add(cit);
        app.printAllCapitalCitiesInRegionByPopulation(city12);
    }

    //Testing for Top Populated Capital Cities Report by Population
    @Test
    void printTopPopulatedCapitalCitiesTestNull()
    {
        app.printTopPopulatedCapitalCities(null);
    }
    @Test
    void printTopPopulatedCapitalCitiesTestEmpty()
    {
        ArrayList<City> city13 = new ArrayList<City>();
        app.printTopPopulatedCapitalCities(city13);
    }
    @Test
    void printTopPopulatedCapitalCitiesTestContainsNull()
    {
        ArrayList<City> city13 = new ArrayList<City>();
        city13.add(null);
        app.printTopPopulatedCapitalCities(city13);
    }
    @Test
    void printTopPopulatedCapitalCities()
    {
        ArrayList<City> city13 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Seoul";
        cit.CountryCode = "South Korea";
        cit.Population = 9981619;
        city13.add(cit);
        app.printTopPopulatedCapitalCities(city13);
    }

    //Testing for Top Populated Capital Cities In Continent Report by Population
    @Test
    void printTopPopulatedCapitalCitiesInContinentTestNull()
    {
        app.printTopPopulatedCapitalCitiesInContinent(null);
    }
    @Test
    void printTopPopulatedCapitalCitiesInContinentTestEmpty()
    {
        ArrayList<City> city14 = new ArrayList<City>();
        app.printTopPopulatedCapitalCitiesInContinent(city14);
    }
    @Test
    void printTopPopulatedCapitalCitiesInContinentTestContainsNull()
    {
        ArrayList<City> city14 = new ArrayList<City>();
        city14.add(null);
        app.printTopPopulatedCapitalCitiesInContinent(city14);
    }
    @Test
    void printTopPopulatedCapitalCitiesInContinent()
    {
        ArrayList<City> city14 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Seoul";
        cit.CountryCode = "South Korea";
        cit.Population = 9981619;
        city14.add(cit);
        app.printTopPopulatedCapitalCitiesInContinent(city14);
    }

    //Testing for Top Populated Capital Cities In Region Report by Population
    @Test
    void printTopPopulatedCapitalCitiesInRegionTestNull()
    {
        app.printTopPopulatedCapitalCitiesInRegion(null);
    }
    @Test
    void printTopPopulatedCapitalCitiesInRegionTestEmpty()
    {
        ArrayList<City> city15 = new ArrayList<City>();
        app.printTopPopulatedCapitalCitiesInRegion(city15);
    }
    @Test
    void printTopPopulatedCapitalCitiesInRegionTestContainsNull()
    {
        ArrayList<City> city15 = new ArrayList<City>();
        city15.add(null);
        app.printTopPopulatedCapitalCitiesInRegion(city15);
    }
    @Test
    void printTopPopulatedCapitalCitiesInRegion()
    {
        ArrayList<City> city15 = new ArrayList<City>();
        City cit = new City();
        cit.Name = "Jakarta";
        cit.CountryCode = "Indonesia";
        cit.Population = 9604900;
        city15.add(cit);
        app.printTopPopulatedCapitalCitiesInRegion(city15);
    }

    //Testing for Population Of People In Continent
    @Test
    void printPopulationOfPeopleInContinentTestNull()
    {
        app.printPopulationOfPeopleInContinent(null);
    }
    @Test
    void printPopulationOfPeopleInContinentTestEmpty()
    {
        ArrayList<Country> country6 = new ArrayList<Country>();
        app.printPopulationOfPeopleInContinent(country6);
    }
    @Test
    void printPopulationOfPeopleInContinentTestContainsNull()
    {
        ArrayList<Country> country6 = new ArrayList<Country>();
        country6.add(null);
        app.printPopulationOfPeopleInContinent(country6);
    }
    @Test
    void printPopulationOfPeopleInContinent()
    {
        ArrayList<Country> country6 = new ArrayList<Country>();
        Country cou = new Country();
        cou.Continent = "North America";
        cou.TotalPopulation = 482993000;
        cou.PeopleLivingInCities = 168250381;
        cou.PercentagePeopleLivingInCities = (float) 34.835;
        cou.PeopleNotLivingInCities = 314742619;
        cou.PercentagePeopleNotLivingInCities = (float) 65.165;
        country6.add(cou);
        app.printPopulationOfPeopleInContinent(country6);
    }

    //Testing for Population Of People In Region
    @Test
    void printPopulationOfPeopleInRegionTestNull()
    {
        app.printPopulationOfPeopleInRegion(null);
    }
    @Test
    void printPopulationOfPeopleInRegionTestEmpty()
    {
        ArrayList<Country> country7 = new ArrayList<Country>();
        app.printPopulationOfPeopleInRegion(country7);
    }
    @Test
    void printPopulationOfPeopleInRegionTestContainsNull()
    {
        ArrayList<Country> country7 = new ArrayList<Country>();
        country7.add(null);
        app.printPopulationOfPeopleInRegion(country7);
    }
    @Test
    void printPopulationOfPeopleInRegion()
    {
        ArrayList<Country> country7 = new ArrayList<Country>();
        Country cou = new Country();
        cou.Region = "Caribbean";
        cou.TotalPopulation = 38140000;
        cou.PeopleLivingInCities = 11067550;
        cou.PercentagePeopleLivingInCities = (float) 29.0182;
        cou.PeopleNotLivingInCities = 27072450;
        cou.PercentagePeopleNotLivingInCities = (float) 70.9818;
        country7.add(cou);
        app.printPopulationOfPeopleInRegion(country7);
    }

    //Testing for Population Of People In Country
    @Test
    void printPopulationOfPeopleInCountryTestNull()
    {
        app.printPopulationOfPeopleInCountry(null);
    }
    @Test
    void printPopulationOfPeopleInCountryTestEmpty()
    {
        ArrayList<Country> country8 = new ArrayList<Country>();
        app.printPopulationOfPeopleInCountry(country8);
    }
    @Test
    void printPopulationOfPeopleInCountryTestContainsNull()
    {
        ArrayList<Country> country8 = new ArrayList<Country>();
        country8.add(null);
        app.printPopulationOfPeopleInCountry(country8);
    }
    @Test
    void printPopulationOfPeopleInCountry()
    {
        ArrayList<Country> country8 = new ArrayList<Country>();
        Country cou = new Country();
        cou.Name = "Aruba";
        cou.TotalPopulation = 103000;
        cou.PeopleLivingInCities = 29034;
        cou.PercentagePeopleLivingInCities = (float) 28.1883;
        cou.PeopleNotLivingInCities = 73966;
        cou.PercentagePeopleNotLivingInCities = (float) 71.8117;
        country8.add(cou);
        app.printPopulationOfPeopleInCountry(country8);
    }

    //Testing for Population Of People In World
    @Test
    void printPopulationOfPeopleInWorldTestNull()
    {
        app.printPopulationOfPeopleInWorld(null);
    }
    @Test
    void printPopulationOfPeopleInWorldTestEmpty()
    {
        ArrayList<Country> country9 = new ArrayList<Country>();
        app.printPopulationOfPeopleInWorld(country9);
    }
    @Test
    void printPopulationOfPeopleInWorldTestContainsNull()
    {
        ArrayList<Country> country9 = new ArrayList<Country>();
        country9.add(null);
        app.printPopulationOfPeopleInWorld(country9);
    }
    @Test
    void printPopulationOfPeopleInWorld()
    {
        ArrayList<Country> country9 = new ArrayList<Country>();
        Country cou = new Country();
        cou.TotalPopulation = 6078749450L;
        country9.add(cou);
        app.printPopulationOfPeopleInWorld(country9);
    }

    //Testing for Population Of People In A Continent
    @Test
    void printPopulationOfPeopleInAContinentTestNull()
    {
        app.printPopulationOfPeopleInAContinent(null);
    }
    @Test
    void printPopulationOfPeopleInAContinentTestEmpty()
    {
        ArrayList<Country> country10 = new ArrayList<Country>();
        app.printPopulationOfPeopleInAContinent(country10);
    }
    @Test
    void printPopulationOfPeopleInAContinentTestContainsNull()
    {
        ArrayList<Country> country10 = new ArrayList<Country>();
        country10.add(null);
        app.printPopulationOfPeopleInAContinent(country10);
    }
    @Test
    void printPopulationOfPeopleInAContinent()
    {
        ArrayList<Country> country10 = new ArrayList<Country>();
        Country cou = new Country();
        cou.Continent = "Asia";
        cou.TotalPopulation = 3705025700L;
        cou.PeopleLivingInCities = 697604103;
        cou.PercentagePeopleLivingInCities = (float) 18.8286;
        cou.PeopleNotLivingInCities = 3007421597L;
        cou.PercentagePeopleNotLivingInCities = (float) 81.1714;
        country10.add(cou);
        app.printPopulationOfPeopleInAContinent(country10);
    }

    //Testing for Population Of People In A Region
    @Test
    void printPopulationOfPeopleInARegionTestNull()
    {
        app.printPopulationOfPeopleInARegion(null);
    }
    @Test
    void printPopulationOfPeopleInARegionTestEmpty()
    {
        ArrayList<Country> country11 = new ArrayList<Country>();
        app.printPopulationOfPeopleInARegion(country11);
    }
    @Test
    void printPopulationOfPeopleInARegionTestContainsNull()
    {
        ArrayList<Country> country11 = new ArrayList<Country>();
        country11.add(null);
        app.printPopulationOfPeopleInARegion(country11);
    }
    @Test
    void printPopulationOfPeopleInARegion()
    {
        ArrayList<Country> country11 = new ArrayList<Country>();
        Country cou = new Country();
        cou.Region = "Southeast Asia";
        cou.TotalPopulation = 518541000;
        cou.PeopleLivingInCities = 102067225;
        cou.PercentagePeopleLivingInCities = (float) 19.6835;
        cou.PeopleNotLivingInCities = 416473775;
        cou.PercentagePeopleNotLivingInCities = (float) 80.3165;
        country11.add(cou);
        app.printPopulationOfPeopleInARegion(country11);
    }

    //Testing for Population Of People In A Country
    @Test
    void printPopulationOfPeopleInACountryTestNull()
    {
        app.printPopulationOfPeopleInACountry(null);
    }
    @Test
    void printPopulationOfPeopleInACountryTestEmpty()
    {
        ArrayList<Country> country12 = new ArrayList<Country>();
        app.printPopulationOfPeopleInACountry(country12);
    }
    @Test
    void printPopulationOfPeopleInACountryTestContainsNull()
    {
        ArrayList<Country> country12 = new ArrayList<Country>();
        country12.add(null);
        app.printPopulationOfPeopleInACountry(country12);
    }
    @Test
    void printPopulationOfPeopleInACountry()
    {
        ArrayList<Country> country12 = new ArrayList<Country>();
        Country cou = new Country();
        cou.Name = "Myanmar";
        cou.TotalPopulation = 45611000;
        cou.PeopleLivingInCities = 6203000;
        cou.PercentagePeopleLivingInCities = (float) 13.5998;
        cou.PeopleNotLivingInCities = 39408000;
        cou.PercentagePeopleNotLivingInCities = (float) 86.4002;
        country12.add(cou);
        app.printPopulationOfPeopleInACountry(country12);
    }

    //Testing for Population Of People In A District
    @Test
    void printPopulationOfPeopleInADistrictTestNull()
    {
        app.printPopulationOfPeopleInADistrict(null);
    }
    @Test
    void printPopulationOfPeopleInADistrictTestEmpty()
    {
        ArrayList<City> city16 = new ArrayList<City>();
        app.printPopulationOfPeopleInADistrict(city16);
    }
    @Test
    void printPopulationOfPeopleInADistrictTestContainsNull()
    {
        ArrayList<City> city16 = new ArrayList<City>();
        city16.add(null);
        app.printPopulationOfPeopleInADistrict(city16);
    }
    @Test
    void printPopulationOfPeopleInADistrict()
    {
        ArrayList<City> city16 = new ArrayList<City>();
        City cit = new City();
        cit.TotalPopulation = 1118600;
        city16.add(cit);
        app.printPopulationOfPeopleInADistrict(city16);
    }

    //Testing for Population Of People In A City
    @Test
    void printPopulationOfPeopleInACityTestNull()
    {
        app.printPopulationOfPeopleInACity(null);
    }
    @Test
    void printPopulationOfPeopleInACityTestEmpty()
    {
        ArrayList<City> city17 = new ArrayList<City>();
        app.printPopulationOfPeopleInACity(city17);
    }
    @Test
    void printPopulationOfPeopleInACityTestContainsNull()
    {
        ArrayList<City> city17 = new ArrayList<City>();
        city17.add(null);
        app.printPopulationOfPeopleInACity(city17);
    }
    @Test
    void printPopulationOfPeopleInACity()
    {
        ArrayList<City> city17 = new ArrayList<City>();
        City cit = new City();
        cit.TotalPopulation = 885300;
        city17.add(cit);
        app.printPopulationOfPeopleInACity(city17);
    }

    //Testing for The Number of people who speak Chinese. English, Hindi, Spanish, Arabic from the greatest number to smallest Report
    @Test
    void printLanguageTestNull()
    {
        app.printLanguage(null);
    }
    @Test
    void printLanguageTestEmpty()
    {
        ArrayList<CountryLanguage> language1 = new ArrayList<CountryLanguage>();
        app.printLanguage(language1);
    }
    @Test
    void printLanguageTestContainsNull()
    {
        ArrayList<CountryLanguage> language1 = new ArrayList<CountryLanguage>();
        language1.add(null);
        app.printLanguage(language1);
    }
    @Test
    void printLanguage()
    {
        ArrayList<CountryLanguage> language1 = new ArrayList<CountryLanguage>();
        CountryLanguage lang = new CountryLanguage();
        lang.Language = "English";
        lang.TotalPopulation = 347077867L;
        lang.TotalPercentage = 5.709692F;
        language1.add(lang);
        app.printLanguage(language1);
    }


}