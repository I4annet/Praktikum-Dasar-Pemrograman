import java.util.Scanner;

public class InputDataMahasiswa {

    public static void inputMahasiswa(Scanner input, String[] namaLengkap, String[] nim, String[] jurusan, String[] prodi, int jumlahMahasiswa) {
        System.out.println("Masukkan biodata mahasiswa ke-" + (jumlahMahasiswa + 1));
            System.out.print("Nama Lengkap: ");
            namaLengkap[jumlahMahasiswa] = input.nextLine();
            System.out.print("NIM: ");
            nim[jumlahMahasiswa] = input.nextLine();
            System.out.print("Jurusan: ");
            jurusan[jumlahMahasiswa] = input.nextLine();
            System.out.print("Prodi: ");
            prodi[jumlahMahasiswa] = input.nextLine();
    }

    public static void tampilMahasiswa(String[] namaLengkap, String[] nim, String[] jurusan, String[] prodi, int jumlahMahasiswa) {
        System.out.println("Biodata Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("Nama Lengkap: " + namaLengkap[i]);
            System.out.println("NIM: " + nim[i]);
            System.out.println("Jurusan: " + jurusan[i]);
            System.out.println("Prodi: " + prodi[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        String[] namaLengkap = new String[50];
        String[] nim = new String[50];
        String[] jurusan = new String[50];
        String[] prodi = new String[50];
        int jumlahMahasiswa = 0;

        Scanner input = new Scanner(System.in);

        boolean lanjut = true;
        while (lanjut) {
            inputMahasiswa(input, namaLengkap, nim, jurusan, prodi, jumlahMahasiswa);

            jumlahMahasiswa++;

            System.out.print("Tambahkan biodata mahasiswa lainnya? (Y/T): ");
            String pilihan = input.next();
            if (pilihan.equalsIgnoreCase("T")) {
                lanjut = false;
            } else {
            input.nextLine();
            }
        }

        tampilMahasiswa(namaLengkap, nim, jurusan, prodi, jumlahMahasiswa);

        input.close();
    }
}