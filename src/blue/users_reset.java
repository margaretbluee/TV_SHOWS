/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package blue;

import static blue.final_reset.dbConnection;
import static blue.final_reset.statement;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class users_reset {

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
            statement.executeUpdate("drop table if exists rating;");

        statement.executeUpdate("drop table if exists users CASCADE ;");
statement.executeUpdate("CREATE TABLE users( user_name varchar(15),user_id  int  NOT NULL, PRIMARY KEY(user_id));");
statement.executeUpdate("CREATE TABLE rating( users INT NOT NULL, show INT NOT NULL, rating INT NOT NULL constraint r_rat check (rating in(0,1,2,3,4,5,6,7,8,9,10)), review varchar(100) NOT NULL, constraint r_users FOREIGN KEY (users) REFERENCES users(user_id) on delete cascade, constraint r_shows FOREIGN KEY (show) REFERENCES show(show_id) on delete cascade, PRIMARY KEY(users, show));");

statement.executeUpdate("insert into users (user_name, user_id) values ('user','1111');");
statement.executeUpdate("insert into rating (users, show, rating, review) values (1111, 11, 5, 'ntaksei mwre exw dei kai kalytera');");
      

statement.close();
        dbConnection.close();

    }}