package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class UI_ProgressBarDemo extends Application{
    public void start(Stage primaryStage) {
        // Create a VBox
        VBox root = new VBox();

        // Create a ProgressBar
        ProgressBar progressBar = new ProgressBar();
        progressBar.setProgress(0.0);

        // Set ProgressBar size
        progressBar.setPrefSize(300, 20);

        // Create Buttons
        Button startButton = new Button("Start");
        Button resetButton = new Button("Reset");

        // Set button text size
        startButton.setStyle("-fx-font-size: 20;");
        resetButton.setStyle("-fx-font-size: 20;");

        // Create a label
        Label label = new Label("Progress: 0%");

        // Set text size
        label.setStyle("-fx-font-size: 25px;");

        // Add ProgressBar, Button and Label to the VBox
        root.getChildren().addAll(label, progressBar, startButton, resetButton);

        // set position to center
        root.setAlignment(javafx.geometry.Pos.CENTER);

        // Set the action for the button
        startButton.setOnAction(e -> {
            // Create a thread to update the progress
            Thread thread = new Thread(() -> {
                for (int i = 0; i <= 100; i++) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    final int progress = i;
                    javafx.application.Platform.runLater(() -> {
                        progressBar.setProgress(progress / 100.0);
                    });
                }
            });

            thread.start();
        });

        resetButton.setOnAction(e -> {
            progressBar.setProgress(0.0);
            label.setText("Progress: 0%");
        });

        // Change the label text when the progress changes
        progressBar.progressProperty().addListener((observable, oldValue, newValue) -> {
            label.setText("Progress: " + (int)(newValue.doubleValue() * 100) + "%");
        });

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("ProgressBar Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
