package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Layout_GridPaneDemo extends Application {
    public void start(Stage primaryStage) {
        // Create a GridPane
        GridPane root = new GridPane();

        // Create buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        // Set button text size
        button1.setStyle("-fx-font-size: 20;");
        button2.setStyle("-fx-font-size: 20;");
        button3.setStyle("-fx-font-size: 20;");

        // Add buttons to the GridPane
        root.add(button1, 0, 0);
        root.add(button2, 1, 0);
        root.add(button3, 0, 1);

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("GridPane Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
