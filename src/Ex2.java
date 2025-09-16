import java.util.*;

public class Ex2 {

    public static void Exercise2() {

        System.out.println("Esercizio 2 -------------------------------");

        Scanner scannerTool = new Scanner(System.in);

        System.out.println("Inserisci il numero di interi casuali da generare: ");
        int N = scannerTool.nextInt();
        scannerTool.nextLine();

        List<Integer> randomNumberList = new ArrayList<>();
        Random randomTool = new Random();

        for (int i = 0; i < N; i++) {
            randomNumberList.add(randomTool.nextInt(101));
        }

        Collections.sort(randomNumberList);
        System.out.println("Lista ordinata casuale:");
        System.out.println(randomNumberList);

        List<Integer> randomNumberList2 = new ArrayList<>(randomNumberList);
        List<Integer> inverseRandomNumberList = new ArrayList<>(randomNumberList);
        Collections.reverse(inverseRandomNumberList);
        randomNumberList2.addAll(inverseRandomNumberList);

        System.out.println("Lista duplicata in ordine crescente + lista in ordine decrescente: " + randomNumberList2);

        System.out.println("Per stampare posizioni PARI o DISPARI, digita 'true' o 'false': \n PARI > true | DISPARI > false");
        boolean even = scannerTool.nextBoolean();

        for (int i = 0; i < randomNumberList2.size(); i++) {
            if (even && (i % 2 == 0)) {
                System.out.println("I numeri pari contenuti nell'ArrayList sono: " + randomNumberList2.get(i));
            } else if (!even && (i % 2 != 0)) {
                System.out.println("I numeri dispari contenuti nell'ArrayList sono: " + randomNumberList2.get(i));
            }
        }
    }
}
