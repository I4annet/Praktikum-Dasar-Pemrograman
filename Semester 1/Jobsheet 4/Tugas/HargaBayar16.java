import java.util.Scanner;

public class HargaBayar16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, halamanbuku;
        String merkbuku;
        double dis, total, bayar, jmlDis;
        
        System.out.println("Masukkan harga barang yang dibeli ");
        harga = input.nextInt();
        
        System.out.println("Masukkan jumlah halaman buku ");
        halamanbuku = input.nextInt();
        
        System.out.println("Masukkan merk buku = ");
        merkbuku = input.next();
        System.out.println("Masukkan Jumlah barang yang dibeli ");
        jumlah = input.nextInt();
        System.out.println("Masukkan Diskon ");
        dis = input.nextDouble();

        
        // Assuming you meant to use jumlahhalamanbuku here
        total = harga * jumlah;
        
        jmlDis = total * dis;
        bayar = total - jmlDis;
        
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);
    }
}