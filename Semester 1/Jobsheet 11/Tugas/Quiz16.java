import java.util.Scanner;
import java.util.Random;

public class Quiz16 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        char menu='y';
        do{
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();
                if (answer < number) {
                    System.out.println("Tebakan Anda lebih kecil dari jawaban.");
                } else if (answer > number) {
                    System.out.println("Tebakan Anda lebih besar dari jawaban.");
                }
                success = (answer == number);
            } while(!success);
            System.out.print("Apakah anda ingin mengulang permainan (Y/y)? ");
            menu = input.nextLine().charAt(0);
        }while (menu=='y' || menu=='Y'); 
            
    }
}