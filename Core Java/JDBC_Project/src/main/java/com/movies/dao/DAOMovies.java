package com.movies.dao;

import com.movies.models.Movie;
import com.movies.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOMovies {
    private static Connection conn;

    static {
        try {
            conn = DBConnection.getDBConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static boolean addMovie(Movie movie) throws SQLException {
        int id = movie.getId();
        String name = movie.getName();
        String streamingOn = movie.getStreamingOn();
//        System.out.println("Name: "+name+" Platform: "+streamingOn);
        String query = "insert into movies(name, streamingon) values(?,?)";

        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1,name);
        ps.setString(2,streamingOn);

        int rows = ps.executeUpdate();
        return rows == 1;
    }

    public static void displayMovies() throws SQLException {
        String query = "select * from movies;";

        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        System.out.println("\nMovies");
        while(rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String streamingPlatform = rs.getString("streamingon");

            System.out.println(id+" "+name+" "+streamingPlatform);
        }
        System.out.println("\n");
    }

//    delete movie
    public static void deleteMovieById(int id) throws SQLException {
        String query = "delete from movies where id = ?";

        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1,id);

        if(ps.executeUpdate()>0){
            System.out.println("Movie deleted Successfully...");
        }else{
            System.out.println("Unable to delete movie check ID :)");
        }

    }
}
