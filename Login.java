/*
 * PARTE 2: LOGIN
 * obiettivo: creare una funzione di login che consenta agli utenti di accedere utilizzando le credenziali create
 * 
 * dettagli:
 * 1. chiedere all'utente di inserire username e password
 * 2. verificare che le credenziali siano quelle di un account esistente
 * 3. se le credenziali sono corrette, consentire l'accesso, altrimenti mostrare un errore
 * 
 * COSE DA CHIEDERE AGLI ALTRI:
 * ivan
 * com'è fatta la classe Utente, e il suo costruttore. Da quello dipendono alcune cose di questo codice, segnate con ***
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    
    //metodo login: esegue tutto quello che serve per fare il login. Restituisce un boolean, true se l'accesso è consentito, false se è rifiutato
    public boolean login(ArrayList<Utente> ListaUtenti){

        Scanner scanner = new Scanner(System.in);                               //creo uno scanner

        String guessNome = "";                                                  //variabile che "raccoglie" il nome che inserisce l'utente
        String guessPassword = "";                                              //variabile che "raccoglie" la password che inserisce l'utente
        Utente guessUtente = new Utente(" ", " ");                                        //utente "vuoto" che raccoglie il nome utente per poi fare il controllo password
        boolean utenteEsiste = false;
        int tentativi = 1;                                                      //numero di tentativi per accedere. l'ho inserito così che possiamo cambiarlo in futuro, se non vogliamo mantenerlo a 1 
        boolean accesso = false;

        System.out.println("====LOGIN====");                                    //per fare vedere graficamente all'utente l'azione che sta eseguendo
        System.out.println();
        
        //chiedo il nome all'utente per verificare che esiste tra quelli salvati
        while (tentativi >= 0 && utenteEsiste==false){       
        System.out.println("inserire il nome utente: ");
            guessNome = scanner.nextLine();
            scanner.nextLine();
            System.out.println("PROVA: utente inserito");                       //LINEA DI PROVA

            for (Utente utente1 : ListaUtenti) {                                 // sostituire utente e listautenti!
                if (guessNome.equals(utente1.getUsername())) {
                    System.out.println("PROVA: l'utente esiste");               //LINEA DI PROVA
                    utenteEsiste = true;
                    guessUtente.setPassword(utente1.getPassword());                                            //***
                    break;
                }else{
                    System.out.println("PROVA: l'utente non esiste");           //LINEA DI PROVA
                }
    
            }
        }


        //chiedo la password. Se l'utente non esisteva, non controllo neanche se la password è giusta e mando un messaggio di errore. se esisteva, faccio il controllo
        
        System.out.println("inserire la password: ");  
        guessPassword = scanner.nextLine();
        scanner.nextLine();
        System.out.println("PROVA: password inserita");                       //LINEA DI PROVA

        if (utenteEsiste) {
            
            if (guessPassword == guessUtente.getPassword()) {                   //******
                System.out.println("accesso eseguito");
                accesso = true;
    
            } 

        } else {
            System.out.println("accesso negato");                     
        }
        
        return accesso;
    }
}
