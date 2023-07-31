package com.group1.cw;

import java.sql.*;
import java.util.ArrayList;

public class App
{

    /**
     * Connection to MySQL database.
     */
    private Connection con = null;

    /**
     * Connect to the MySQL database.
     */
    public void connect(String location, int delay) {
        try {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i) {
            System.out.println("Connecting to database...");
            try {
                // Wait a bit for db to start
                Thread.sleep(delay);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://" + location
                                + "/world?allowPublicKeyRetrieval=true&useSSL=false",
                        "root", "example");
                System.out.println("Successfully connected");
                break;
            } catch (SQLException sqle) {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            } catch (InterruptedException ie) {
                System.out.println("Thread interrupted? Should not happen.");
            }
        }
    }

    /**
     * Disconnect from the MySQL database.
     */
    public void disconnect()
    {
        if (con != null)
        {
            try
            {
                // Close connection
                con.close();
            }
            catch (Exception e)
            {
                System.out.println("Error closing connection to database");
            }
        }
    }

    public static void main(String[] args)
    {
        // Create new Application and connect to database
        App a = new App();

        if(args.length < 1){
            a.connect("localhost:33060", 30000);
        }else{
            a.connect(args[0], Integer.parseInt(args[1]));
        }

//        // Get Country
//        Country cou = a.getCountry(129);
//        // Display results
//        a.displayCountry(cou);


        // Countries
        // Extract country city information
        ArrayList<Country> country = a.getAllCountryByPopulation();
        // Test the size of the returned data
        System.out.println(country.size());
        // Print Countries By Population (country)
        a.printCountriesByPopulation(country);

        // Countries in a Continent
        // Extract country city information
        ArrayList<Country> country1 = a.getAllCountryInContinentByPopulation();
        // Test the size of the returned data
        System.out.println(country1.size());
        // Print Countries in a Continent By Population (country)
        a.printCountriesInContinentByPopulation(country1);

        // Countries in a Region
        // Extract country city information
        ArrayList<Country> country2 = a.getAllCountryInRegionByPopulation();
        // Test the size of the returned data
        System.out.println(country2.size());
        // Print Countries in a Region By Population (country)
        a.printCountriesInRegionByPopulation(country2);

        // Top Populated Countries
        // Extract country city information
        ArrayList<Country> country3 = a.getTopPopulatedCountries();
        // Test the size of the returned data
        System.out.println(country3.size());
        // Print Top Populated Countries (country)
        a.printTopPopulatedCountries(country3);

        // Top Populated Countries in a Continent
        // Extract country city information
        ArrayList<Country> country4 = a.getTopPopulatedCountriesInContinent();
        // Test the size of the returned data
        System.out.println(country4.size());
        // Print Top Populated Countries in a Continent (country)
        a.printTopPopulatedCountriesInContinent(country4);

        // Top Populated Countries in a Region
        // Extract country city information
        ArrayList<Country> country5 = a.getTopPopulatedCountriesInRegion();
        // Test the size of the returned data
        System.out.println(country5.size());
        // Print Top Populated Countries in a Region (country)
        a.printTopPopulatedCountriesInRegion(country5);


        // City
        // Extract country city information
        ArrayList<City> city = a.getAllCitiesByPopulation();
        // Test the size of the returned data
        System.out.println(city.size());
        // Print Cities By Population (city)
        a.printCitiesByPopulation(city);

        // Cities in a Continent
        // Extract city country information
        ArrayList<City> city1 = a.getAllCitiesInContinentByPopulation();
        // Test the size of the returned data
        System.out.println(city1.size());
        // Print Cities in a Continent By Population (city)
        a.printCitiesInContinentByPopulation(city1);

        // Cities in a Region
        // Extract city country information
        ArrayList<City> city2 = a.getAllCitiesInRegionByPopulation();
        // Test the size of the returned data
        System.out.println(city2.size());
        // Print Cities in a Region By Population (city)
        a.printCitiesInRegionByPopulation(city2);

        // Cities in a Country
        // Extract city country information
        ArrayList<City> city3 = a.getAllCitiesInCountryByPopulation();
        // Test the size of the returned data
        System.out.println(city3.size());
        // Print Cities in a Country By Population (city)
        a.printCitiesInCountryByPopulation(city3);

        // Cities in a District
        // Extract city country information
        ArrayList<City> city4 = a.getAllCitiesInDistrictByPopulation();
        // Test the size of the returned data
        System.out.println(city4.size());
        // Print Cities in a District By Population (city)
        a.printCitiesInDistrictByPopulation(city4);

        // Top Populated Cities
        // Extract city country information
        ArrayList<City> city5 = a.getTopPopulatedCities();
        // Test the size of the returned data
        System.out.println(city5.size());
        // Print Top Populated Cities (city)
        a.printTopPopulatedCities(city5);

        // Top Populated Cities In Continent
        // Extract city country information
        ArrayList<City> city6 = a.getTopPopulatedCitiesInContinent();
        // Test the size of the returned data
        System.out.println(city6.size());
        // Print Top Populated Cities In Continent (city)
        a.printTopPopulatedCitiesInContinent(city6);

        // Top Populated Cities In Region
        // Extract city country information
        ArrayList<City> city7 = a.getTopPopulatedCitiesInRegion();
        // Test the size of the returned data
        System.out.println(city7.size());
        // Print Top Populated Cities In Region (city)
        a.printTopPopulatedCitiesInRegion(city7);

        // Top Populated Cities In Country
        // Extract city country information
        ArrayList<City> city8 = a.getTopPopulatedCitiesInCountry();
        // Test the size of the returned data
        System.out.println(city8.size());
        // Print Top Populated Cities In Country (city)
        a.printTopPopulatedCitiesInCountry(city8);

        // Top Populated Cities In District
        // Extract city country information
        ArrayList<City> city9 = a.getTopPopulatedCitiesInDistrict();
        // Test the size of the returned data
        System.out.println(city9.size());
        // Print Top Populated Cities In District (city)
        a.printTopPopulatedCitiesInDistrict(city9);

        // Capital city
        // Extract city country information
        ArrayList<City> city10 = a.getAllCapitalCitiesByPopulation();
        // Test the size of the returned data
        System.out.println(city10.size());
        // Print Capital City By Population (city)
        a.printAllCapitalCitiesByPopulation(city10);

        // Capital city In Continent
        // Extract city country information
        ArrayList<City> city11 = a.getAllCapitalCitiesInContinentByPopulation();
        // Test the size of the returned data
        System.out.println(city11.size());
        // Print Capital City In Continent By Population (city)
        a.printAllCapitalCitiesInContinentByPopulation(city11);

        // Capital city In Region
        // Extract city country information
        ArrayList<City> city12 = a.getAllCapitalCitiesInRegionByPopulation();
        // Test the size of the returned data
        System.out.println(city12.size());
        // Print Capital City In Region By Population (city)
        a.printAllCapitalCitiesInRegionByPopulation(city12);

        // Capital city In Region
        // Extract city country information
        ArrayList<City> city13 = a.getTopPopulatedCapitalCities();
        // Test the size of the returned data
        System.out.println(city13.size());
        // Print Top Populated Capital Cities By Population (city)
        a.printTopPopulatedCapitalCities(city13);

        // Capital city In Region
        // Extract city country information
        ArrayList<City> city14 = a.getTopPopulatedCapitalCitiesInContinent();
        // Test the size of the returned data
        System.out.println(city14.size());
        // Print Top Populated Capital Cities In Continent By Population (city)
        a.printTopPopulatedCapitalCitiesInContinent(city14);

        // Capital city In Region
        // Extract city country information
        ArrayList<City> city15 = a.getTopPopulatedCapitalCitiesInRegion();
        // Test the size of the returned data
        System.out.println(city15.size());
        // Print Top Populated Capital Cities In Region By Population (city)
        a.printTopPopulatedCapitalCitiesInRegion(city15);

        // Population Of People In Continent
        // Extract population information
        ArrayList<Country> country6 = a.getPopulationOfPeopleInContinent();
        // Test the size of the returned data
        System.out.println(country6.size());
        // Print Population Of People In Continent (country)
        a.printPopulationOfPeopleInContinent(country6);

        // Population Of People In Region
        // Extract population information
        ArrayList<Country> country7 = a.getPopulationOfPeopleInRegion();
        // Test the size of the returned data
        System.out.println(country7.size());
        // Print Population Of People In Region(country)
        a.printPopulationOfPeopleInRegion(country7);

        // Population Of People In Country
        // Extract population information
        ArrayList<Country> country8 = a.getPopulationOfPeopleInCountry();
        // Test the size of the returned data
        System.out.println(country8.size());
        // Print Population Of People In Country(country)
        a.printPopulationOfPeopleInCountry(country8);

        // Population Of People In World
        // Extract population information
        ArrayList<Country> country9 = a.getPopulationOfPeopleInWorld();
        // Print Population Of People In World(country)
        a.printPopulationOfPeopleInWorld(country9);

        // Disconnect from database
        a.disconnect();
    }

