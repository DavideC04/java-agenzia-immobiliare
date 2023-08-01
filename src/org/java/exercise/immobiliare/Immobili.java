package org.java.exercise.immobiliare;

/*
Si vuole progettare un’applicazione in grado di gestire un’agenzia immobiliare.
Gli immobili sono caratterizzati da:
un codice alfanumerico,
-indirizzo,
-cap,
-città
-una superficie espressa in mq attraverso un numero intero.
Definire all’interno della classe Immobile un attributo per memorizzare il numero di persone interessate all’acquisto ed
aggiungere un metodo per incrementare questo numero.
Definire nella classe Immobile il metodo reimpostaSuperfici che prende in input la nuova superficie.
Definire per ciascuna delle tre classi il metodo toString() in modo da fornire una descrizione completa dell’immobile.
 */

public class Immobili {
    // CAMPI
    private String codiceImmobile;
    private String indirizzo;
    private int cap;
    private String citta;
    private int superficie;
    private int personeInteressate;


    // COSTRUTTORI

    public Immobili(String codiceImmobile, String indirizzo, int cap, String citta, int superficie, int personeInteressate) {
        this.codiceImmobile = codiceImmobile;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.citta = citta;
        this.superficie = superficie;
        this.personeInteressate = 0;
    }


    // GETTER E SETTER

    public String getCodiceImmobile() {
        return codiceImmobile;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public int getCap() {
        return cap;
    }

    public String getCittà() {
        return citta;
    }

    public int getSuperficie() {
        return superficie;
    }

    public int getPersoneInteressate() {
        return personeInteressate;
    }


    // METODI

    // metodo per incrementare il numero di persone interessate all'acquisto dell'immobile
    public void getNumeroPersone() {
        personeInteressate++;
    }

    public  void reimpostaSuperfici(int nuovaSuperficie){
        this.superficie = nuovaSuperficie;

    }

    @Override
    public String toString() {
        return  "{" +
                "codiceImmobile='" + codiceImmobile + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", cap=" + cap +
                ", città='" + citta + '\'' +
                ", superficie=" + superficie +
                ", personeInteressate=" + personeInteressate;
    }
}
