package com.example.myapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Queries {

    Connection c = null;
    Statement stmt = null;



    public void executeQuery( String query) {
      try {
        Class.forName("org.postgresql.Driver");
        c = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/cinema",
                        "postgres", "password");
        System.out.println("Opened database successfully");

        stmt = c.createStatement();
        String sql = query;
        stmt.executeUpdate(sql);
        stmt.close();
        c.close();
    } catch ( Exception e ) {
        System.err.println( e.getClass().getName()+": "+ e.getMessage() );
        System.exit(0);
        }
        System.out.println("Table created successfully");
    }

    public boolean checkUser(String username, String password){
        String query = "select * from User where username"+username +" and password =="+password;
        try {
            executeQuery(query);
            return true;
        }catch(Exception e) {
            return false;
        }
    }

}



