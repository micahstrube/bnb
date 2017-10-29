package com.micahstrube.bnb.model.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

class Database {
    public static Connection connect(String directory, String databaseName, String user, String pass)
            throws SQLException {
        Connection conn;
        Properties connectionProps = new Properties();
        connectionProps.put("user", user);
        connectionProps.put("password", pass);
        conn = DriverManager
                .getConnection("jdbc:derby:" + directory + ":" + databaseName + ";create=true", connectionProps);

        System.out.println("Connected to database " + databaseName);
        return conn;
    }
}
