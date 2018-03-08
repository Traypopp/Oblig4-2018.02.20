package no.hiof.tmwasbra.laerejavafxml;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import no.hiof.tmwasbra.laerejavafxml.controller.FilmOversiktController;
import no.hiof.tmwasbra.laerejavafxml.model.Film;
import no.hiof.tmwasbra.laerejavafxml.model.Person;

import java.io.IOException;
import java.time.LocalDate;

public class MainJavaFX extends Application {

    public static MainJavaFX hovedJavaFilm;
    private ObservableList<Film> alleFilmer = FXCollections.observableArrayList();

    public static void main(String[] args) {
        launch(args);
    }

    private ObservableList<FilmOversiktController> viewList = FXCollections.observableArrayList();

    //Film
    public void lagFilmer() {
        // Lager og instansierer objektet jermaRumbleLiveAction av typen Film
        alleFilmer.add(new Film("The Jerma Rumble - Live Action!", "It's been a long time coming, but here is the latest from the Jerma Wrestling Federation.", 36, LocalDate.of(2016, 8, 29)));
        // Lager og instansierer objektet ratMovie av typen Film
        alleFilmer.add(new Film("Rat Movie: Mystery of the Mayan Treasure", "Straight to the Bargain Bin", 6, LocalDate.of(2014, 11, 6)));
        // Lager oginstansierer objektet paddington av typen film
        alleFilmer.add(new Film("Paddington", "A Young Peruvian bear Travels to London in search of a home", 95, LocalDate.of(2014, 11, 23)));
        alleFilmer.add(new Film("Digimon The Movie", "The best movie, a collection the 3 Japanese Digimon movies in an English Release", 82, LocalDate.of(2000, 10, 6)));


        MainJavaFX.hovedJavaFilm = this;
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
    public ObservableList<Film> getAlleFilmer() {
        return alleFilmer;
    }
}
