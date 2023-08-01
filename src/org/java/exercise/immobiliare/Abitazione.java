package org.java.exercise.immobiliare;

/*
L’agenzia gestisce diverse tipologie di immobili:
Box
Abitazione
Villa
Per le abitazioni è riportato il numero di vani e il numero di bagni.
Definire per ciascuna delle tre classi il metodo toString() in modo da fornire una descrizione completa dell’immobile.
 */

public class Abitazione extends Immobili{
    // CAMPI
    private int vani;
    private int bagni;
    // COSTRUTTORI
    public Abitazione(String codiceImmobile, String indirizzo, int cap, String città, int superficie, int personeInteressate, int vani, int bagni) {
        super(codiceImmobile, indirizzo, cap, città, superficie, personeInteressate);
        this.vani = vani;
        this.bagni = bagni;
    }

    // GETTER E SETTER


    // METDOI


    @Override
    public String toString() {
        return super.toString() + ", vani=" + vani +
                ", bagni=" + bagni;
    }


}
