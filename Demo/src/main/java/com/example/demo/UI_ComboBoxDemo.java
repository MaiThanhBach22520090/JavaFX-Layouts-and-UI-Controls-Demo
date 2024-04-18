package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UI_ComboBoxDemo extends Application {
    public void start(Stage primaryStage) {
        // Create a VBox
        VBox root = new VBox();

        // Create a ComboBox
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Item 1", "Item 2", "Item 3");

        // Set ComboBox text size
        comboBox.setStyle("-fx-font-size: 20;");

        // Add the ComboBox to the VBox
        root.getChildren().add(comboBox);

        // set position to center
        root.setAlignment(javafx.geometry.Pos.CENTER);

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("ComboBox Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
