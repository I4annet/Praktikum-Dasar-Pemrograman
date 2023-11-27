import java.util.Scanner;

/**
 * Toko_16
 */
public class Toko_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();
        System.out.print("Apakah pelanggan adalah member (ya/tidak): ");
        String tipePelanggan = sc.nextLine();
        boolean isMember = tipePelanggan.equalsIgnoreCase("ya");
        int totalItem = 0;
        double totalHargaSebelumDiskon = 0;
        double totalDiskon = 0;

        boolean tambahProduk = true; // Menambahkan inisialisasi boolean untuk loop produk.

        while (tambahProduk) { // Menggunakan loop untuk menambah produk lagi.
            System.out.print("Masukkan nama produk: ");
            String namaProduk = sc.nextLine();
            System.out.print("Masukkan jumlah produk: ");
            int jumlah = sc.nextInt();
            System.out.print("Masukkan harga satuan produk: ");
            double hargaSatuan = sc.nextDouble();
            System.out.print("Masukkan diskon produk (dalam persen): ");
            double diskonProduk = sc.nextDouble();
            double hargaProduk = hargaSatuan * jumlah;
            double diskonProdukNominal = (diskonProduk / 100) * hargaProduk;
            double totalProdukSetelahDiskon = hargaProduk - diskonProdukNominal;
            totalItem += jumlah;
            totalHargaSebelumDiskon += hargaProduk;
            totalDiskon += diskonProdukNominal;
            if (isMember) {
                if (totalHargaSebelumDiskon >= 200000) {
                    totalDiskon += (0.10 * totalProdukSetelahDiskon);
                } else {
                    totalDiskon += (0.05 * totalProdukSetelahDiskon);
                }
            }
            System.out.print("Apakah Anda akan menambahkan produk lagi (ya/tidak): ");
            String lagi = sc.next();
            if (!lagi.equalsIgnoreCase("ya")) {
                tambahProduk = false; // Mengatur kondisi untuk keluar dari loop produk.
            }
            sc.nextLine(); // Membersihkan newline character dari input sebelumnya.
        }
        double totalAkhir = totalHargaSebelumDiskon - totalDiskon;
        System.out.println("\n===== Struk Pembelian =====");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Tipe Pelanggan: " + (isMember ? "Member" : "Non-member"));
        System.out.println("Total Item Barang: " + totalItem);
        System.out.println("Total Harga Sebelum Diskon: Rp " + totalHargaSebelumDiskon);
        System.out.println("Total Diskon: Rp " + totalDiskon);
        System.out.println("Total Akhir yang Harus Dibayar: Rp " + totalAkhir);
        System.out.println("\n===========================");

        sc.close();
    }
}
