package com.jmc.Models;

import java.sql.*;

public class DatabaseDriver {
    private Connection conn;

    public DatabaseDriver() {
        try {
            this.conn = DriverManager.getConnection( "jdbc:sqlite:bankApp.db");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*
    * Client Section
     **/

    public ResultSet getClientData(String pAddress, String password) {
        Statement statement;
        ResultSet resultSet = null;
        try {
            statement = this.conn.createStatement();
            resultSet = statement.executeQuery( "SELECT * FROM Client WHERE payeeAdress= '"+pAddress+"' AND password='"+password+"';");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    /*
    * Admin Section
     **/
}
