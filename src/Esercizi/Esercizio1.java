package Esercizi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Random randomN = new Random();
        int[] arr = {randomN.nextInt(1, 100), randomN.nextInt(1, 100), randomN.nextInt(1, 100), randomN.nextInt(1, 100), randomN.nextInt(1, 100)};

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Scegli un numero da aggiungere all'array (scrivi 0 per uscire):");
                int n = Integer.parseInt(sc.nextLine());
                if (n == 0) {
                    break;
                }
                System.out.println("In che posizione vorresti aggiungere (1-5)");
                int pos = Integer.parseInt(sc.nextLine());
                arr[pos - 1] = n;
                System.out.println(Arrays.toString(arr));
            } catch (NumberFormatException ex) {
                System.out.println("Non hai inserito un numero o il numero è troppo alto ");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("puoi usare solo i numeri da 1 a 5");
            } finally {
                sc.close();
            }


        }
    }
}
