public class Utente {

    public String username;
    public String password;
    private String nome;
    private String cognome;
    private String email;

    public Utente(String username, String password) {
        this.username = username;
        this.password = password;
    }

     public Utente(String nome,String cognome,String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

       public String getUsername() {
           return username;
       }

       public String getPassword() {
           return password;
       }

       public void setUsername(String username) {
           this.username = username;
       }

       public void setPassword(String password) {
           this.password = password;
       }

       
}

