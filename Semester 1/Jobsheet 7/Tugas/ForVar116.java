import java.util.Scanner;

public class ForVar116 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1, j = 20;

        for (; i < j; i++, j--) {
            System.out.printf("%03d -- %03d\n", i, j);
        }
    }
}
