package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Layout_HBoxDemo extends Application {
    public void start(Stage primaryStage) {
        // Create an HBox
        HBox root = new HBox();

        // Create buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        // Set button text size
        button1.setStyle("-fx-font-size: 20;");
        button2.setStyle("-fx-font-size: 20;");
        button3.setStyle("-fx-font-size: 20;");

        // Add buttons to the HBox
        root.getChildren().addAll(button1, button2, button3);

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("HBox Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
