package com.group1.cw;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

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
        ArrayList<Country> cou = new ArrayList<>();
                cou = app.getAllCountryByPopulation();
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
        ArrayList<Country> cou = new ArrayList<>();
        cou = app.getAllCountryInContinentByPopulation();
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
        ArrayList<Country> cou = new ArrayList<>();
        cou = app.getAllCountryInRegionByPopulation();
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
        ArrayList<Country> cou = new ArrayList<>();
        cou = app.getTopPopulatedCountries();
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
        ArrayList<Country> cou = new ArrayList<>();
        cou = app.getTopPopulatedCountriesInContinent();
        assertEquals(cou.get(0).Capital, "Peking");
        assertEquals(cou.get(0).Code, "CHN");
        assertEquals(cou.get(0).Name, "China");
        assertEquals(cou.get(0).Continent, "Asia");
        assertEquals(cou.get(0).Region, "Eastern Asia");
        assertEquals(cou.get(0).Population, 1277558000);
    }
}