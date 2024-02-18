/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blue;

import java.sql.*;

/**
 *
 * @author user
 */
public class final_reset {

    static String driverClassName = "org.postgresql.Driver";
    static String url = "jdbc:postgresql://dblabs.iee.ihu.gr:5432/it174948";
    static Connection dbConnection = null;
    static String username = "it174948";
    static String passwd = "Kwdikos98!";
    static Statement statement = null;

    public static void main(String[] argv) throws Exception {
        Class.forName(driverClassName);
        dbConnection = DriverManager.getConnection(url, username, passwd);
        statement = dbConnection.createStatement();
     // statement.executeQuery("SELECT my_functions();");

        statement.executeQuery("SELECT drop_db();");

        statement.executeQuery("SELECT create_db();");
        statement.executeQuery("SELECT insert_db();");
        statement.executeQuery("SELECT my_functions();");
                statement.executeQuery("SELECT create_triggers();");


        statement.close();
        dbConnection.close();
    }
}
