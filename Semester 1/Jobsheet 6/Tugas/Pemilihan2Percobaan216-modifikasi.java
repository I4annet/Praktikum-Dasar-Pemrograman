import java.util.Scanner;

public class Pemilihan2Percobaan216 {

    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        float sudut1, sudut2, sudut3, totalSudut;
        
        System.out.print("Masukkan sudut 1: ");
        sudut1 = input16.nextFloat();
        
        System.out.print("Masukkan sudut 2: ");
        sudut2 = input16.nextFloat();
        
        System.out.print("Masukkan sudut 3: ");
        sudut3 = input16.nextFloat();
        
        totalSudut = sudut1 + sudut2 + sudut3;
        
        if (totalSudut == 180) {
            if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            if (sudut1 == 2 && sudut2 == sudut3) {
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            } else {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
}
}