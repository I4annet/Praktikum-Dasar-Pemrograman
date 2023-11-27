import java.util.Scanner;

/**
 * LatManA16
 */
public class LatManA16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String namaMahasiswa;
        int jumlahMahasiswa = 30;
        char jenisKelamin;

        int a = 0;

        for ( a = 0; a < jumlahMahasiswa; a++) {
            System.out.print("Masukkan Nama Mahasiswa ke-" + (a + 1) + " : ");
            namaMahasiswa = scanner.nextLine();
            System.out.print("Masukkan Jenis Kelamin (L/P) Mahasiswa: ");
            jenisKelamin =  scanner.nextLine().charAt(0);
            if (jenisKelamin == 'P' || jenisKelamin == 'p'){
                System.out.println("Merupakan Mahasiswa Perempuan " + namaMahasiswa);
            }
        }
    }
}