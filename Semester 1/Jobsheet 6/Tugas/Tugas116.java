import java.util.Scanner;

/**
 * Tugas116
 */
public class Tugas116 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // meminta input banyaknya elemen
        System.out.print("Masukkan banyaknya elemen: ");
        int n = input.nextInt();
        // membuat array dengan panjang n
        int[] arr = new int[n];
        // meminta input nilai tiap elemen
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        // mencari nilai tertinggi, nilai terendah, dan rata-rata
        int max = arr[0];
        int min = arr[0];
        double total = 0;
        double rataRata;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            total += arr[i];
        }
        rataRata = total / n;
        // menampilkan output
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}
