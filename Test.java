import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Utente> ListaUtenti = new ArrayList<>();

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

                ListaUtenti.add(new Utente(username, password));

                System.out.println("Registrazione avvenuta con successo!");
                break;
            } else {
                System.out.println("Username già esistente. Scegli un altro username.");
            }
        }
    }
}