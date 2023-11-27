import java.util.Scanner;

public class NestedLoop16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];
        
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            double cityTotal = 0;  // Inisialisasi total suhu per kota
            
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
                cityTotal += temps[i][j];  // Menambahkan suhu ke total kota
            }
            System.out.println("Rata-rata Kota ke-" + i + ": " + (cityTotal / temps[0].length));
        }

        // Menampilkan array dengan foreach
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            double cityTotal = 0;  // Inisialisasi total suhu per kota
            
            for (double temperature : temps[i]) {
                System.out.print(temperature + " ");
                cityTotal += temperature;  // Menambahkan suhu ke total kota
            }
            
            double cityAverage = cityTotal / temps[i].length;
            System.out.println("Rata-rata Kota ke-" + (i + 1) + ": " + cityAverage);
        }
    }
}
