package com.movies;

import com.movies.dao.DAOMovies;
import com.movies.models.Movie;
import com.movies.util.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1: Add Movies/Series");
            System.out.println("2: List Movies/Series");
            System.out.println("3: Delete Movies/Series");
            System.out.println("4: Exit");

            int ch = sc.nextInt();
            sc.nextLine();

//            Adding Movie
            if(ch==1){
                System.out.println("Add Movie");

                System.out.print("Movie Name: ");
                String name = sc.nextLine();
                System.out.print("Streaming Platform: ");
                String streamingOn = sc.nextLine();

                Movie mv1 = new Movie(name,streamingOn);

                if(DAOMovies.addMovie(mv1)){
                    System.out.println(name+" Added Successfully!");
                }else{
                    System.out.println("Error occurs");
                }


            }else if(ch==2){  //Displaying movies

                System.out.println("List of Movies");
                DAOMovies.displayMovies();


            }else if(ch==3){ //Deleting movie

                System.out.println("Delete Movie");
                System.out.print("Enter id: ");
                int id = sc.nextInt();
                DAOMovies.deleteMovieById(id);


            }else if(ch==4){ //Exiting

                System.out.println("Exiting...\nGood bye!");
                break;


            }else{
                System.out.println("Enter valid choice");
            }

        }


    }
}
