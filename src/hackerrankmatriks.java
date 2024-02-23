//import java.util.Scanner;
//public class hackerrankmatriks {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[][]matriks = new int [3][3];
//        for (int i = 0; i < matriks.length; i++) {
//            for (int j = 0; j < matriks[0].length; j++) {
//                matriks[i][j] = scan.nextInt();
//            }
//        }
//        for (int i = 0; i < matriks.length; i++) {
//            for (int j = 0; j < matriks[0].length; j++) {
//                if (matriks[i][j] == n)
//                    System.out.println(i + "," + j);
//            }
//        }
//    }
//}

//import java.util.Scanner;
//public class hackerrankmatriks {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int x = scan.nextInt();
//        int y = scan.nextInt();
//        int[][]matriks = new int [x][y];
//        int xTranspose = matriks.length;
//        int yTranspose = matriks[0].length;
//        int [][] matrikstranspose = new int [yTranspose][xTranspose];
//        for (int i = 0; i < xTranspose; i++) {
//            for (int j = 0; j < yTranspose; j++) {
//                matriks[i][j] = scan.nextInt();
//            }
//        }
//        for (int i = 0; i < xTranspose; i++) {
//            for (int j = 0; j < yTranspose; j++) {
//                matrikstranspose[j][i] = matriks[i][j];
//            }
//        }
//        for (int i = 0; i < yTranspose; i++) {
//            for (int j = 0; j < xTranspose; j++) {
//                System.out.print(matrikstranspose[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

import java.util.Scanner;
public class hackerrankmatriks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int[][] matriks1 = new int[x1][y1];
        for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks1[0].length; j++) {
                matriks1[i][j] = scan.nextInt();
            }
        }
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int[][] matriks2 = new int[x2][y2];
        for (int i = 0; i < matriks2.length; i++) {
            for (int j = 0; j < matriks2[0].length; j++) {
                matriks2[i][j] = scan.nextInt();
            }
        }
        int[][] hasil = new int[x1][y2];
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y2; j++) {
                for (int k = 0; k < x2; k++) {
                    hasil[i][j] += matriks1[i][k] * matriks2[k][j];
                }
            }
        }
        if (y1 != x2)
            System.out.println("Matriks ini tidak bisa dikalikan!");
        else
            for (int i = 0; i < x1; i++) {
                for (int j = 0; j < y2; j++) {
                    System.out.print(hasil[i][j] + " ");
                }
                System.out.println();
            }
    }
}