import java.util.Scanner;

public class recuperaPass {
    public void recupero(Utente U){
        Scanner sc= new Scanner(System.in);
        System.out.println("Inserisci il tuo username:");
        String username= sc.nextLine();
        if (username.equals(U.getUsername())) {
            System.out.println("Inserisci la tua vecchia password: ");
            String vecchiaPass= sc.nextLine();

            if (vecchiaPass.equals(U.getPassword())) {
                System.out.println("Insersci la nuova password: ");
                String nuovaPass= sc.nextLine();
                U.setPassword(nuovaPass);
            }
            
        }else{
            System.out.println("Username errato/non esistente");
        }
    }
}