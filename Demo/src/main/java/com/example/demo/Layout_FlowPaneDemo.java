package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Layout_FlowPaneDemo extends Application{
    public void start(Stage primaryStage) {
        // Create a FlowPane
        FlowPane root = new FlowPane();

        // add a button that change flow direction
        Button changeFlowDirection = new Button("Horizontal");
        changeFlowDirection.setOnAction(event -> {
            if (root.getOrientation() == Orientation.HORIZONTAL) {
                root.setOrientation(Orientation.VERTICAL);
                changeFlowDirection.setText("Vertical");
            } else {
                root.setOrientation(Orientation.HORIZONTAL);
                changeFlowDirection.setText("Horizontal");
            }
        });

        // Create buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");

        // Set button text size

        // Add buttons to the FlowPane
        root.getChildren().addAll(button1, button2, button3);

        // Add the button that changes the flow direction (don't add to the flowpane)
        root.getChildren().add(changeFlowDirection);

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("FlowPane Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}