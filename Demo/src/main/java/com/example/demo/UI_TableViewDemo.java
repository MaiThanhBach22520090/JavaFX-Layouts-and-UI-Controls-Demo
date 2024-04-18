package com.example.demo;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UI_TableViewDemo extends Application {
    public void start(Stage primaryStage) {
        VBox root = new VBox();

        TableView<User> tableView = new TableView<>();

        TableColumn<User, String> column1 = new TableColumn<>("No");
        column1.setCellValueFactory(new PropertyValueFactory<>("column1"));

        TableColumn<User, String> column2 = new TableColumn<>("Name");
        column2.setCellValueFactory(new PropertyValueFactory<>("column2"));

        tableView.getColumns().addAll(column1, column2);

        tableView.getItems().add(new User("1", "Student 1"));
        tableView.getItems().add(new User("2", "Student 2"));
        tableView.getItems().add(new User("3", "Student 3"));

        root.getChildren().add(tableView);
        root.setAlignment(javafx.geometry.Pos.CENTER);

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("TableView Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public class User {
        private final SimpleStringProperty column1;
        private final SimpleStringProperty column2;

        public User(String column1, String column2) {
            this.column1 = new SimpleStringProperty(column1);
            this.column2 = new SimpleStringProperty(column2);
        }

        public String getColumn1() {
            return column1.get();
        }

        public String getColumn2() {
            return column2.get();
        }
    }
}