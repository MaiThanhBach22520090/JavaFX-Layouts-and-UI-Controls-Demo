package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Layout_BorderPaneDemo extends Application {
    public void start(Stage primaryStage) {
        // Create a BorderPane
        BorderPane root = new BorderPane();

        // Create buttons for each region
        Button topButton = new Button("Top");
        Button leftButton = new Button("Left");
        Button centerButton = new Button("Center");
        Button rightButton = new Button("Right");
        Button bottomButton = new Button("Bottom");

        // Set button text size
        topButton.setStyle("-fx-font-size: 20;");
        leftButton.setStyle("-fx-font-size: 20;");
        centerButton.setStyle("-fx-font-size: 20;");
        rightButton.setStyle("-fx-font-size: 20;");
        bottomButton.setStyle("-fx-font-size: 20;");

        // Set the preferred size of the buttons
        topButton.setPrefHeight(topButton.getHeight() + 50);
        leftButton.setPrefWidth(leftButton.getWidth() + 75);
        rightButton.setPrefWidth(rightButton.getWidth() + 75);
        bottomButton.setPrefHeight(bottomButton.getHeight() + 50);

        // Button stretch
        topButton.setMaxWidth(Double.MAX_VALUE);
        leftButton.setMaxHeight(Double.MAX_VALUE);
        centerButton.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        rightButton.setMaxHeight(Double.MAX_VALUE);
        bottomButton.setMaxWidth(Double.MAX_VALUE);

        // Add buttons to the BorderPane
        root.setTop(topButton);
        root.setLeft(leftButton);
        root.setCenter(centerButton);
        root.setRight(rightButton);
        root.setBottom(bottomButton);

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("BorderPane Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
