import java.util.Arrays;
import java.util.Random;

public class Lustro {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random rand = new Random();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(tablica));
        for (int i = 0; i < tablica.length * 2; i++) {
            if (i < tablica.length) {
                System.out.println(tablica[i]);
            } else {
                int x = tablica.length - (i - tablica.length) - 1;
                System.out.println(tablica[x]);
            }
        }
    }
}