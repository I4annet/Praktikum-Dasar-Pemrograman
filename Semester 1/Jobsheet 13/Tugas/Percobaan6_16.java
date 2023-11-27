import java.util.Scanner;

/**
 * Percobaan6_16
 */
public class Percobaan6_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p,l,t,L,vol;

        System.out.println("Masukkan Panjang");
        p=input.nextInt();
        System.out.println("Masukkan Lebar");
        l=input.nextInt();;
        System.out.println("Masukkan Tinggi");
        t=input.nextInt();

        L=p*l;
        System.out.println("Luass Persegi Panjang adalah " + L);

        vol=p*l*t;
        System.out.println("Volume Balok adalah "+vol);
    }

    static int hitungLuas (int pjg, int lb){
        int Luas=pjg*lb;
        return Luas;
    }
}