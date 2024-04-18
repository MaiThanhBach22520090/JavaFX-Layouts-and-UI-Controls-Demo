package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class UI_ButtonDemo extends Application {
    public void start(Stage primaryStage) {
        // Create a VBox
        VBox root = new VBox();

        // Create buttons
        Button button = new Button("Click me");

        // Set button text size
        button.setStyle("-fx-font-size: 20;");

        // Create a label
        Label label = new Label("Button not clicked");

        // Set text size
        label.setStyle("-fx-font-size: 25px;");

        // Add buttons to the VBox
        root.getChildren().addAll(button, label);

        // set position to center
        root.setAlignment(javafx.geometry.Pos.CENTER);

        // Set the action for the button
        button.setOnAction(e -> {
            label.setText("Button clicked");
        });

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("Button Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
