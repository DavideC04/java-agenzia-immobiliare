package org.java.exercise.immobiliare;

/*
L’agenzia gestisce diverse tipologie di immobili:
Box
Abitazione
Villa
Per le ville è previsto, in aggiunta rispetto all’abitazione, la dimensione in mq di giardino.
Definire per ciascuna delle tre classi il metodo toString() in modo da fornire una descrizione completa dell’immobile.
 */

public class Villa extends Abitazione {
    // CAMPI
    private int mqGiardino;


    // COSTRUTTORI
    public Villa(String codiceImmobile, String indirizzo, int cap, String citta, int superficie, int personeInteressate, int vani, int bagni, int mqGiardino) {
        super(codiceImmobile, indirizzo, cap, citta, superficie, personeInteressate, vani, bagni);
        this.mqGiardino = mqGiardino;
    }

    // richiamo l'overload del metodo reimpostaSuperfici
    public void reimpostaSuperfici(int mqGiardino, int nuovaSupeficie){
        this.mqGiardino = nuovaSupeficie;
    }


    // GETTER E SETTER


    // METODI


    @Override
    public String toString() {
        return super.toString() +
                ", mqGiardino=" + mqGiardino + " }";
    }
}
