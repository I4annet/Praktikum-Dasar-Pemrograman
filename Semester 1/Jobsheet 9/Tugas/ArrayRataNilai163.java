import java.util.Scanner;

public class ArrayRataNilai163 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Perbaikan 1: Gunakan new dan beri nama objek dengan huruf kecil

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt(); // Perbaikan 2: Gunakan objek input yang telah dibuat

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = input.nextInt(); // Perbaikan 2: Gunakan objek input yang telah dibuat

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jumlahTidakLulus++;
            }
        }

        double rataLulus = totalLulus / jumlahLulus;
        double rataTidakLulus = totalTidakLulus / jumlahTidakLulus;

        System.out.println("Rata-rata nilai yang lulus (>70) = " + rataLulus);
        System.out.println("Rata-rata nilai yang tidak lulus (<=70) = " + rataTidakLulus);
    }
}
