import java.util.Scanner;

/**
 * IfKondisi16
 */
public class IfKondisi16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Suhu :");
        int suhu = sc.nextInt();
        
        if (suhu < 16) {
            System.out.println("Silahkan menggunakan jaket");
        } else if (suhu < 20) {
            System.out.println("Silahkan pakai baju tebal");
        } else {
            System.out.println("Silahkan pakai topi");
        }
    }
}
