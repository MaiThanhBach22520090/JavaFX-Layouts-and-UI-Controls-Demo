package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UI_LabelDemo extends Application {
    public void start(Stage primaryStage) {
        // Create a VBox
        VBox root = new VBox();

        // Create a label
        Label label = new Label("Hello, World!");

        // Set text size
        label.setStyle("-fx-font-size: 25px;");

        // Add label to the VBox
        root.getChildren().add(label);

        // set position to center
        root.setAlignment(javafx.geometry.Pos.CENTER);

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("Label Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
