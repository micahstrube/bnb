package com.micahstrube.bnb;

import com.micahstrube.bnb.model.database.Database;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.SQLException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("gui.fxml"));
        Scene scene = new Scene(root, 800, 600,  Color.WHITE);
        primaryStage.setTitle("BNB");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Connection db = null;
        try {
            db = Database.connectOrCreate("bnb-db", "test", "test");

        }
        catch (SQLException e) {
            System.out.println("Failed to create database. Exiting.");
            System.exit(1);
        }

        System.out.println("Launching GUI");
        launch(args);

        try {
            db.close();
        } catch (SQLException e) {
            // Do nothing
        }

    }
}
