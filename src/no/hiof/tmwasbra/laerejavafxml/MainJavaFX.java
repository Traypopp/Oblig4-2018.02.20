package no.hiof.tmwasbra.laerejavafxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("view/FilmOversikt.fxml"));

        Parent rootNode = loader.load();

        Scene detaljScene = new Scene(rootNode);

        primaryStage.setScene(detaljScene);
        primaryStage.setTitle("Film Oversikt");
        primaryStage.show();

    }
}
