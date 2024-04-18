package com.example.demo;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Layout_TilePaneDemo extends Application{
    public void start(Stage primaryStage) {
        // Create a TilePane
        TilePane root = new TilePane();

        // Create buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        Button button6 = new Button("Button 6");


        // Set button text size
        button1.setStyle("-fx-font-size: 20;");
        button2.setStyle("-fx-font-size: 25;");
        button3.setStyle("-fx-font-size: 20;");
        button4.setStyle("-fx-font-size: 25;");
        button5.setStyle("-fx-font-size: 20;");
        button6.setStyle("-fx-font-size: 25;");

        // Add buttons to the TilePane
        root.getChildren().addAll(button1, button2, button3, button4, button5, button6);

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("TilePane Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
