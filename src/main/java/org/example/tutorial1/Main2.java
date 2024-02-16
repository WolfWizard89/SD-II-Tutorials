package org.example.tutorial1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main2 extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        stage.setResizable(false);
        FXMLLoader fxmlLoader = new FXMLLoader(Main2.class.getResource("signup.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 700);
        stage.setTitle("Signup page");
        stage.setScene(scene);
        stage.show();
    }

    public static void main (String[] args) {launch();
    }
}