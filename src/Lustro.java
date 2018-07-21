import java.util.Random;

public class Lustro {
    public static void main(String[] args) {
        int[] tablica = new int[10];
        Random rand = new Random();
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = rand.nextInt(100);
            System.out.println(tablica[i]);
        }
        for (int i = tablica.length - 1; i >= 0; i--) {
            System.out.println(tablica[i]);
        }
        }
    }