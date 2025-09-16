import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex1 {

    public static void Exercise1() {

        System.out.println("Esercizio 1 -------------------------------");

        Scanner scannerTool = new Scanner(System.in);

        Set<String> correctStrings = new HashSet<>();
        Set<String> duplicatedStrings = new HashSet<>();

        System.out.println("Indica il numero di parole da inserire: ");
        int numberOfStrings = scannerTool.nextInt();
        scannerTool.nextLine();

        for (int i = 0; i < numberOfStrings; i++) {
            System.out.println("Inserisci parola Numero #" + (i + 1) + ": ");
            String word = scannerTool.nextLine();
            if (!correctStrings.add(word)) {
                duplicatedStrings.add(word);
            }
        }

        System.out.println("Elenco delle Parole Duplicate: " + duplicatedStrings);
        System.out.println("Numero di Parole Corrette: " + correctStrings.size());
        System.out.println("Elenco delle Parole Corrette: " + correctStrings);
    }
}
