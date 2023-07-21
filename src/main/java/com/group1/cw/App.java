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
    public void connect()
    {
        try
        {
            // Load Database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Could not load SQL driver");
            System.exit(-1);
        }

        int retries = 10;
        for (int i = 0; i < retries; ++i)
        {
            System.out.println("Connecting to database...");
            try
            {
                // Wait a bit for db to start
                Thread.sleep(30000);
                // Connect to database
                con = DriverManager.getConnection("jdbc:mysql://db:3306/world?useSSL=false", "root", "example");
                System.out.println("Successfully connected");
                break;
            }
            catch (SQLException sqle)
            {
                System.out.println("Failed to connect to database attempt " + Integer.toString(i));
                System.out.println(sqle.getMessage());
            }
            catch (InterruptedException ie)
            {
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
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();

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

        // Disconnect from database
        a.disconnect();
    }

    /**
     * getCountry
     */
    public Country getCountry(int Capital)
    {
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Region, SurfaceArea, IndepYear, Population, LifeExpectancy, GNP, GNPOld, LocalName, GovernmentForm, HeadOfState, Capital, Code2 "
                            + "FROM country "
                            + "WHERE Capital = " + Capital;
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Return new country if valid.
            // Check one is returned
            if (rset.next())
            {
                Country cou = new Country();
                cou.Code = rset.getString("Code");
                cou.Name = rset.getString("Name");
                cou.Continent = rset.getString("Continent");
                cou.Region = rset.getString("Region");
                cou.SurfaceArea = rset.getInt("SurfaceArea");
                cou.IndepYear = rset.getInt("IndepYear");
                cou.Population = rset.getInt("Population");
                cou.LifeExpectancy = rset.getInt("LifeExpectancy");
                cou.GNP = rset.getInt("GNP");
                cou.GNPOld = rset.getInt("GNPOld");
                cou.LocalName = rset.getString("LocalName");
                cou.GovernmentForm = rset.getString("GovernmentForm");
                cou.HeadOfState = rset.getString("HeadOfState");
                cou.Capital = rset.getString("Capital");
                cou.Code2 = rset.getString("Code2");
                return cou;
            }
            else
                return null;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }
    }

    /**
     * Display Country
     */
    public void displayCountry(Country cou)
    {
        if (cou != null)
        {
            System.out.println(
                    cou.Code + " "
                            + cou.Name + "\n"
                            + "Continent: " + cou.Continent + "\n"
                            + "Region: " + cou.Region + "\n"
                            + "SurfaceArea: " + cou.SurfaceArea + "\n"
                            + "IndepYear: " + cou.IndepYear + "\n"
                            + "Population: " + cou.Population + "\n"
                            + "LifeExpectancy: " + cou.LifeExpectancy + "\n"
                            + "GNP: " + cou.GNP + "\n"
                            + "GNPOld: " + cou.GNPOld + "\n"
                            + "LocalName: " + cou.LocalName + "\n"
                            + "GovernmentForm: " + cou.GovernmentForm + "\n"
                            + "HeadOfState: " + cou.HeadOfState + "\n"
                            + "Capital: " + cou.Capital + "\n"
                            + "Code2: " + cou.Code2 + "\n");
        }
    }

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
        // Title
        System.out.println("Country Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-10s %-20s %-20s %-20s %-20s %-20s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cou : country)
        {
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
        // Title
        System.out.println("Country Report In a Continent (Asia) by Highest Population to Lowest");
        // Print header
        System.out.println(String.format("%-10s %-20s %-20s %-20s %-20s %-20s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cou : country1)
        {
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
        // Title
        System.out.println("Country Report In a Region (South America) by Highest Population to Lowest");
        // Print header
        System.out.println(String.format("%-10s %-20s %-20s %-20s %-20s %-20s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cou : country2)
        {
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
        // Title
        System.out.println("Top Populated Countries Report");

        // Print header
        System.out.println(String.format("%-10s %-20s %-20s %-20s %-20s %-20s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cou : country3)
        {
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
        // Title
        System.out.println("Top Populated Countries In a Continent (Asia) Report");

        // Print header
        System.out.println(String.format("%-10s %-20s %-20s %-30s %-20s %-20s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cou : country4)
        {
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
     * @return A list of Top Countries and Cities by largest population to smallest, or null if there is an error.
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
        // Title
        System.out.println("Top Populated Countries In a Region (North America) Report");

        // Print header
        System.out.println(String.format("%-10s %-20s %-20s %-30s %-20s %-20s", "Code", "Name", "Continent", "Region", "Population", "Capital"));
        // Loop over all countries in the list
        for (Country cou : country5)
        {
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
            // Extract country information
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
        // Title
        System.out.println("City Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s %-30s", "CityName", "CountryName", "District", "Population"));
        // Loop over all countries in the list
        for (City cit : city)
        {
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
            // Extract country information
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
        // Title
        System.out.println("Cities In A Continent (Asia) Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s %-30s", "CityName", "CountryName", "District", "Population"));
        // Loop over all countries in the list
        for (City cit : city1)
        {
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
            // Extract country information
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
        // Title
        System.out.println("Cities In A Region (Southeast Asia) Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s %-30s", "CityName", "CountryName", "District", "Population"));
        // Loop over all countries in the list
        for (City cit : city2)
        {
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
            // Extract country information
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
        // Title
        System.out.println("Cities In A Country (Myanmar) Report by Highest Population to Lowest");

        // Print header
        System.out.println(String.format("%-30s %-30s %-30s %-30s", "CityName", "CountryName", "District", "Population"));
        // Loop over all countries in the list
        for (City cit : city3)
        {
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

}