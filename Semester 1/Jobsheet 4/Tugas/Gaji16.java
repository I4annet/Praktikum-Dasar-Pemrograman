import java.util.Scanner;

public class Gaji16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, besarangaji, potongangaji, TotGaji;
        System.out.println("Masukkan Jumlah besaran gaji ");
        besarangaji = input.nextInt();
        System.out.println("Masukkan Jumlah Potongan gaji ");
        potongangaji = input.nextInt();          
        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk = input.nextInt();

        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        JmlTdkMasuk = input.nextInt();

        besarangaji = jmlMasuk * besarangaji;
        potongangaji = JmlTdkMasuk * potongangaji;
        TotGaji = besarangaji - potongangaji;

        System.out.println("Gaji yang anda terima adalah " + TotGaji);
    }
}
