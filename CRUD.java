import java.util.Scanner;

/**
 * CRUD
 */
public class CRUD extends Utente {
    
    private String nome;
    private String cognome;
    private String email;

    public CRUD(String username,String password,String nome,String cognome,String email){
        super(username,password);
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    @Override
    public String toString(){
        return "Username"+getUsername()+"Nome: "+nome+" Cognome: "+cognome+" Email: "+email;
    }

    public void modificaInformazioni(){
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il nome: ");
        this.nome = input.nextLine();
        System.out.println("Inserisci il cognome: ");
        this.cognome = input.nextLine();
        System.out.println("Inserisci l'email: ");
        this.email = input.nextLine();
    }
    
    public void cancellaInformazioni(){
        this.nome = "";
        this.cognome = "";
        this.email = "";
    }
    
}