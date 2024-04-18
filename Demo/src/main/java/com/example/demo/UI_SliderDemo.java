package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UI_SliderDemo extends Application{
    public void start(Stage primaryStage) {
        // Create an HBox
        VBox root = new VBox();

        // Create a Slider
        Slider slider = new Slider();

        // Set max and min slider value
        slider.setMin(0);
        slider.setMax(100);

        // Create a label for the slider
        Label label = new Label("Value: " + slider.getValue());

        // Set text size
        label.setStyle("-fx-font-size: 25px;");

        // Add the Slider and Label to the HBox
        root.getChildren().addAll(slider, label);

        // set position to center
        root.setAlignment(javafx.geometry.Pos.CENTER);

        // Set the action for the slider
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            label.setText("Value: " + newValue.intValue());
        });

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("Slider Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
