//import java.util.Scanner;
//public class hackerrankarray2d {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int x = input.nextInt();
//        int y = input.nextInt();
//        int jumlah = input.nextInt();
//        int[][] matriks = new int[x][y];
//
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                matriks[i][j] = input.nextInt();
//            }
//        }
//        boolean ada = false;
//
//        for (int i = 0; i < x; i++) {
//            for (int j = 0; j < y; j++) {
//                for (int k = 0; k < x; k++) {
//                    for (int l = 0; l < y; l++) {
//                        if (i == k && j == l)
//                            continue;
//                        if (matriks[i][j] + matriks[k][l] == jumlah) {
//                            System.out.println("Indeks pertama adalah " + matriks[i][j] + " di " + i + ", " + j);
//                            System.out.println("Indeks kedua adalah " + matriks[k][l] + " di " + k + ", " + l);
//                            ada = true;
//                            break;
//                        }
//                    }
//                    if (ada) break;
//                }
//                if (ada) break;
//            }
//            if (ada) break;
//        }
//    }
//}

import java.util.Scanner;
public class hackerrankarray2d {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int n = scan.nextInt();

        int [][]matrix = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        boolean bisa = false;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < x; k++) {
                    for (int l = 0; l < y; l++) {
                        if (i == k && j == l)
                            continue;
                        if (matrix[i][j] + matrix[k][l] == n) {
                            System.out.println("Indeks pertama adalah " + matrix[i][j] + " di " + i + ", " + j);
                            System.out.println("Indeks kedua adalah " + matrix[k][l] + " di " + k + ", " + l);
                            bisa = true;
                            break;
                        }
                    }
                    if (bisa) break;
                }
                if (bisa) break;
            }
            if (bisa) break;
        }
    }
}


















//        String[] nama = {
//                "Tono", "Jojo", "Karimun", "Gon", "Obama", "Joko", "Susi", "Budi", "Rina", "Ahmad",
//                "Siti", "Eko", "Putri", "Dian", "Rizal", "Maya", "Andi", "Nia", "Rizky", "Fika"
//        };
//
//        int jumlahOrang = scan.nextInt();
//        for (int i = 0; i < jumlahOrang; i++) {
//        System.out.print(nama[scan.nextInt() - 1] );
//            if (i < jumlahOrang - 1 )
//                System.out.print(", ");
//        }
//        int baris = scan.nextInt();
//        int kolom = scan.nextInt();
//        int nilai = scan.nextInt();
//        int [][] matriks = new int [baris][kolom];

