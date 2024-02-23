//import java.util.Scanner;
//public class praktikumPemdas1 {
//    public static void main(String[] args) {
////        Scanner scan = new Scanner(System.in);
////        int n = scan.nextInt();
////
////        if (n<0) {
////           n = Math.abs(n);
////        }
////        if (n <= 1) {
////            System.out.println("Bukan Prima");
////        } else {
////            boolean prima = true;
////            for (int i = 2; i <= n / 2; i++) {
////                if (n % i == 0) {
////                    prima = false;
////                    break;
////                }
////            }
////
////            if (prima) {
////                System.out.println("Prima");
////            } else {
////                System.out.println("Bukan Prima");
////            }
////        }
//    }
//}
//
//
////    public static void main(String[] args) {
////    Scanner scan = new Scanner(System.in);
////    int tiket = scan.nextInt();
////    int saldo = scan.nextInt();
////    if (saldo >= tiket)
////        System.out.println("Selamat Bermain!");
////    else System.out.println("Maaf, saldo tidak cukup");
////    }
//
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int totalNilai = 0;
//        int banyakSiswa = scan.nextInt();
//        for (int i = 1; i <=  banyakSiswa; i++) {
//            int nilai = scan.nextInt();
//            totalNilai += nilai;
//        }
//        int rataRata = totalNilai / banyakSiswa;
//        if (rataRata < 50 && rataRata >= 0) {
//            System.out.println(rataRata);
//            System.out.println("Kelas Butuh Bantuan");
//        }
//        else if (rataRata <= 69 && rataRata >= 50) {
//            System.out.println(rataRata);
//            System.out.println("Kelas Oke");
//        }
//        else if (rataRata <= 85 && rataRata >= 70) {
//            System.out.println(rataRata);
//            System.out.println("Kelas Baik");
//        }
//        else if (rataRata <= 100 && rataRata >=86) {
//            System.out.println(rataRata);
//            System.out.println("Kelas Unggulan");
//        }
//    }
//}