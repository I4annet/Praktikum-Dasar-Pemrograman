import java.util.Scanner;

/**
 * WhileKelipatan16
 */
public class WhileKelipatan16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kelipatan, jumlah = 0, counter = 0; // Deklarasi variabel
        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = sc.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++;
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Jumlah bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
    }
}
