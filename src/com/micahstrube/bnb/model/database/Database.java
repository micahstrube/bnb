package com.micahstrube.bnb.model.database;
import java.sql.*;
import java.util.Properties;

class Database {
    String username;
    String password;
    String databaseName;

    public Connection connect(String url, String user, String pass) throws SQLException {
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", this.username);
        connectionProps.put("password", this.password);
        conn = DriverManager.getConnection("jdbc:derby:" + this.databaseName + ";create=true", connectionProps);

        System.out.println("Connected to database " + databaseName);
        return conn;
    }
}
