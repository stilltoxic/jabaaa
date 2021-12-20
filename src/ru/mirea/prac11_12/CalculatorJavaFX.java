package ru.mirea.prac11_12;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class CalculatorJavaFX extends Application{

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {


        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("Calculator");
        stage.setScene(new Scene(root, 300, 380));
        stage.show();
    }
}