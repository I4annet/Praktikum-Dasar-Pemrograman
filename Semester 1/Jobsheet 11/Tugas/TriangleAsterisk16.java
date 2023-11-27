import java.util.Scanner;

/**
 * TriangleAsterisk16
 */
public class TriangleAsterisk16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 7;  // Ganti dengan nilai N yang diinginkan

        for (int i = N; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

