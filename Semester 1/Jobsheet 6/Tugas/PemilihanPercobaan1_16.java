import java.util.Scanner;

public class Selection1 {

    public static void main(String[] args) {
        Scanner input16 = new Scanner(System.in);
        System.out.print("Masukkan angka:  ");
        int angka = input16.nextInt();
        String jenisAngka = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " bilangan " + jenisAngka);
    }
}