//    /**
//     * getCountry
//     */
//    public Country getCountry(int Capital)
//    {
//        try
//        {
//            // Create an SQL statement
//            Statement stmt = con.createStatement();
//            // Create string for SQL statement
//            String strSelect =
//                    "SELECT Code, Name, Continent, Region, SurfaceArea, IndepYear, Population, LifeExpectancy, GNP, GNPOld, LocalName, GovernmentForm, HeadOfState, Capital, Code2 "
//                            + "FROM country "
//                            + "WHERE Capital = " + Capital;
//            // Execute SQL statement
//            ResultSet rset = stmt.executeQuery(strSelect);
//            // Return new country if valid.
//            // Check one is returned
//            if (rset.next())
//            {
//                Country cou = new Country();
//                cou.Code = rset.getString("Code");
//                cou.Name = rset.getString("Name");
//                cou.Continent = rset.getString("Continent");
//                cou.Region = rset.getString("Region");
//                cou.SurfaceArea = rset.getInt("SurfaceArea");
//                cou.IndepYear = rset.getInt("IndepYear");
//                cou.Population = rset.getInt("Population");
//                cou.LifeExpectancy = rset.getInt("LifeExpectancy");
//                cou.GNP = rset.getInt("GNP");
//                cou.GNPOld = rset.getInt("GNPOld");
//                cou.LocalName = rset.getString("LocalName");
//                cou.GovernmentForm = rset.getString("GovernmentForm");
//                cou.HeadOfState = rset.getString("HeadOfState");
//                cou.Capital = rset.getString("Capital");
//                cou.Code2 = rset.getString("Code2");
//                return cou;
//            }
//            else
//                return null;
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//            System.out.println("Failed to get country details");
//            return null;
//        }
//    }
//
//    /**
//     * Display Country
//     */
//    public void displayCountry(Country cou)
//    {
//        if (cou != null)
//        {
//            System.out.println(
//                    cou.Code + " "
//                            + cou.Name + "\n"
//                            + "Continent: " + cou.Continent + "\n"
//                            + "Region: " + cou.Region + "\n"
//                            + "SurfaceArea: " + cou.SurfaceArea + "\n"
//                            + "IndepYear: " + cou.IndepYear + "\n"
//                            + "Population: " + cou.Population + "\n"
//                            + "LifeExpectancy: " + cou.LifeExpectancy + "\n"
//                            + "GNP: " + cou.GNP + "\n"
//                            + "GNPOld: " + cou.GNPOld + "\n"
//                            + "LocalName: " + cou.LocalName + "\n"
//                            + "GovernmentForm: " + cou.GovernmentForm + "\n"
//                            + "HeadOfState: " + cou.HeadOfState + "\n"
//                            + "Capital: " + cou.Capital + "\n"
//                            + "Code2: " + cou.Code2 + "\n");
//        }
//    }
//
//    /**
//     * getCity
//     */
//    public City getCity(int ID)
//    {
//        try
//        {
//            // Create an SQL statement
//            Statement stmt = con.createStatement();
//            // Create string for SQL statement
//            String strSelect =
//                    "SELECT ID, Name, CountryCode, District, Population "
//                            + "FROM city "
//                            + "WHERE ID = " + ID;
//            // Execute SQL statement
//            ResultSet rset = stmt.executeQuery(strSelect);
//            // Return new city if valid.
//            // Check one is returned
//            if (rset.next())
//            {
//                City cit = new City();
//                cit.ID = rset.getInt("ID");
//                cit.Name = rset.getString("Name");
//                cit.CountryCode = rset.getString("CountryCode");
//                cit.District = rset.getString("District");
//                cit.Population = rset.getInt("Population");
//                return cit;
//            }
//            else
//                return null;
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//            System.out.println("Failed to get city details");
//            return null;
//        }
//    }

    /**
     * Gets all the current Country and City.
     * @return A list of all Countries and Cities by largest population to smallest, or null if there is an error.
     */
    public ArrayList<Country> getAllCountryByPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name "
                            + "FROM country, city "
                            + "WHERE country.Capital = city.ID "
                            + "ORDER BY country.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract country information
            ArrayList<Country> country = new ArrayList<Country>();
            while (rset.next())
            {
                Country cou = new Country();
                cou.Code = rset.getString("country.Code");
                cou.Name = rset.getString("country.Name");
                cou.Continent = rset.getString("country.Continent");
                cou.Region = rset.getString("country.Region");
                cou.Population = rset.getInt("country.Population");
                cou.Capital = rset.getString("city.Name");
                country.add(cou);
            }
            return country;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param country The list of country to print.
     */
    public void printCountriesByPopulation(ArrayList<Country> country)
    {
        // Check country is not null
        if (country == null)
        {
            System.out.println("No countries");
            return;
        }

        // Title
        System.out.println("Country Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-10s %-20s %-20s %-20s %-20s %-20s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cou : country)
        {
            if (cou == null)
                continue;
            String cou_string =
                    String.format("%-10s %-20s %-20s %-20s %-20s %-20s",
                            cou.Code, cou.Name, cou.Continent, cou.Region, cou.Population, cou.Capital);
            System.out.println(cou_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /**
     * Gets all the current Country and City.
     * @return A list of Countries and Cities in Asia by largest population to smallest or null if there is an error.
     */
    public ArrayList<Country> getAllCountryInContinentByPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name "
                            + "FROM country, city "
                            + "WHERE country.Capital = city.ID AND country.Continent = 'Asia'"
                            + "ORDER BY country.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract country information
            ArrayList<Country> country1 = new ArrayList<Country>();
            while (rset.next())
            {
                Country cou = new Country();
                cou.Code = rset.getString("country.Code");
                cou.Name = rset.getString("country.Name");
                cou.Continent = rset.getString("country.Continent");
                cou.Region = rset.getString("country.Region");
                cou.Population = rset.getInt("country.Population");
                cou.Capital = rset.getString("city.Name");
                country1.add(cou);
            }
            return country1;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param country1 The list of country to print.
     */
    public void printCountriesInContinentByPopulation(ArrayList<Country> country1)
    {
        // Check country is not null
        if (country1 == null)
        {
            System.out.println("No countries in continent");
            return;
        }

        // Title
        System.out.println("Country Report In a Continent (Asia) by Highest Population to Lowest");
        // Print header
        System.out.println(String.format("%-10s %-20s %-20s %-20s %-20s %-20s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cou : country1)
        {
            if (cou == null)
                continue;
            String cou_string =
                    String.format("%-10s %-20s %-20s %-20s %-20s %-20s",
                            cou.Code, cou.Name, cou.Continent, cou.Region, cou.Population, cou.Capital);
            System.out.println(cou_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    /**
     * Gets all the current Country and City.
     * @return A list of Countries and Cities in South America by largest population to smallest or null if there is an error.
     */
    public ArrayList<Country> getAllCountryInRegionByPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name "
                            + "FROM country, city "
                            + "WHERE country.Capital = city.ID AND country.Region = 'South America'"
                            + "ORDER BY country.Population DESC ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract country information
            ArrayList<Country> country2 = new ArrayList<Country>();
            while (rset.next())
            {
                Country cou = new Country();
                cou.Code = rset.getString("country.Code");
                cou.Name = rset.getString("country.Name");
                cou.Continent = rset.getString("country.Continent");
                cou.Region = rset.getString("country.Region");
                cou.Population = rset.getInt("country.Population");
                cou.Capital = rset.getString("city.Name");
                country2.add(cou);
            }
            return country2;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param country2 The list of country to print.
     */
    public void printCountriesInRegionByPopulation(ArrayList<Country> country2)
    {
        // Check country is not null
        if (country2 == null)
        {
            System.out.println("No countries in Region");
            return;
        }

        // Title
        System.out.println("Country Report In a Region (South America) by Highest Population to Lowest");
        // Print header
        System.out.println(String.format("%-10s %-20s %-20s %-20s %-20s %-20s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cou : country2)
        {
            if (cou == null)
                continue;
            String cou_string =
                    String.format("%-10s %-20s %-20s %-20s %-20s %-20s",
                            cou.Code, cou.Name, cou.Continent, cou.Region, cou.Population, cou.Capital);
            System.out.println(cou_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets all the current Country and City.
     * @return A list of Top Countries and Cities by largest population to smallest, or null if there is an error.
     */
    public ArrayList<Country> getTopPopulatedCountries()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name "
                            + "FROM country, city "
                            + "WHERE country.Capital = city.ID "
                            + "ORDER BY country.Population DESC " + "LIMIT 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract country information
            ArrayList<Country> country3 = new ArrayList<Country>();
            while (rset.next())
            {
                Country cou = new Country();
                cou.Code = rset.getString("country.Code");
                cou.Name = rset.getString("country.Name");
                cou.Continent = rset.getString("country.Continent");
                cou.Region = rset.getString("country.Region");
                cou.Population = rset.getInt("country.Population");
                cou.Capital = rset.getString("city.Name");
                country3.add(cou);
            }
            return country3;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param country3 The list of country to print.
     */
    public void printTopPopulatedCountries(ArrayList<Country> country3)
    {
        // Check country is not null
        if (country3 == null)
        {
            System.out.println("No top populated countries");
            return;
        }

        // Title
        System.out.println("Top Populated Countries Report");

        // Print header
        System.out.println(String.format("%-10s %-20s %-20s %-20s %-20s %-20s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cou : country3)
        {
            if (cou == null)
                continue;
            String cou_string =
                    String.format("%-10s %-20s %-20s %-20s %-20s %-20s",
                            cou.Code, cou.Name, cou.Continent, cou.Region, cou.Population, cou.Capital);
            System.out.println(cou_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets all the current Country and City.
     * @return A list of Top Countries and Cities in Continent by largest population to smallest, or null if there is an error.
     */
    public ArrayList<Country> getTopPopulatedCountriesInContinent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name "
                            + "FROM country, city "
                            + "WHERE country.Capital = city.ID  AND country.Continent = 'Asia'"
                            + "ORDER BY country.Population DESC " + "LIMIT 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract country information
            ArrayList<Country> country4 = new ArrayList<Country>();
            while (rset.next())
            {
                Country cou = new Country();
                cou.Code = rset.getString("country.Code");
                cou.Name = rset.getString("country.Name");
                cou.Continent = rset.getString("country.Continent");
                cou.Region = rset.getString("country.Region");
                cou.Population = rset.getInt("country.Population");
                cou.Capital = rset.getString("city.Name");
                country4.add(cou);
            }
            return country4;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param country4 The list of country to print.
     */
    public void printTopPopulatedCountriesInContinent(ArrayList<Country> country4)
    {
        // Check country is not null
        if (country4 == null)
        {
            System.out.println("No top populated countries in continent");
            return;
        }

        // Title
        System.out.println("Top Populated Countries In a Continent (Asia) Report");

        // Print header
        System.out.println(String.format("%-10s %-20s %-20s %-30s %-20s %-20s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cou : country4)
        {
            if (cou == null)
                continue;
            String cou_string =
                    String.format("%-10s %-20s %-20s %-30s %-20s %-20s",
                            cou.Code, cou.Name, cou.Continent, cou.Region, cou.Population, cou.Capital);
            System.out.println(cou_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets all the current Country and City.
     * @return A list of Top Countries and Cities in Region by largest population to smallest, or null if there is an error.
     */
    public ArrayList<Country> getTopPopulatedCountriesInRegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Code, country.Name, country.Continent, country.Region, country.Population, city.Name "
                            + "FROM country, city "
                            + "WHERE country.Capital = city.ID  AND country.Region = 'North America'"
                            + "ORDER BY country.Population DESC " + "LIMIT 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract country information
            ArrayList<Country> country5 = new ArrayList<Country>();
            while (rset.next())
            {
                Country cou = new Country();
                cou.Code = rset.getString("country.Code");
                cou.Name = rset.getString("country.Name");
                cou.Continent = rset.getString("country.Continent");
                cou.Region = rset.getString("country.Region");
                cou.Population = rset.getInt("country.Population");
                cou.Capital = rset.getString("city.Name");
                country5.add(cou);
            }
            return country5;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param country5 The list of country to print.
     */
    public void printTopPopulatedCountriesInRegion(ArrayList<Country> country5)
    {
        // Check country is not null
        if (country5 == null)
        {
            System.out.println("No top populated countries in region");
            return;
        }

        // Title
        System.out.println("Top Populated Countries In a Region (North America) Report");

        // Print header
        System.out.println(String.format("%-10s %-20s %-20s %-30s %-20s %-20s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all cities in the list
        for (Country cou : country5)
        {
            if (cou == null)
                continue;
            String cou_string =
                    String.format("%-10s %-20s %-20s %-30s %-20s %-20s",
                            cou.Code, cou.Name, cou.Continent, cou.Region, cou.Population, cou.Capital);
            System.out.println(cou_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /**
     * Gets all the current City and Country.
     * @return A list of all Cities and Countries by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getAllCitiesByPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population " +
                            "FROM city, country " +
                            "WHERE city.CountryCode = country.Code " +
                            "ORDER BY city.Population DESC;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract city information
            ArrayList<City> city = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.District = rset.getString("city.District");
                cit.Population = rset.getInt("city.Population");
                city.add(cit);
            }
            return city;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param city The list of country to print.
     */
    public void printCitiesByPopulation(ArrayList<City> city)
    {
        // Check city is not null
        if (city == null)
        {
            System.out.println("No cities");
            return;
        }

        // Title
        System.out.println("City Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s %-30s", "CityName", "CountryName", "District", "Population"));
        // Loop over all cities in the list
        for (City cit : city)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.District, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /**
     * Gets all the current City and Country.
     * @return A list of Cities and Countries in Asia by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getAllCitiesInContinentByPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population " +
                            "FROM city, country " +
                            "WHERE city.CountryCode = country.Code AND country.Continent = 'Asia'" +
                            "ORDER BY city.Population DESC;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract city information
            ArrayList<City> city1 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.District = rset.getString("city.District");
                cit.Population = rset.getInt("city.Population");
                city1.add(cit);
            }
            return city1;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param city1 The list of country to print.
     */
    public void printCitiesInContinentByPopulation(ArrayList<City> city1)
    {
        // Check city is not null
        if (city1 == null)
        {
            System.out.println("No cities in continent");
            return;
        }

        // Title
        System.out.println("Cities In A Continent (Asia) Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s %-30s", "CityName", "CountryName", "District", "Population"));
        // Loop over all cities in the list
        for (City cit : city1)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.District, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /**
     * Gets all the current City and Country.
     * @return A list of Cities and Countries in Southeast Asia by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getAllCitiesInRegionByPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population " +
                            "FROM city, country " +
                            "WHERE city.CountryCode = country.Code " +
                            "AND country.Region='Southeast Asia' " +
                            "ORDER BY city.Population DESC;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract city information
            ArrayList<City> city2 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.District = rset.getString("city.District");
                cit.Population = rset.getInt("city.Population");
                city2.add(cit);
            }
            return city2;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param city2 The list of country to print.
     */
    public void printCitiesInRegionByPopulation(ArrayList<City> city2)
    {
        // Check city is not null
        if (city2 == null)
        {
            System.out.println("No cities in Region");
            return;
        }

        // Title
        System.out.println("Cities In A Region (Southeast Asia) Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s %-30s", "CityName", "CountryName", "District", "Population"));
        // Loop over all cities in the list
        for (City cit : city2)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.District, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /**
     * Gets all the current City and Country.
     * @return A list of Cities in Myanmar by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getAllCitiesInCountryByPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population " +
                            "FROM city, country " +
                            "WHERE city.CountryCode = country.Code " +
                            "AND country.Name='Myanmar' " +
                            "ORDER BY city.Population DESC;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract city information
            ArrayList<City> city3 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.District = rset.getString("city.District");
                cit.Population = rset.getInt("city.Population");
                city3.add(cit);
            }
            return city3;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param city3 The list of country to print.
     */
    public void printCitiesInCountryByPopulation(ArrayList<City> city3)
    {
        // Check city is not null
        if (city3 == null)
        {
            System.out.println("No cities in Country");
            return;
        }

        // Title
        System.out.println("Cities In A Country (Myanmar) Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s %-30s", "CityName", "CountryName", "District", "Population"));
        // Loop over all cities in the list
        for (City cit : city3)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.District, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /**
     * Gets all the current City and Country.
     * @return A list of Mandalay by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getAllCitiesInDistrictByPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population " +
                            "FROM city, country " +
                            "WHERE city.CountryCode = country.Code " +
                            "AND city.District='Mandalay' " +
                            "ORDER BY city.Population DESC;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract city information
            ArrayList<City> city4 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.District = rset.getString("city.District");
                cit.Population = rset.getInt("city.Population");
                city4.add(cit);
            }
            return city4;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param city4 The list of country to print.
     */
    public void printCitiesInDistrictByPopulation(ArrayList<City> city4)
    {
        // Check city is not null
        if (city4 == null)
        {
            System.out.println("No cities in District");
            return;
        }

        // Title
        System.out.println("Cities in District (Mandalay) Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s %-30s", "CityName", "CountryName", "District", "Population"));
        // Loop over all cities in the list
        for (City cit : city4)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.District, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets all the current City and Country.
     * @return A list of Top Cities and Countries by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getTopPopulatedCities()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population " +
                            "FROM city, country " +
                            "WHERE city.CountryCode = country.Code " +
                            "ORDER BY city.Population " +
                            "DESC LIMIT 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city5 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.District = rset.getString("city.District");
                cit.Population = rset.getInt("city.Population");
                city5.add(cit);
            }
            return city5;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param city5 The list of city to print.
     */
    public void printTopPopulatedCities(ArrayList<City> city5)
    {
        // Check city is not null
        if (city5 == null)
        {
            System.out.println("No top populated cities");
            return;
        }

        // Title
        System.out.println("Top Populated Cities Report");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s %-30s", "CityName", "CountryName", "District", "Population"));
        // Loop over all cities in the list
        for (City cit : city5)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.District, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets the current City and Country.
     * @return A list of Top Cities and Countries in Continent by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getTopPopulatedCitiesInContinent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population " +
                            "FROM city, country " +
                            "WHERE city.CountryCode = country.Code " +
                            "AND country.Continent= 'Asia' " +
                            "ORDER BY city.Population " +
                            "DESC LIMIT 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city6 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.District = rset.getString("city.District");
                cit.Population = rset.getInt("city.Population");
                city6.add(cit);
            }
            return city6;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param city6 The list of city to print.
     */
    public void printTopPopulatedCitiesInContinent(ArrayList<City> city6)
    {
        // Check city is not null
        if (city6 == null)
        {
            System.out.println("No top populated cities in continent");
            return;
        }
        // Title
        System.out.println("Top Populated Cities In Continent (Asia) Report");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s %-30s", "CityName", "CountryName", "District", "Population"));
        // Loop over all cities in the list
        for (City cit : city6)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.District, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets the current City and Country.
     * @return A list of Top Cities and Countries in Region by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getTopPopulatedCitiesInRegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population " +
                            "FROM city, country " +
                            "WHERE city.CountryCode = country.Code " +
                            "AND country.Region='Southeast Asia' " +
                            "ORDER BY city.Population " +
                            "DESC LIMIT 10";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city7 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.District = rset.getString("city.District");
                cit.Population = rset.getInt("city.Population");
                city7.add(cit);
            }
            return city7;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param city7 The list of city to print.
     */
    public void printTopPopulatedCitiesInRegion(ArrayList<City> city7)
    {
        // Check city is not null
        if (city7 == null)
        {
            System.out.println("No top populated cities in Region");
            return;
        }

        // Title
        System.out.println("Top Populated Cities In Region (Southeast Asia) Report");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s %-30s", "CityName", "CountryName", "District", "Population"));
        // Loop over all cities in the list
        for (City cit : city7)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.District, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets the current City and Country.
     * @return A list of Top Cities and Countries in Country by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getTopPopulatedCitiesInCountry()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population " +
                            "FROM city, country " +
                            "WHERE city.CountryCode = country.Code " +
                            "AND country.Name='Myanmar' " +
                            "ORDER BY city.Population " +
                            "DESC LIMIT 10; ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city8 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.District = rset.getString("city.District");
                cit.Population = rset.getInt("city.Population");
                city8.add(cit);
            }
            return city8;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param city8 The list of city to print.
     */
    public void printTopPopulatedCitiesInCountry(ArrayList<City> city8)
    {
        // Check city is not null
        if (city8 == null)
        {
            System.out.println("No top populated cities in Country");
            return;
        }

        // Title
        System.out.println("Top Populated Cities In Country (Myanmar) Report");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s %-30s", "CityName", "CountryName", "District", "Population"));
        // Loop over all cities in the list
        for (City cit : city8)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.District, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets the current City and Country.
     * @return A list of Top Cities and Countries in District by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getTopPopulatedCitiesInDistrict()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.District, city.Population " +
                            "FROM city, country " +
                            "WHERE city.CountryCode = country.Code " +
                            "AND city.District='New York' " +
                            "ORDER BY city.Population " +
                            "DESC LIMIT 10;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city9 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.District = rset.getString("city.District");
                cit.Population = rset.getInt("city.Population");
                city9.add(cit);
            }
            return city9;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city details");
            return null;
        }
    }

    /**
     * Prints a list of country.
     * @param city9 The list of city to print.
     */
    public void printTopPopulatedCitiesInDistrict(ArrayList<City> city9)
    {
        // Check city is not null
        if (city9 == null)
        {
            System.out.println("No top populated cities in District");
            return;
        }

        // Title
        System.out.println("Top Populated Cities In District (New York) Report");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s %-30s", "CityName", "CountryName", "District", "Population"));
        // Loop over all cities in the list
        for (City cit : city9)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.District, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets the current City and Country.
     * @return A list of All Capital Cities by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getAllCapitalCitiesByPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population " +
                            "FROM city, country " +
                            "WHERE city.ID = country.Capital " +
                            "ORDER BY city.Population DESC;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city10 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.Population = rset.getInt("city.Population");
                city10.add(cit);
            }
            return city10;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to capital get city details");
            return null;
        }
    }

    /**
     * Prints a list of Capital Cities.
     * @param city10 The list of city to print.
     */
    public void printAllCapitalCitiesByPopulation(ArrayList<City> city10)
    {
        // Check city is not null
        if (city10 == null)
        {
            System.out.println("No Capital Cities");
            return;
        }

        // Title
        System.out.println("Capital City Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s", "CityName", "CountryName", "Population"));
        // Loop over all capital cities in the list
        for (City cit : city10)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets the current City and Country.
     * @return A list of All Capital Cities In Continent by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getAllCapitalCitiesInContinentByPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population " +
                            "FROM city, country " +
                            "WHERE city.ID = country.Capital " +
                            "AND country.Continent='Asia' " +
                            "ORDER BY city.Population DESC;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract City information
            ArrayList<City> city11 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.Population = rset.getInt("city.Population");
                city11.add(cit);
            }
            return city11;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }

    /**
     * Prints a list of Capital Cities.
     * @param city11 The list of city to print.
     */
    public void printAllCapitalCitiesInContinentByPopulation(ArrayList<City> city11)
    {
        // Check city is not null
        if (city11 == null)
        {
            System.out.println("No Capital Cities In Continent");
            return;
        }

        // Title
        System.out.println("Capital City In Continent (Asia) Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s", "CityName", "CountryName", "Population"));
        // Loop over capital cities in the list
        for (City cit : city11)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets the current City and Country.
     * @return A list of All Capital Cities In Region by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getAllCapitalCitiesInRegionByPopulation()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population " +
                            "FROM city, country " +
                            "WHERE city.ID = country.Capital " +
                            "AND country.Region='Southeast Asia' " +
                            "ORDER BY city.Population DESC;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Capital City information
            ArrayList<City> city12 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.Population = rset.getInt("city.Population");
                city12.add(cit);
            }
            return city12;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }

    /**
     * Prints a list of Capital Cities.
     * @param city12 The list of city to print.
     */
    public void printAllCapitalCitiesInRegionByPopulation(ArrayList<City> city12)
    {
        // Check city is not null
        if (city12 == null)
        {
            System.out.println("No Capital Cities In Region");
            return;
        }

        // Title
        System.out.println("Capital City In Region (Southeast Asia) Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s", "CityName", "CountryName", "Population"));
        // Loop over capital cities in the list
        for (City cit : city12)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets the current City and Country.
     * @return A list of Top Populated Capital Cities by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getTopPopulatedCapitalCities()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population " +
                            "FROM city, country " +
                            "WHERE city.ID = country.Capital " +
                            "ORDER BY city.Population " +
                            "DESC LIMIT 10;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Capital City information
            ArrayList<City> city13 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.Population = rset.getInt("city.Population");
                city13.add(cit);
            }
            return city13;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }

    /**
     * Prints a list of Capital Cities.
     * @param city13 The list of city to print.
     */
    public void printTopPopulatedCapitalCities(ArrayList<City> city13)
    {
        // Check city is not null
        if (city13 == null)
        {
            System.out.println("No Top Populated Capital Cities");
            return;
        }

        // Title
        System.out.println("Top Populated Capital City Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s", "CityName", "CountryName", "Population"));
        // Loop over capital cities in the list
        for (City cit : city13)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets the current City and Country.
     * @return A list of Top Populated Capital Cities In Continent by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getTopPopulatedCapitalCitiesInContinent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population " +
                            "FROM city, country " +
                            "WHERE city.ID = country.Capital " +
                            "AND country.Continent='Asia' " +
                            "ORDER BY city.Population " +
                            "DESC LIMIT 10;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Capital City information
            ArrayList<City> city14 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.Population = rset.getInt("city.Population");
                city14.add(cit);
            }
            return city14;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }

    /**
     * Prints a list of Capital Cities.
     * @param city14 The list of city to print.
     */
    public void printTopPopulatedCapitalCitiesInContinent(ArrayList<City> city14)
    {
        // Check city is not null
        if (city14 == null)
        {
            System.out.println("No Top Populated Capital Cities In Continent");
            return;
        }

        // Title
        System.out.println("Top Populated Capital City In Continent (Asia) Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s", "CityName", "CountryName", "Population"));
        // Loop over capital cities in the list
        for (City cit : city14)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets the current City and Country.
     * @return A list of Top Populated Capital Cities In Region by largest population to smallest, or null if there is an error.
     */
    public ArrayList<City> getTopPopulatedCapitalCitiesInRegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT city.Name, country.Name, city.Population " +
                            "FROM city, country " +
                            "WHERE city.ID = country.Capital " +
                            "AND country.Region='Southeast Asia' " +
                            "ORDER BY city.Population " +
                            "DESC LIMIT 10;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Capital City information
            ArrayList<City> city15 = new ArrayList<City>();
            while (rset.next())
            {
                City cit = new City();
                cit.Name = rset.getString("city.Name");
                cit.CountryCode = rset.getString("country.Name");
                cit.Population = rset.getInt("city.Population");
                city15.add(cit);
            }
            return city15;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get capital city details");
            return null;
        }
    }

    /**
     * Prints a list of Capital Cities.
     * @param city15 The list of city to print.
     */
    public void printTopPopulatedCapitalCitiesInRegion(ArrayList<City> city15)
    {
        // Check city is not null
        if (city15 == null)
        {
            System.out.println("No Top Populated Capital Cities In Region");
            return;
        }

        // Title
        System.out.println("Top Populated Capital City In Region (Southeast Asia) Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s", "CityName", "CountryName", "Population"));
        // Loop over capital cities in the list
        for (City cit : city15)
        {
            if (cit == null)
                continue;
            String cit_string =
                    String.format("%-30s %-30s %-30s",
                            cit.Name, cit.CountryCode, cit.Population);
            System.out.println(cit_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets the current City and Country.
     * @return A list of population of people, people living in cities, and people not living in cities in each continent, or null if there is an error.
     */
    public ArrayList<Country> getPopulationOfPeopleInContinent()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Continent, " +
                            "SUM(country.Population) AS total_population, " +
                            "SUM(coalesce(city.Population, 0)) AS people_living_in_cities, " +
                            "(SUM(coalesce(city.Population, 0)) / SUM(country.Population)) * 100 AS percentage_people_living_in_cities, " +
                            "SUM(country.Population - coalesce(city.Population, 0)) AS people_not_living_in_cities, " +
                            "((SUM(country.Population) - SUM(coalesce(city.Population, 0))) / SUM(country.Population)) * 100 AS percentage_people_not_living_in_cities " +
                            "FROM country " +
                            "LEFT JOIN (SELECT CountryCode, SUM(Population) AS Population " +
                            "FROM city GROUP BY CountryCode) city " +
                            "ON country.Code = city.CountryCode " +
                            "GROUP BY country.Continent; ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Country> country6 = new ArrayList<Country>();
            while (rset.next())
            {
                Country cou = new Country();
                cou.Continent = rset.getString("country.Continent");
                cou.TotalPopulation = rset.getLong("total_population");
                cou.PeopleLivingInCities = rset.getLong("people_living_in_cities");
                cou.PercentagePeopleLivingInCities = rset.getFloat("percentage_people_living_in_cities");
                cou.PeopleNotLivingInCities = rset.getLong("people_not_living_in_cities");
                cou.PercentagePeopleNotLivingInCities = rset.getFloat("percentage_people_not_living_in_cities");
                country6.add(cou);
            }
            return country6;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * Prints a list of Capital Cities.
     * @param country6 The list of city to print.
     */
    public void printPopulationOfPeopleInContinent(ArrayList<Country> country6)
    {
        // Check country is not null
        if (country6 == null)
        {
            System.out.println("No Population Of People In Continent");
            return;
        }

        // Title
        System.out.println("Population Of People In Continent Report");

        // Print header
        System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s %-20s", "ContinentName", "TotalPopulation", "PeopleInCity", "PeopleInCity(%)", "PeopleNotInCity", "PeopleNotInCity(%)"));
        // Loop over capital cities in the list
        for (Country cou : country6)
        {
            if (cou == null)
                continue;
            String cou_string =
                    String.format("%-20s %-20s %-20s %-20s %-20s %-20s",
                            cou.Continent, cou.TotalPopulation, cou.PeopleLivingInCities, cou.PercentagePeopleLivingInCities+"%", cou.PeopleNotLivingInCities, cou.PercentagePeopleNotLivingInCities+"%");
            System.out.println(cou_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets the current City and Country.
     * @return A list of population of people, people living in cities, and people not living in cities in each Region, or null if there is an error.
     */
    public ArrayList<Country> getPopulationOfPeopleInRegion()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Region, " +
                            "SUM(country.Population) AS total_population_in_region, " +
                            "SUM(coalesce(city.Population, 0)) AS people_living_in_cities, " +
                            "(SUM(coalesce(city.Population, 0)) / SUM(country.Population)) * 100 AS percentage_people_living_in_cities, " +
                            "SUM(country.Population - coalesce(city.Population, 0)) AS people_not_living_in_cities, " +
                            "((SUM(country.Population) - SUM(coalesce(city.Population, 0))) / SUM(country.Population)) * 100 AS percentage_people_not_living_in_cities " +
                            "FROM country " +
                            "LEFT JOIN (SELECT CountryCode, SUM(Population) AS Population " +
                            "FROM city GROUP BY CountryCode) city " +
                            "ON country.Code = city.CountryCode " +
                            "GROUP BY country.Region; ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Country> country7 = new ArrayList<Country>();
            while (rset.next())
            {
                Country cou = new Country();
                cou.Region = rset.getString("country.Region");
                cou.TotalPopulation = rset.getLong("total_population_in_region");
                cou.PeopleLivingInCities = rset.getLong("people_living_in_cities");
                cou.PercentagePeopleLivingInCities = rset.getFloat("percentage_people_living_in_cities");
                cou.PeopleNotLivingInCities = rset.getLong("people_not_living_in_cities");
                cou.PercentagePeopleNotLivingInCities = rset.getFloat("percentage_people_not_living_in_cities");
                country7.add(cou);
            }
            return country7;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * Prints a list of Capital Cities.
     * @param country7 The list of city to print.
     */
    public void printPopulationOfPeopleInRegion(ArrayList<Country> country7)
    {
        // Check country is not null
        if (country7 == null)
        {
            System.out.println("No Population Of People In Region");
            return;
        }

        // Title
        System.out.println("Population Of People In Region Report");

        // Print header
        System.out.println(String.format("%-30s %-20s %-20s %-20s %-20s %-20s", "RegionName", "TotalPopulation", "PeopleInCity", "PeopleInCity(%)", "PeopleNotInCity", "PeopleNotInCity(%)"));
        // Loop over capital cities in the list
        for (Country cou : country7)
        {
            if (cou == null)
                continue;
            String cou_string =
                    String.format("%-30s %-20s %-20s %-20s %-20s %-20s",
                            cou.Region, cou.TotalPopulation, cou.PeopleLivingInCities, cou.PercentagePeopleLivingInCities+"%", cou.PeopleNotLivingInCities, cou.PercentagePeopleNotLivingInCities+"%");
            System.out.println(cou_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets the current City and Country.
     * @return A list of population of people, people living in cities, and people not living in cities in each Country, or null if there is an error.
     */
    public ArrayList<Country> getPopulationOfPeopleInCountry()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT country.Name, " +
                            "SUM(country.Population) AS total_population_in_country, " +
                            "SUM(coalesce(city.Population, 0)) AS people_living_in_cities, " +
                            "(SUM(coalesce(city.Population, 0)) / SUM(country.Population)) * 100 AS percentage_people_living_in_cities, " +
                            "SUM(country.Population - coalesce(city.Population, 0)) AS people_not_living_in_cities, " +
                            "((SUM(country.Population) - SUM(coalesce(city.Population, 0))) / SUM(country.Population)) * 100 AS percentage_people_not_living_in_cities " +
                            "FROM country " +
                            "LEFT JOIN (SELECT CountryCode, SUM(Population) AS Population " +
                            "FROM city GROUP BY CountryCode) city " +
                            "ON country.Code = city.CountryCode " +
                            "GROUP BY country.Name; ";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Country> country8 = new ArrayList<Country>();
            while (rset.next())
            {
                Country cou = new Country();
                cou.Name = rset.getString("country.Name");
                cou.TotalPopulation = rset.getLong("total_population_in_country");
                cou.PeopleLivingInCities = rset.getLong("people_living_in_cities");
                cou.PercentagePeopleLivingInCities = rset.getFloat("percentage_people_living_in_cities");
                cou.PeopleNotLivingInCities = rset.getLong("people_not_living_in_cities");
                cou.PercentagePeopleNotLivingInCities = rset.getFloat("percentage_people_not_living_in_cities");
                country8.add(cou);
            }
            return country8;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * Prints a list of Capital Cities.
     * @param country8 The list of city to print.
     */
    public void printPopulationOfPeopleInCountry(ArrayList<Country> country8)
    {
        // Check country is not null
        if (country8 == null)
        {
            System.out.println("No Population Of People In Country");
            return;
        }

        // Title
        System.out.println("Population Of People In Country Report");

        // Print header
        System.out.println(String.format("%-45s %-20s %-20s %-20s %-20s %-20s", "CountryName", "TotalPopulation", "PeopleInCity", "PeopleInCity(%)", "PeopleNotInCity", "PeopleNotInCity(%)"));
        // Loop over capital cities in the list
        for (Country cou : country8)
        {
            if (cou == null)
                continue;
            String cou_string =
                    String.format("%-45s %-20s %-20s %-20s %-20s %-20s",
                            cou.Name, cou.TotalPopulation, cou.PeopleLivingInCities, cou.PercentagePeopleLivingInCities+"%", cou.PeopleNotLivingInCities, cou.PercentagePeopleNotLivingInCities+"%");
            System.out.println(cou_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    /** Gets the current City and Country.
     * @return A list of population of people, people living in cities, and people not living in cities in World, or null if there is an error.
     */
    public ArrayList<Country> getPopulationOfPeopleInWorld()
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT SUM(country.Population) AS Total_World_Population FROM country;";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract Country information
            ArrayList<Country> country9 = new ArrayList<Country>();
            while (rset.next())
            {
                Country cou = new Country();
                cou.TotalPopulation = rset.getLong("Total_World_Population");
                country9.add(cou);
            }
            return country9;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get world details");
            return null;
        }
    }

    /**
     * Prints a list of Capital Cities.
     * @param country9 The list of city to print.
     */
    public void printPopulationOfPeopleInWorld(ArrayList<Country> country9)
    {
        // Check World Population is not null
        if (country9 == null)
        {
            System.out.println("No Population Of People In World");
            return;
        }

        // Title
        System.out.println("Population Of People In World Report");

        // Print header
        System.out.println(String.format("%-45s", "TotalPopulation"));
        // Loop over in the list
        for (Country cou : country9)
        {
            if (cou == null)
                continue;
            String cou_string =
                    String.format("%-45s", cou.TotalPopulation);
            System.out.println(cou_string);
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

}