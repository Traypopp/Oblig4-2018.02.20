package no.hiof.tmwasbra.laerejavafxml.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;
import java.util.ArrayList;

public class Film extends Produksjon implements Comparable<Film> {

    private static ObservableList<Film> filmListe = FXCollections.observableArrayList();


    public Film(String tittel, String beskrivelse, int spilletid, LocalDate utgivelsesdato, Person regisor) {
        super(tittel, beskrivelse, spilletid, utgivelsesdato, regisor);

        filmListe.add(this);
    }


    public static ObservableList<Film> getFilmListe() {
        return filmListe;
    }

    public static void setFilmListe(ObservableList<Film> filmListe) {
        Film.filmListe = filmListe;
    }

    @Override
    public String toString() {
        return super.getTittel() + " (" + super.getUtgivelsesdato().getYear() + ") - " + super.getSpilletid() + " minutter";
    }


    @Override
    public int compareTo(Film andreFilm) {
        return getTittel().compareTo( andreFilm.getTittel());
    }
}
