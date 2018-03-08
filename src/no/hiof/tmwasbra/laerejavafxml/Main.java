package no.hiof.tmwasbra.laerejavafxml;

import no.hiof.tmwasbra.laerejavafxml.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        lagOgSkrivUtInformasjonOmEtParFilmer();
        lagOgSkrivUtInformasjonOmDigimon();
        lagOgSkrivUtInformasjonOmDaysOfOurLives();
    }


    //Film
    private static void lagOgSkrivUtInformasjonOmEtParFilmer() {
        // Lager og instansierer objektet jeremyHarrington av typen Person (som vi senere setter som regisor)
        Person jeremyHarrington = new Person("Jeremy 'Jerma985'", "Harrington");
        // Lager og instansierer objektet paulKing av typen Person (som vi senere setter som regisor)
        Person paulKing = new Person("Paul", "King");

        // Lager og instansierer objektet jermaRumbleLiveAction av typen Film
        Film jermaRumbleLiveAction = new Film("The Jerma Rumble - Live Action!", "It's been a long time coming, but here is the latest from the Jerma Wrestling Federation.",36, LocalDate.of(2016, 8, 29), jeremyHarrington);
        // Lager og instansierer objektet ratMovie av typen Film
        Film ratMovie = new Film("Rat Movie: Mystery of the Mayan Treasure", "Straight to the Bargain Bin", 6, LocalDate.of(2014, 11, 6), jeremyHarrington);
        // Lager oginstansierer objektet paddington av typen film
        Film paddington = new Film("Paddington", "A Young Peruvian bear Travels to London in search of a home", 95, LocalDate.of(2014, 11, 23), paulKing);

        // Lager og instansierer objekteter av typen Rolle
        Rolle theWineGuy = new Rolle("The Wine", "Guy", new Person("Jay", "Buffet"));
        Rolle glueMan = new Rolle("Glue", "Man", new Person("Gabe", "Degrossi"));

        jermaRumbleLiveAction.leggTilEnRolle(theWineGuy);
        jermaRumbleLiveAction.leggTilEnRolle(glueMan);

        System.out.println("******************************");
        System.out.println("            Filmer");
        System.out.println("------------------------------");
        System.out.println(jermaRumbleLiveAction.toString() + " - regisert av " + jermaRumbleLiveAction.getRegisor().hentNavn());
        for (Rolle enRolle : jermaRumbleLiveAction.getRolleListe())
            System.out.println(enRolle.toString());
        System.out.println("------------------------------");
        System.out.println(ratMovie.toString() + " - regisert av " + ratMovie.getRegisor().hentNavn());
        System.out.println("------------------------------");
        System.out.println(paddington.toString() + " - regisert av " + paddington.getRegisor().hentNavn());
    }


    //Tv serie
    private static void lagOgSkrivUtInformasjonOmDigimon() {
        // Lager og instansierer objektet jeremyHarrington av typen Person (som vi senere setter som regisor)
        Person hiroyukiKakudo = new Person("Hiroyuki", "Kakudo");

        // Lager og instansierer objektet digimon av typen TvSerie
        TvSerie digimon = new TvSerie("Digimon", "When a young boy disappears, his mother, a police chief, and his friends must confront terrifying forces in order to get him back.", LocalDate.of(2016, 7,15));

        // Lager og instansierer noen objekter av typen Episode
        Episode episode1 = new Episode(1, 1, "And So It Begins...", "The DigiDestined are sent to the Digital World", 50, LocalDate.of(1999, 8, 14), hiroyukiKakudo);
        Episode episode2 = new Episode(2, 1, "The Birth of Greymon", "The DigiDestined learns about digivolution at a Champion level", 50, LocalDate.of(1999, 8, 21), hiroyukiKakudo);
        Episode episode3 = new Episode(3, 1, "Garurumon", "The kids run away from  a battle, they're attacked and Gabumon digivolves to fight for them", 50, LocalDate.of(1999, 8, 28), hiroyukiKakudo);
        Episode episode4 = new Episode(4, 1, "Chapter Four: The Body", "Meromon attacks the yokomon, and so Biyomon digivoles to defend them", 50, LocalDate.of(1999, 9, 4), hiroyukiKakudo);

        // Legger til episodeobjektene til tvserieobjektet digimon
        digimon.leggTilEpisode(episode1);
        digimon.leggTilEpisode(episode2);
        digimon.leggTilEpisode(episode3);
        digimon.leggTilEpisode(episode4);

        // Instansierer noen objekter av typen Episode og legger de direkte inn i TvSerie objektet digimon
        digimon.leggTilEpisode(new Episode(1, 2, "Enter Flamedramon", "Three new DigiDestined are chosen and receive their digivices", 50, LocalDate.of(2000, 8, 19), hiroyukiKakudo));
        digimon.leggTilEpisode(new Episode(2, 2, "The Digiteam Complete", "The new Digiteam is complete as TK and Kari joins Davis and the others.", 50, LocalDate.of(2000, 8, 19), hiroyukiKakudo));
        digimon.leggTilEpisode(new Episode(3, 2, "A New Digitude", "The Group Travel to the digital world only to be attacked by the Digimon Emperor", 50, LocalDate.of(2000, 8, 26), hiroyukiKakudo));


        // Lager en liste som skal holde på alle hovedrollene vi lager
        ArrayList<Rolle> hovedRollerDigimon = new ArrayList<>();

        // Lager og legger til roller og legger de i listen med en gang
        hovedRollerDigimon.add(new Rolle("Tai", "Kamiya", new Person("Joshua", "Seth")));
        hovedRollerDigimon.add(new Rolle("TK", "Takaishi", new Person("Wendee", "Lee")));
        hovedRollerDigimon.add(new Rolle("Agumon", "", new Person("Dave", "Mallow")));
        hovedRollerDigimon.add(new Rolle("Matt", "Ishida", new Person("Michael", "Reisz")));

        // lager en liste som holder på sekundærrollene vi lager
        ArrayList<Rolle> flereRollerDigimon = new ArrayList<>();

        // Lager og legger til roller og legger de i listen med en gang
        flereRollerDigimon.add(new Rolle("Gabumon", "", new Person("Kirk", "Thornton")));
        flereRollerDigimon.add(new Rolle("Izzy", "Izumi", new Person("Mona", "Marshall")));


        // Henter ut en liste med episoder fra objektet digimon
        ArrayList<Episode> episodeListe = digimon.getEpisodeListe();

        for (Episode enEpisode : episodeListe) {
            // Legger til listen med hovedroller til alle epsioder
            enEpisode.leggTilMangeRoller(hovedRollerDigimon);
            // Legger bare til listen med flere roller i den første sesongen
            if (enEpisode.getSesongNummer() == 1)
                enEpisode.leggTilMangeRoller(flereRollerDigimon);
        }



        System.out.println("******************************");

        // Skriver ut tvserie objektet (toString blir kalt)
        System.out.println(digimon);
        System.out.println("-----------Episoder-----------");
        // Går gjennom alle episoder og skriver ut objektet (toString blir kalt) samt navnet på regisoren
        for (Episode episode : episodeListe) {
            System.out.println(episode + " - regisert av " + episode.getRegisor().hentNavn());
        }
        System.out.println("------------Cast--------------");
        // Går gjennom alle roller for tvserien Digimon og skriver ut rollen
        for (Rolle enRolle : digimon.hentCast()) {
            System.out.println(enRolle + ", har vært i " + digimon.hentAntalletEpisoderEnRolleHarSpilt(enRolle) + " episoder");
        }
        System.out.println("-------Cast og antall episoder spilt-------");
        // Går gjennom alle roller for tvserien Digimon og skriver ut rollen og antallepisoder spilt
        for (Map.Entry<Rolle, Integer> rolleSpilt : digimon.hentCastMedAntallEpisoderSpilt().entrySet()) {
            // Henter og skriver ut nøkkelen (rollen) sin skuespiller og verdien (antallspilt) for hvert element
            System.out.println(rolleSpilt.getKey().getSkuespiller() + " har spilt i " + rolleSpilt.getValue() + " episoder");
        }
        System.out.println("******************************");


    }

    private static void lagOgSkrivUtInformasjonOmDaysOfOurLives() {
        TvSerie daysOfOurLives = new TvSerie("Days of our Lives", "Time goes by...", LocalDate.of(1965, 11, 8));


        Person regisor = new Person("Herb", "Stein");

        LocalDate sisteDato = LocalDate.of(1965, 11, 8);

        int sesongNummer = 1;
        int episodeNummer = 1;
        int innevaerendeAar = sisteDato.getYear();

        // Går gjennom å lager 13265 episoder
        for (int e = 1; e <= 13265; e++){
            // Lager en ny episode
            daysOfOurLives.leggTilEpisode(new Episode(episodeNummer, sesongNummer, "Generisk Episodetittel", "Red Wedding", 60, sisteDato, regisor));
            episodeNummer++;

            // Undersøker om vi er kommet til fredag
            if (sisteDato.getDayOfWeek().getValue() == 5)
                // Hvis vi har det, øk med 3 dager (vi hopper over helgen)
                sisteDato = sisteDato.plusDays(3);
            else
                // HVis ikke, gå til neste dag
                sisteDato = sisteDato.plusDays(1);

            // Undersøker om vi har kommet til et nytt år
            if (innevaerendeAar != sisteDato.getYear()) {
                // Har vi det, øker vi innevarendeAar med året vi har kommet til, øker sesong med 1 og starter episode på 1
                innevaerendeAar = sisteDato.getYear();
                sesongNummer++;
                episodeNummer = 1;
            }
        }

        System.out.println();

        System.out.println("******************************");
        System.out.println(daysOfOurLives.toString());
        System.out.println("--------Episoder i S42--------");

        for (Episode episode : daysOfOurLives.hentEpisoderISesong(42)) {
            System.out.println(episode.toString());
        }

        Collections.sort(TvSerie.getTvSerieListe());
        Collections.sort(Film.getFilmListe());
        System.out.println(TvSerie.getTvSerieListe());
        System.out.println(Film.getFilmListe());
    }
}
