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
        cou.Code = "MMR";
        cou.Name = "Myanmar";
        cou.Continent = "Asia";
        cou.Region = "Southeast Asia";
        cou.Population = 45611000;
        cou.Capital = "2710";
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
        cou.Code = "MMR";
        cou.Name = "Myanmar";
        cou.Continent = "Asia";
        cou.Region = "Southeast Asia";
        cou.Population = 45611000;
        cou.Capital = "2710";
        country1.add(cou);
        app.printCountriesInContinentByPopulation(country1);
    }


}