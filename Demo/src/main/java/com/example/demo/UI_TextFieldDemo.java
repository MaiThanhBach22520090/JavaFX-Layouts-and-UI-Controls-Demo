package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class UI_TextFieldDemo extends Application{
    public void start(Stage primaryStage) {
        // Create an HBox
        HBox root = new HBox();

        // Create a TextField
        TextField textField = new TextField();

        // Set text size
        textField.setStyle("-fx-font-size: 20;");

        // Add the TextField to the HBox
        root.getChildren().add(textField);

        // set position to center
        root.setAlignment(javafx.geometry.Pos.CENTER);

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("TextField Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
