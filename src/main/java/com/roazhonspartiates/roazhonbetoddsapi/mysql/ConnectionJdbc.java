package com.roazhonspartiates.roazhonbetoddsapi.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJdbc {

    private static Connection cnx;

    private static void makeJDBCConnection() {

        try {
            // DriverManager: The basic service for managing a set of JDBC drivers.
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/roazhonbetapplication", "root", "");
            if (cnx != null) {
                //log("Connection Successful! Enjoy. Now it's time to push data");
            } else {
                //log("Failed to make connection!");
            }
        } catch (SQLException e) {
            //log("MySQL Connection Failed!");
            e.printStackTrace();
            return;
        }

    }
}
