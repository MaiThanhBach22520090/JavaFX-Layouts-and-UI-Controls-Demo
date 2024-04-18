package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UI_RadioButtonDemo extends Application{
    public void start(Stage primaryStage) {
        // Create a VBox
        VBox root = new VBox();

        // Create a ToggleGroup
        ToggleGroup group = new ToggleGroup();

        // Create RadioButtons
        RadioButton radioButton1 = new RadioButton("Radio Button 1");
        RadioButton radioButton2 = new RadioButton("Radio Button 2");
        RadioButton radioButton3 = new RadioButton("Radio Button 3");

        // Set RadioButtons text's size
        radioButton1.setStyle("-fx-font-size: 20;");
        radioButton2.setStyle("-fx-font-size: 20;");
        radioButton3.setStyle("-fx-font-size: 20;");

        // Add RadioButtons to the ToggleGroup
        radioButton1.setToggleGroup(group);
        radioButton2.setToggleGroup(group);
        radioButton3.setToggleGroup(group);

        // Add RadioButtons to the VBox
        root.getChildren().addAll(radioButton1, radioButton2, radioButton3);

        // Set position to center
        root.setAlignment(javafx.geometry.Pos.CENTER);

        // Set vertical spacing
        root.setSpacing(10);

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("RadioButton Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
