import java.util.Scanner;

/**
 * DeretDescendingRekursif
 */
public class DeretDescendingRekursif {

    static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }
    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.err.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();

        System.out.println("Deret Descending Rekursif:");
        deretDescendingRekursif(n);

        System.out.println("Deret Descending Iteratif:");
        deretDescendingIteratif(n);
    }   
}