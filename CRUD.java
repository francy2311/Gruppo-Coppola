import java.util.Scanner;

/**
 * CRUD
 */
public class CRUD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Login code here

        // Ask user for information
        System.out.println("Inserisci le informazioni:");
        String info = input.nextLine();

        // Do something with the information
        System.out.println("Hai inserito: " + info);

        input.close();
        
        
    }
}