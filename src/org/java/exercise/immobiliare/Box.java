package org.java.exercise.immobiliare;

/*
L’agenzia gestisce diverse tipologie di immobili:
Box
Abitazione
Villa
Per i box è riportato il numero di posti auto.
Definire per ciascuna delle tre classi il metodo toString() in modo da fornire una descrizione completa dell’immobile.
 */

public class Box extends Immobili{
    // CAMPI
    private int postiAuto;


    // COSTRUTTORI
    public Box(String codiceImmobile, String indirizzo, int cap, String città, int superficie, int personeInteressate, int postiAuto) {
        super(codiceImmobile, indirizzo, cap, città, superficie, personeInteressate);
        this.postiAuto = postiAuto;
    }

    // GETTER E SETTER

    public int getPostiAuto() {
        return postiAuto;
    }


    // METODI


    @Override
    public String toString() {
        return super.toString()  +
                ", postiAuto=" + postiAuto;
    }
}
