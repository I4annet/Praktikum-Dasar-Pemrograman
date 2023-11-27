import java.util.Scanner;

/**
 * While16
 */
public class While16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (i <= 20) {
            if (i % 2 == 0) {
                System.out.println("Angka " + i + " adalah bilangan genap");
            } else {
                System.out.println("Angka " + i + " adalah bilangan ganjil");
            }
            i++;
        }
    }
}