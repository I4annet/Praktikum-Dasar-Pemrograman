import java.util.Scanner;

/**
 * LatManB16
 */
public class LatManB16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1, total = 0;
        do {
            total += i;
            i++;
        } while (i <=25);
        System.out.println("Hasil penjumlahan dari 1 sampai 25 adalah : " + total);
    }
}