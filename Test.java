import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Utente> ListaUtenti = new ArrayList<>();

        //Creazione della mappa di utenti
        Map<Integer, Utente> mappaUtenti = new HashMap<>();

        // Inserimento di 4 utenti
        ListaUtenti.add(new Utente("Ivan20", "Prova"));
        ListaUtenti.add(new Utente("Giovanni10", "Prova2"));
        ListaUtenti.add(new Utente("Marco30", "Prova3"));
        ListaUtenti.add(new Utente("Luca40", "Prova4"));

        for (int i = 0; i < ListaUtenti.size(); i++) {
            mappaUtenti.put(i + 1, ListaUtenti.get(i));
        }

        while (true) {
            System.out.println("Inserisci un username unico: ");
            String username = sc.nextLine();

            boolean user_esist = false;
            for (Utente utente : ListaUtenti) {
                if (utente.getUsername().equals(username)) {
                    user_esist = true;
                    break;
                }
            }

            if (!user_esist) {
                System.out.println("Inserisci una password: ");
                String password = sc.nextLine();

                Utente nuovoUtente = new Utente(username, password);
                ListaUtenti.add(nuovoUtente);

                // Genera un id per il nuovo utente
                int nuovoId = mappaUtenti.size() + 1;
                mappaUtenti.put(nuovoId, nuovoUtente);

                System.out.println("Registrazione avvenuta con successo!");
                break;
            } else {
                System.out.println("Username già esistente. Scegli un altro username.");
            }
        }
    }
}

