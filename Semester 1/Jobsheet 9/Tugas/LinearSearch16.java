import java.util.Scanner;
/**
 * LinearSearch16
 */
public class LinearSearch16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] arrayInt = new int[n];

        // Mengisi array dengan input
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen array ke-" + i + ": ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int key = sc.nextInt();

        int hasil = -1;

        for (int i = 0; i < n; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan dalam array.");
        }

        sc.close();
    }
}