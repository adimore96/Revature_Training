package com.movies.util;
import java.sql.*;

public class DBConnection {
    public static Connection getDBConnection() throws SQLException {
         final String DB_URL = "jdbc:mysql://localhost:3306/movies";
         final String USER = "root";
         final String PASS = "root";

        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
