package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Layout_AnchorPaneDemo extends Application {
    public void start(Stage primaryStage) {
        // Create an AnchorPane
        AnchorPane root = new AnchorPane();

        // Create buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        // Set Text size
        button1.setStyle("-fx-font-size: 20");
        button2.setStyle("-fx-font-size: 20");
        button3.setStyle("-fx-font-size: 20");

        // Set the preferred size of the buttons
        button1.setPrefSize(150, 50);
        button2.setPrefSize(150, 50);
        button3.setPrefSize(150, 50);

        // Add buttons to the AnchorPane
        root.getChildren().addAll(button1, button2, button3);

        // Anchor the buttons
        AnchorPane.setTopAnchor(button1, 10.0);
        AnchorPane.setLeftAnchor(button1, 10.0);
        AnchorPane.setTopAnchor(button2, 10.0);
        AnchorPane.setRightAnchor(button2, 10.0);
        AnchorPane.setBottomAnchor(button3, 10.0);
        AnchorPane.setLeftAnchor(button3, 10.0);

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("AnchorPane Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
