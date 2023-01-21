package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.stage.Stage;


import java.io.InputStream;


public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Dogs application");
        primaryStage.setWidth(500);
        primaryStage.setHeight(400);

        InputStream iconStream =
                getClass().getResourceAsStream("/someImage.png");
        Image image = new Image(iconStream);
        primaryStage.getIcons().add(image);

        Button button = new Button("WOF WOF ???'");

        button.setOnAction(event -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "WOF WOF WOF!!!");
            alert.showAndWait();
        });
        Scene primaryScene = new Scene(button);
        primaryStage.setScene(primaryScene);

        primaryStage.show();

    }
}
