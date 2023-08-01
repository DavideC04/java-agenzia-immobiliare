package org.java.exercise.immobiliare;

/*
Definire una classe AgenziaImmobiliare che contiene una lista di immobili e presenta:
-un metodo per aggiungere un immobile
-un metodo per la ricerca di un immobile a partire dal codice alfanumerico
-un metodo per restituire l’immobile che ha avuto il maggior numero di persone interessate
 */

import java.util.ArrayList;
import java.util.List;

public class AgenziaImmobiliare {

    //CAMPI
 private List<Immobili> immobile;


    // COSTRUTTORI
    public AgenziaImmobiliare(){
    immobile = new ArrayList<>();
    }


    // GETTER E SETTER



    // METODI

    // metodo per aggiungere immobili
    public void aggiungiImmobile(Immobili immobili){
    immobile.add(immobili);
    }

    // metodo di ricerca tramite codice alfanumerico
    public Immobili trovaImmobiliConCodice( String codiceImmobile){
    // uso un for-each
        for (Immobili immobili: immobile ) {
            if (immobili.getCodiceImmobile().equals(codiceImmobile)){
            return immobili;
            }
            
        }
        // nel caso in cui il codice non è presente nella lista, ritorna un valore null
        return null;
    }

    // metodo per restituire l'immobile che ha avuto il maggior numero di persone interessate
    


}
