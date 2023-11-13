//Regole da Rispettare 
//Funzione Aggiuntiva: Cambio Password
//Aggiungere una funzione che permetta agli utenti di cambiare la password

import java.util.ArrayList;

public class TestPart4 {
    public static void main(String[] args) {
        // Inserisci qui il codice che vuoi eseguire

        ArrayList<Utente> ListaUtenti = new ArrayList<Utente>();

        ListaUtenti.add(new Utente("Sergio", "Prova"));
        ListaUtenti.add(new Utente("Giovanni", "Prova"));
        ListaUtenti.add(new Utente("Marco", "Prova"));
        ListaUtenti.add(new Utente("Luca", "Prova"));

        //Login o registrazione

        //Recupera password

        for (int i = 0; i < ListaUtenti.size(); i++) {
            if (ListaUtenti.get(i).getUsername().equals("Sergio")) {
                //recuperaPass.recupero(ListaUtenti.get(i));
            }
        }

        

    }
}
