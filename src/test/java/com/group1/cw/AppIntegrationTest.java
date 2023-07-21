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

    @Test
    void testGetCountry()
    {
        Country cou = app.getCountry(2710);
        assertEquals(cou.Capital, "2710");
        assertEquals(cou.Code, "MMR");
        assertEquals(cou.Name, "Myanmar");
        assertEquals(cou.Continent, "Asia");
        assertEquals(cou.Region, "Southeast Asia");
        assertEquals(cou.Population, 45611000);
    }

    @Test
    void testGetCity()
    {
        City cit = app.getCity(2710);
        assertEquals(cit.ID, 2710);
        assertEquals(cit.Name, "Rangoon (Yangon)");
        assertEquals(cit.CountryCode, "MMR");
        assertEquals(cit.District, "Rangoon [Yangon]");
        assertEquals(cit.Population, 3361700);
    }
}