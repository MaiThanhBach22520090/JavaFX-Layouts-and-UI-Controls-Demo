package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UI_CheckBoxDemo extends Application {
    public void start(Stage primaryStage) {
        // Create a VBox
        VBox root = new VBox();

        // Create CheckBoxes
        CheckBox checkBox1 = new CheckBox("CheckBox 1");
        CheckBox checkBox2 = new CheckBox("CheckBox 2");
        CheckBox checkBox3 = new CheckBox("CheckBox 3");

        // Set CheckBox text size
        checkBox1.setStyle("-fx-font-size: 20;");
        checkBox2.setStyle("-fx-font-size: 20;");
        checkBox3.setStyle("-fx-font-size: 20;");

        // Add CheckBoxes to the VBox
        root.getChildren().addAll(checkBox1, checkBox2, checkBox3);

        // Set position to center
        root.setAlignment(javafx.geometry.Pos.CENTER);

        // Set vertical spacing
        root.setSpacing(10);

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("CheckBox Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
