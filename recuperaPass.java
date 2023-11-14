import java.util.ArrayList;
import java.util.Scanner;

public class recuperaPass {
    public void recupero(ArrayList<Utente> ListaUtenti){
        Scanner sc= new Scanner(System.in);
        System.out.println("Inserisci il tuo username:");
        String username= sc.nextLine();
        for(int i=0; i<ListaUtenti.size(); i++){
            if (username.equals(ListaUtenti.get(i).getUsername())) {   
                System.out.println("Inserisci la tua vecchia password: ");
                String vecchiaPass= sc.nextLine();
            if (vecchiaPass.equals(ListaUtenti.get(i).getPassword())) { 
                System.out.println("Insersci la nuova password: ");
                String nuovaPass= sc.nextLine();
                System.out.println("Conferma la nuova password: ");
                String confermaPass= sc.nextLine();

                if(nuovaPass.equals(confermaPass)){
                    ListaUtenti.get(i).setPassword(nuovaPass);
                }else{
                    System.out.println("Le password non coincidono");
                } 
            }else{
                System.out.println("Username errato/non esistente!");
            }
        }
        }
    }
}
