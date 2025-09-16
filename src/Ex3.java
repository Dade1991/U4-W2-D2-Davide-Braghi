import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {

    public static void Exercise3() {

        System.out.println("Esercizio 3 -------------------------------");

        Scanner scannerTool = new Scanner(System.in);

        Map<Integer, String> rubrica = new HashMap<>();

        while (true) {
            System.out.println("Vuoi inserire un nuovo Contatto? \n Digita 's' per SI oppure 'n' per NO.");
            String outcome = scannerTool.nextLine().toLowerCase().trim();
            if (outcome.equals("n")) {
                break;
            } else {
                System.out.println("Inserisci il numero di Telefono:");
                int phoneNumber = scannerTool.nextInt();
                scannerTool.nextLine();
                System.out.println("Inserisci il nome del Contatto:");
                String contactName = scannerTool.nextLine();
                rubrica.put(phoneNumber, contactName);
            }
        }

        System.out.println("La tua rubrica: " + rubrica);

    }
}
