import java.util.Scanner;

/**
 * LatManC16
 */
public class LatManC16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        while (a<=50) {
            if ( a % 3 != 0) {
                System.out.println("angka- " + a);

            } a++;
        }
    }
}