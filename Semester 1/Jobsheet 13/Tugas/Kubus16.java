import java.util.Scanner;

public class Kubus16 {

    public static int volume(int sisi) {
        int vol = sisi * sisi * sisi;
        return vol;
    }

    public static int luasper(int sisi) {
        int luas = 6 * sisi * sisi;
        return luas;
    }

    public static int keliling(int sisi) {
        int kel = 12 * sisi;
        return kel;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sisi kubus : ");
        int sisi = sc.nextInt();
        System.out.println("Volume : " + volume(sisi));
        System.out.println("Luas Permukaan : " + luasper(sisi));
        System.out.println("Keliling kubus : " + keliling(sisi));
    }
}