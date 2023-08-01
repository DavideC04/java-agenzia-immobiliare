package org.java.exercise.immobiliare;
/*
Creare una classe Main con metodo main nel quale testare tutte le funzionalità delle classi
 */

public class Main {

    public static void main(String[] args) {
        // creo l'oggetto dell'agenzia
    AgenziaImmobiliare agenziaImmobiliare = new AgenziaImmobiliare();

    // creazioni degli immobili
        Box b1 = new Box("A01F95D", "Via dei Campi", 80020, "Pippocity", 20, 4, 1);
        Abitazione a1 = new Abitazione("C495VBT9S", "Viale Mafalda", 80050, "Atlantide", 190, 8, 7, 2);
        Villa v1 = new Villa("L06EQ71X", "Piazza Mazzini", 80031, "Busto Arsizio", 400, 15, 12, 5, 70);

        // aggiungo gli immobili nell'oggetto agenziaImmobiliare
        agenziaImmobiliare.aggiungiImmobile(b1);
        agenziaImmobiliare.aggiungiImmobile(a1);
        agenziaImmobiliare.aggiungiImmobile(v1);

        // incremento il numero di persone interessate
        b1.getNumeroPersone();
        b1.getNumeroPersone();
        b1.getNumeroPersone();
        a1.getNumeroPersone();
        a1.getNumeroPersone();
        a1.getNumeroPersone();
        a1.getNumeroPersone();
        v1.getNumeroPersone();
        v1.getNumeroPersone();
        v1.getNumeroPersone();

        // creo uno spazio
        System.out.println();

        System.out.println("------------------------------------------------------------------------- IMMOBILI --------------------------------------------------------------------------------------------------");
        System.out.println();
        // stampo il toString degli immobili
        System.out.println(b1.toString());
        System.out.println(a1.toString());
        System.out.println(v1.toString());

        // medoto reimpostaSuperficie (villa)
        v1.reimpostaSuperfici(70, 95);
        System.out.println(v1.toString());

        // creo uno spazio
        System.out.println();

        System.out.println("-------------------------------------------------------------------- RICERCA PER CODICE ---------------------------------------------------------------------------------------------");
        // creo uno spazio
        System.out.println();
        // ricerca per codice alfanumerica

        String ricerca = "L06EQ71X";
        Immobili trovato = agenziaImmobiliare.trovaImmobiliConCodice(ricerca);
        // se trovo l'immobile tramite il codice, stampo sul terminale le informazioni
        if (trovato != null){
            System.out.println("Immobile trovato: " + trovato.toString());

        }else {
            // altrimenti stampo un messaggio che non l'ho trovato
            System.out.println("Immobile con codice " + ricerca + " non trovato.");
        }
        // creo uno spazio
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ IMMOBILE CON PIU' INTERESSE ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        // immobile con più interesse
        Immobili immobilePiuInteressante = agenziaImmobiliare.numeroInteresse();
        // se c'è un immobile con più interesse da parte delle persone, lo stampo sul terminale
        if (immobilePiuInteressante != null){
            System.out.println("L'immobile con più persone interessate è: " + immobilePiuInteressante.toString());
        } else {
            System.out.println("Nessun immobile trovato");
        }
        System.out.println();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");



    }
}
