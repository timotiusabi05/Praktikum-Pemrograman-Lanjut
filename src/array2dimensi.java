import java.util.Scanner;
import java.util.Arrays;

public class array2dimensi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // deklarasi
        String[][] nama;
        int[][] umur;

        // inisialisasi
        nama = new String[5][9];
        umur = new int[5][9];

        // deklarasi dan inisialisasi
        String[][] Nama = new String[5][9];
        int[][] Umur = new int[5][9];

        //Masukkan value, y dulu baru x
        // satu persatu
        umur[0][0] = 1;
        umur[0][1] = 2;
        umur[1][0] = 3;
        umur[1][1] = 4;
        umur[2][0] = 5;
        umur[2][1] = 6;

        // masukkan langsung
        int[][] numbers = {{ 1, 2 }, { 3, 4 }, { 5, 6 }};

        //panjang array, cuma ngeliat dari baris
        System.out.println(umur.length);
        System.out.println(umur[1].length);
        System.out.println(umur[2].length);
        System.out.println(umur[3].length);
        System.out.println(umur[4].length);
        System.out.println(umur[5].length);

        //print
        // satu-satu, fori pertama buat berapa banyak baris, kalo forj buat berapa banyak kolom per satu baris, [i] buat tau itu baris keberapa
        //kalo di hackerrank nanti pake scanner dalem for buat masukkin value
        for (int i = 0; i < umur.length; i++) {
            for (int j = 0; j < umur[i].length ; j++) {
                System.out.print(umur[i][j] + " ");
            }
            System.out.println();
        }

        //cth scanner
        for (int i = 0; i < umur.length; i++) {
            for (int j = 0; j < umur[i].length ; j++) {
                System.out.print(umur[i][j] + " ");
                umur[i][j] = scan.nextInt();
            }
            System.out.println();
        }
        // for-each gabisa alo di hackerrank
        for (int[] row: umur) {
            System.out.println(Arrays.toString(row));
        }
        //perbaris
        for (int i = 0; i < umur.length; i++) {
            System.out.println(Arrays.toString(umur[i]));
        }

    }
}
