package no.hiof.tmwasbra.laerejavafxml;

import java.time.LocalDate;
import java.util.ArrayList;

public class Film extends Produksjon {

    private static ArrayList<Film> filmListe = new ArrayList<>();

    public Film(String tittel, String beskrivelse, int spilletid, LocalDate utgivelsesdato, Person regisor) {
        super(tittel, beskrivelse, spilletid, utgivelsesdato, regisor);
    }

    @Override
    public String toString() {
        return super.getTittel() + " (" + super.getUtgivelsesdato().getYear() + ") - " + super.getSpilletid() + " minutter";
    }
}
