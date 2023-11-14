import java.util.Scanner;

/**
 * CRUD
 */
public class CRUD{
    
    private String nome;
    private String cognome;
    private String email;

    public CRUD(Utente utente,String nome,String cognome,String email){
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        utente=new Utente(nome,cognome,email);
    }

    @Override
    public String toString(){
        return "Nome: "+nome+" Cognome: "+cognome+" Email: "+email;
    }

    public void modificaInformazioni(String nome,String cognome,String email){
        this.nome = nome;
       
        this.cognome = cognome;
        
        this.email =  email;
    }
    
    public void cancellaInformazioni(){
        this.nome = "";
        this.cognome = "";
        this.email = "";
    }
    
}