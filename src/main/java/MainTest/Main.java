package MainTest;
import model.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {


        Bacheca bachecaUniversita = new Bacheca(TitoloBacheca.Università, "Attività universitarie");
        Bacheca bachecaLavoro = new Bacheca(TitoloBacheca.Lavoro, "Progetti di lavoro");
        Bacheca bachecaTempoLibero = new Bacheca(TitoloBacheca.Tempo_Libero, "Tempo libero e hobby");

        bachecaUniversita.setDescrizione("Esami, lezioni e appunti universitari");
        System.out.println("Descrizione aggiornata Bacheca Università: " + bachecaUniversita.getDescrizione());

        Utente utente = new Utente("mario.rossi");
        utente.setPassword("pass223");
        System.out.println("Utente creato: " + utente.getUsername());

        ToDo todo = new ToDo();
        todo.setTitolo("Studiare per l'esame di Analisi");
        todo.setDataScadenza(new Date());
        todo.setDescrizione("Ripassare il programma di Analisi");
        todo.setUrl("https...");
        todo.setImmagine("image.png");
        todo.setColore("#FFCC00");
        todo.setStato(StatoToDo.Non_Completato);
        todo.setAutore(utente);

        VistaToDo vista = new VistaToDo();
        vista.setTodo(todo);
        vista.setUtente(utente);
        vista.setBacheca(bachecaUniversita);
        vista.setPosizione(1);

        System.out.println("\n-- Dettagli --");
        System.out.println("Utente: " + vista.getUtente().getUsername());
        System.out.println("Bacheca: " + vista.getBacheca().getTitolo());
        System.out.println("Descrizione bacheca: " + vista.getBacheca().getDescrizione());
        System.out.println("ToDo: " + vista.getTodo().getTitolo());
        System.out.println("Descrizione ToDo: " + vista.getTodo().getDescrizione());
        System.out.println("Scadenza: " + vista.getTodo().getDataScadenza());
        System.out.println("Posizione bacheca: " + vista.getPosizione());
        System.out.println("Autore ToDo: " + todo.getAutore().getUsername());
    }
}