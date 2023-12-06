import java.util.Scanner;

/**
 * Suhu16
 */
public class Suhu16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suhu;
        char hujan;
        System.out.print("Masukkan suhu: ");
        suhu = sc.nextInt();
        System.out.print("Masukkan status hujan? (y/t): ");
        hujan = sc.next().charAt(0);
        if (suhu >= 27) {
            System.out.println("Memakai dress");
        } else {
            System.out.println("Memakai celana panjang");
        if (suhu <= 27) {
            System.out.println("Membawa Payung");
        } else {
            System.out.println("Memakai sunscreen");
        }
        
        }
    }
}