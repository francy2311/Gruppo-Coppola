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

    public void modificaInformazioni(Utente utente,String nome,String cognome,String email){
        utente=new Utente(nome,cognome,email);
    }
    
    public void cancellaInformazioni(Utente utente){
        utente=new Utente("","","");
    }
    
}