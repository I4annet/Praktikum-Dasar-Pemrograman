import java.util.Scanner;

/**
 * HitungIP_16
 */
public class HitungIP_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa: ");
        String namaMahasiswa = sc.nextLine();
        int totalSks = 0;
        double totalBobotSks = 0;
        int jumlahMataKuliahRemidi = 0;
        while (true) {
            System.out.print("Masukkan nama mata kuliah (selesai jika selesai): ");
            String mataKuliah = sc.nextLine();
            if (mataKuliah.equals("selesai")) {
                break;
            }
            System.out.print("Masukkan nilai indeks (A/B+/B/C+/C/D/E): ");
            String nilaiIndeks = sc.nextLine();
            System.out.print("Masukkan jumlah SKS mata kuliah: ");
            int sks = sc.nextInt();
            double indeks = 0.0;
            if (nilaiIndeks.equals("A")) {
                indeks = 4.0;
            } else if (nilaiIndeks.equals("B+")) {
                indeks = 3.5;
            } else if (nilaiIndeks.equals("B")) {
                indeks = 3.0;
            } else if (nilaiIndeks.equals("C+")) {
                indeks = 2.5;
            } else if (nilaiIndeks.equals("C")) {
                indeks = 2.0;
            } else if (nilaiIndeks.equals("D")) {
                indeks = 1.0;
                jumlahMataKuliahRemidi++;
            } else if (nilaiIndeks.equals("E")) {
                indeks = 0.0;
                jumlahMataKuliahRemidi++;
            } else {
                System.out.println("Nilai indeks tidak valid. Nilai akan dianggap 0.0.");
            }
            totalSks += sks;
            totalBobotSks += indeks * sks;
            sc.nextLine(); // Membersihkan newline character dari input sebelumnya.
        }
        double ip = (totalSks > 0) ? totalBobotSks / totalSks : 0.0;
        System.out.println("\n===== Informasi IP Mahasiswa =====");
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Indeks Prestasi (IP): " + ip);
        System.out.println("Total Mata Kuliah: " + totalSks);
        System.out.println("Total SKS: " + totalBobotSks);
        System.out.println("Jumlah Mata Kuliah yang Harus Perbaikan/Remidi: " + jumlahMataKuliahRemidi);
        System.out.println("\n===================================");

        sc.close();
    }
}