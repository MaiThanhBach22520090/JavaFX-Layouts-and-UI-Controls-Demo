package com.example.demo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UI_ListViewDemo extends Application{
    public void start(Stage primaryStage) {
        // Create a VBox
        VBox root = new VBox();

        // Create a ListView
        ListView<String> listView = new ListView<String>();

        // Create an ObservableList
        ObservableList<String> items = FXCollections.observableArrayList(
            "Item 1", "Item 2", "Item 3", "Item 4", "Item 5"
        );

        // Set the ListView text size
        listView.setStyle("-fx-font-size: 20;");

        // Add items to the ListView
        listView.setItems(items);

        // Add the ListView to the VBox
        root.getChildren().add(listView);

        // set position to center
        root.setAlignment(javafx.geometry.Pos.CENTER);

        // Create a scene and set the root
        Scene scene = new Scene(root, 400, 300);

        // Set the stage title and scene
        primaryStage.setTitle("ListView Demo");
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
