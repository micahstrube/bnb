package com.micahstrube.bnb.model.database;
import org.apache.derby.tools.ij;

import java.sql.*;
import java.util.Properties;

class Database {

    /**
     * Get Connection to an existing database
     *
     * @param databaseName
     * @param user
     * @param pass
     * @return
     * @throws SQLException
     */
    public static Connection connect(String databaseName, String user, String pass)
            throws SQLException {
        Connection conn;
        Properties connectionProps = new Properties();
        connectionProps.put("user", user);
        connectionProps.put("password", pass);

        conn = DriverManager
                .getConnection("jdbc:derby:" + databaseName + ";create=true", connectionProps);
                //.getConnection("jdbc:derby:" + directory + ":" + databaseName + ";create=true", connectionProps);

        System.out.println("Connected to database " + databaseName);
        return conn;
    }

    /**
     * Create a new database and return its Connection
     *
     * @param databaseName
     * @param user
     * @param pass
     * @return
     * @throws SQLException
     */
    public static Connection createDatabase(String databaseName, String user, String pass)
            throws SQLException {
        System.out.println("Creating new bnb database");
        Connection conn;

        Properties connectionProps = new Properties();
        connectionProps.put("user", user);
        connectionProps.put("password", pass);

        // TODO: Change this to use mysql instead of derby, since Derby is not compatible with Java 9.
        conn = DriverManager
                .getConnection("jdbc:derby:" + databaseName + ";create=true", connectionProps);
                //.getConnection("jdbc:derby:" + directory + ":" + databaseName + ";create=true", connectionProps);

        createReservationsTable(conn); // Reservations table must be created before Guests
        createGuestsTable(conn); // Guests table must be created after Reservations table
        createRoomsTable(conn);

        return conn;
    }

    public static void createGuestsTable(Connection db) throws SQLException {
        System.out.println("Creating GUESTS table");
        String createString =
                new StringBuilder()
                        .append("CREATE TABLE GUESTS ")
                        .append(" (ID                    INT PRIMARY KEY, ")
                        .append(" FIRSTNAME              VARCHAR(255), ")
                        .append(" LASTNAME               VARCHAR(255), ")
                        .append(" PHONE_NUMBER           VARCHAR(255), ")
                        .append(" CREDIT_CARD_NUMBER     VARCHAR(255), ")
                        .append(" CREDIT_CARD_EXPIRATION VARCHAR(255), ")
                        .append(" RESERVATION_ID         INT NOT NULL REFERENCES RESERVATIONS(ID))")
                        .toString();

        Statement stmt = db.createStatement();

        try {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            if (e.getSQLState().equals("X0Y32")) {
                System.out.println("GUESTS table already exists.");
            } else {
                throw e;
            }
        }
    }

    public static void createReservationsTable(Connection db) throws SQLException {
        System.out.println("Creating RESERVATIONS table");

        String createString =
                new StringBuilder()
                        .append("CREATE TABLE RESERVATIONS ")
                        .append(" (ID INT PRIMARY KEY, ")
                        .append(" ROOM_ID          INT, ")
                        .append(" START_DATE       DATE, ")
                        .append(" END_DATE         DATE, ")
                        .append(" BOOKED_DATED     DATE, ")
                        .append(" BALANCE_DUE_DATE DATE, ")
                        .append(" BALANCE          DECIMAL, ")
                        .append(" CANCELED         SMALLINT)")
                        .toString();

        Statement stmt = db.createStatement();

        try {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            if (e.getSQLState().equals("X0Y32")) {
                System.out.println("RESERVATIONS table already exists.");
            } else {
                throw e;
            }
        }

    }

    public static void createRoomsTable(Connection db) throws SQLException {
        System.out.println("Creating ROOMS table");

        String createString =
                new StringBuilder()
                        .append("CREATE TABLE ROOMS ")
                        .append(" (ID INT PRIMARY KEY, ")
                        .append(" NAME         VARCHAR(255), ")
                        .append(" WEEKEND_RATE DECIMAL, ")
                        .append(" WEEKDAY_RATE DECIMAL)")
                        .toString();

        Statement stmt = db.createStatement();

        try {
            stmt.executeUpdate(createString);
        } catch (SQLException e) {
            if (e.getSQLState().equals("X0Y32")) {
                System.out.println("ROOMS table already exists.");
            } else {
                throw e;
            }
        }
    }

    public static void main(String... args) {
        try {
            Connection conn = Database
                    .createDatabase("bnb-db", "test", "test");

            /*
            Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT TABLENAME FROM sys.systables");
            while (results.next()) {
                String tableName = results.getString("TABLENAME");
                System.out.println("Table exists: " + tableName);
            }
            System.out.println(results.toString());
            */
        }
        catch (SQLException exc) {
            System.out.println(exc.getMessage());
        }

    }
}
