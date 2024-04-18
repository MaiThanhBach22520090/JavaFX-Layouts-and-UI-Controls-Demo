package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Layout_StackPaneDemo extends Application{
    public void start(Stage primaryStage) {
        // Create a StackPane
        StackPane root = new StackPane();

        // Create buttons
        Button button1 = new Button("Btn 1");
        Button button2 = new Button("Btn 2");
        Button button3 = new Button("Btn 3");

        // Set different button sizes
        button1.setPrefSize(300, 150);
        button2.setPrefSize(200, 100);
        button3.setPrefSize(100, 50);

        // Set text alignment to left right and center
        button1.setStyle("-fx-alignment: center-left;");
        button2.setStyle("-fx-alignment: center-left;");
        button3.setStyle("-fx-alignment: center;");

        // Add buttons to the StackPane
        root.getChildren().addAll(button1, button2, button3);

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("StackPane Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
