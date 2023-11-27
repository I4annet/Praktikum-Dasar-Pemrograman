import java.util.Scanner;

/**
 * BioskopWithScanner416
 */
public class BioskopWithScanner416 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
        System.out.println("Menu:");
        System.out.println("1. Input data penonton");
        System.out.println("2. Tampilkan daftar penonton");
        System.out.println("3. Exit");
        System.out.print("Pilih menu (1/2/3): ");
        
        int pilihan = sc.nextInt();
        sc.nextLine(); // Membuang karakter newline

        switch (pilihan) {
            case 1:
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            while (true) {
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();
        
                if (baris < 1 || baris > penonton.length || kolom < 1 || kolom > penonton[0].length) {
                    System.out.println("Nomor baris atau kolom kursi tidak tersedia. Coba lagi.");
                } else if (penonton[baris - 1][kolom - 1] != null) {
                    System.out.println("Kursi sudah diisi. Coba kursi lain.");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    break;
                }
            }
        
            System.out.print("Input penonton isinya? (y/n): ");
            next = sc.nextLine();
        
            if (next.equalsIgnoreCase("n")) {
                break;
            }
            break;
        

        case 2:
        // Menampilkan daftar penonton
        for (int i = 0; i < penonton.length; i++) {
        for (int j = 0; j < penonton[i].length; j++) {
            System.out.print(penonton[i][j] + "\t");
            }
            System.out.println();
            }
            break;

        case 3:
        // Keluar dari program
        System.out.println("Terima kasih!");
        System.exit(0);
        break;

        default:
        System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
            break;
            }
        }
    }
}
