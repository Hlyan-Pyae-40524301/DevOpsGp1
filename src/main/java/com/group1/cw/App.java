package com.group1.cw;

import java.sql.*;

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

        // Get Country
        Country cou = a.getCountry(129);
        // Display results
        a.displayCountry(cou);

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
                cou.Capital = rset.getInt("Capital");
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

}