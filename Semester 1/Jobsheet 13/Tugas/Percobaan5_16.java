/**
 * Percobaan5_16
 */
public class Percobaan5_16 {

    static void Tampil(String str, int... a) {
        System.out.println("String: " + str);
        System.out.println("Jumlah argumen/parameter: " + a.length);
        System.out.println("Jumlah bilangan negatif sebanyak 7 :" + a.length);

        for (int i : a) {
            System.out.println(i + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Tampil("Daspro 2019", 100, 200);
        Tampil("Teknolog Informasi", 1, 2, 3, 4, 5);
        Tampil("Polinema");
        Tampil("Bilangan Negatif sebanyak 7 ", -7, -6, -5, -4, -3, -2, -1);
    }
}
