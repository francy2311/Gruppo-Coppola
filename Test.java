import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Utente> ListaUtenti = new ArrayList<>();
        Utente  utente = new Utente("","");
        CRUD crud=new CRUD(null, null, null, null);                                                //creo un oggetto di tipo CRUD
        boolean accesso = false;
        String nomeUtente = "";
        String passwordUtente = "";

        //creo utenti di prova
        Utente utente1 = new Utente("Francesco", "2311");
        ListaUtenti.add(utente1);
        Utente utente2 = new Utente("Sergio", "2109");
        ListaUtenti.add(utente2);
        Utente utente3 = new Utente("Ivan", "2011");
        ListaUtenti.add(utente3);
        Utente utente4 = new Utente("Eleonora", "1234");
        ListaUtenti.add(utente4);
        
        //mostro il menù iniziale
        System.out.println("====Menù Iniziale====");
        System.out.println("1. Login");
        System.out.println("2. Registrazione"); 
        System.out.println("3. Recupero password");                           
        System.out.println("4. Esci");                               
        System.out.println("Inserisci la tua scelta: ");//chiedo all'utente di inserire la scelta
        int scelta = sc.nextInt();//scelta dell'utente

        //controllo la scelta dell'utente
        switch (scelta) {
            case 1:
                accesso=login(sc.next(),sc.next(),ListaUtenti,utente);
                break;
            case 2:
                
                break;
            case 3:
                recupero(ListaUtenti, sc.next());
                break;
            default:
                break;
        }

        //se l'utente ha effettuato l'accesso, gli mostro il menù utente
        if (accesso) {
            System.out.println("====Menù Utente====");
            System.out.println("1. Aggiungi informazioni");
            System.out.println("2. Modifica informazioni");
            System.out.println("3. Cancella informazioni");
            System.out.println("4. Esci");

            System.out.println("Inserisci la tua scelta: ");//chiedo all'utente di inserire la scelta
            int scelta2 = sc.nextInt();//scelta dell'utente

            String nome="";
            String cognome="";
            String email="";

            if (scelta2!=4) {
                System.out.println("Inserisci il nome: ");
                nome = sc.next();
                System.out.println("Inserisci Cognome: ");
                cognome = sc.next();
                System.out.println("Inserisci Email: ");
                email = sc.next();
            }
            switch (scelta2) {
                case 1:
                    crud=new CRUD(utente,nome,cognome, passwordUtente);
                    System.out.println("Inserimento avvenuto con successo");
                    break;
                case 2:
                    crud.modificaInformazioni(utente,nomeUtente, nomeUtente, passwordUtente);
                    System.out.println("Modifica avvenuta con successo");
                    break;
                case 3:
                    crud.cancellaInformazioni(utente);
                    System.out.println("Cancellazione avvenuta con successo");
                    break;

                default:
                    break;
            }
        }
        

}

    public static boolean login(String nomeUtente,String passwordUtente ,ArrayList<Utente> ListaUtenti,Utente utente){

        String appPassword = "";                                                //variabile che "raccoglie" la password dell'utente che sto controllando
        boolean utenteEsiste = false;
        int indice=0;
        int tentativi = 1;                                                      //numero di tentativi per accedere. l'ho inserito così che possiamo cambiarlo in futuro, se non vogliamo mantenerlo a 1 
        boolean accesso = false;

        System.out.println("====LOGIN====");                                    //per fare vedere graficamente all'utente l'azione che sta eseguendo
        System.out.println();
        
        //chiedo il nome all'utente per verificare che esiste tra quelli salvati
        while (tentativi >= 0 && utenteEsiste==false){    
            for (Utente utente1 : ListaUtenti) {                                 // sostituire utente e listautenti!
                if (nomeUtente.equals(utente1.getUsername())) {
                    utente.setUsername(nomeUtente);
                    System.out.println("PROVA: l'utente esiste");               //LINEA DI PROVA
                    appPassword = utente1.getPassword();
                    utenteEsiste = true;
                    break;
                }
            }
            if (utenteEsiste==false) {
                System.out.println("Utente non presente");
                tentativi--;
            }
        }

        //chiedo la password. Se l'utente non esisteva, non controllo neanche se la password è giusta e mando un messaggio di errore. se esisteva, faccio il controllo
        
        if (utenteEsiste) {
            if (appPassword.equals(passwordUtente)){
                System.out.println("Accesso eseguito");
                utente.setPassword(appPassword);
                accesso = true;
            } 
        } else {
            System.out.println("Accesso negato");                     
        }
        
        return accesso;
    }

    public static void recupero(ArrayList<Utente> ListaUtenti, String username){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<ListaUtenti.size(); i++){
            if (username.equals(ListaUtenti.get(i).getUsername())) { 
    
                System.out.println("Insersci la nuova password: ");
                String nuovaPass= sc.nextLine();
                System.out.println("Conferma la nuova password: ");
                String confermaPass= sc.nextLine();
                    
                if(nuovaPass.equals(confermaPass)){
                    ListaUtenti.get(i).setPassword(nuovaPass);
                }else{
                    System.out.println("Le password non coincidono");
                } 
            }
        }
    }

}