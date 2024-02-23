////import java.util.Scanner;
////
////public class UAP {
////    public static void main(String[] args) {
////        Scanner scan = new Scanner(System.in);
////        String nama = scan.nextLine();
////        int hari = scan.nextInt();
////        scan.nextLine();
////        String layanan = scan.nextLine();
////        String metodePembayaran = scan.nextLine();
////        double jumlahUangDibayarkan = scan.nextDouble();
////
////        int hargaLayanan = 0;
////        int hargaTotal = 0;
////        int hargaSubTotal = 0;
////        double diskon = 0;
////        int admin = 2000;
////
////        System.out.printf("%20s%n", "Sally's Beauty");
////        System.out.println("==========================");
////        System.out.println(hari + " November 2023");
////        System.out.println();
////        System.out.println("Nama Pelanggan : " + nama);
////
////        if (layanan.equals("Facial")) {
////            hargaLayanan = 200000;
////            System.out.printf("%-14s :%10s%n", layanan, hargaLayanan);
////        } else if (layanan.equals("Peeling")) {
////            hargaLayanan = 350000;
////            System.out.printf("%-14s :%10s%n", layanan, hargaLayanan);
////        } else if (layanan.equals("Botox")) {
////            hargaLayanan = 500000;
////            System.out.printf("%-14s :%10s%n", layanan, hargaLayanan);
////        }
////
////        hargaSubTotal += hargaLayanan;
////
////        System.out.println("--------------------------");
////
////
////
////        System.out.printf("%-14s :%10s%n", "Total", hargaSubTotal);
////        System.out.println("--------------------------");
////        double ppn = 0.11 * hargaSubTotal;
////        if (!metodePembayaran.equalsIgnoreCase("Tunai") && !metodePembayaran.equalsIgnoreCase("Bank Mandiri")) {
////            hargaSubTotal += admin;
////        }
////        if (metodePembayaran.equalsIgnoreCase("Bank Mandiri") && jumlahUangDibayarkan >= 250000) {
////            if (hari >= 1 && hari <= 7) {
////                diskon = 0.3 * hargaSubTotal;
////                System.out.printf("%-14s :%10s%n", "Diskon (30%)", (int) diskon);
////                if (diskon > 0) {
////                    hargaSubTotal -= diskon;
////                }
////            }
////        }
////        System.out.printf("%-14s :%10s%n", "PPN (11%)", (int) ppn);
////        if (!metodePembayaran.equalsIgnoreCase("Tunai") && !metodePembayaran.equalsIgnoreCase("Bank Mandiri")) {
////            System.out.printf("%-14s :%10s%n", "Admin Fee", admin);
////        }
////        int totalBayar = hargaSubTotal + (int) ppn;
////        System.out.printf("%-14s :%10s%n", "Total Bayar", (int) totalBayar);
////        System.out.printf("%-14s :%10s%n", metodePembayaran,  (int) jumlahUangDibayarkan);
////        System.out.println("--------------------------");
////
////        int kembalian = (int) (jumlahUangDibayarkan - totalBayar);
////        System.out.printf("%-14s :%10s%n", "Kembalian", kembalian >= 0 ? kembalian : 0);
////        System.out.println("==========================");
////    }
////}
//
//import java.util.Scanner;
//
//public class UAP {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        int tiketFilmA = 10;
//        int tiketFilmB = 15;
//        int tiketFilmC = 20;
//
//        String ulang = "ya";
//
//        while (ulang.equalsIgnoreCase("ya")) {
//            System.out.println("Selamat datang di Sistem Pemesanan Tiket Bioskop!");
//            System.out.println("1. Film A - Sisa Tiket: " + tiketFilmA);
//            System.out.println("2. Film B - Sisa Tiket: " + tiketFilmB);
//            System.out.println("3. Film C - Sisa Tiket: " + tiketFilmC);
//
//            System.out.println("Pilih nomor film yang ingin ditonton: ");
//            int pilihan = scan.nextInt();
//
//            int jumlahTiket;
//
//            if (pilihan == 1) {
//                jumlahTiket = tiketFilmA;
//            } else if (pilihan == 2) {
//                jumlahTiket = tiketFilmB;
//            } else if (pilihan == 3) {
//                jumlahTiket = tiketFilmC;
//            } else {
//                System.out.println("Nomor film tidak valid.");
//                System.out.println("Apakah Anda ingin mengulang? (ya/tidak): ");
//                ulang = scan.next();
//                continue;
//            }
//
//            System.out.println("Masukkan jumlah tiket yang ingin dibeli: ");
//            int jumlah = scan.nextInt();
//
//            if (jumlah > jumlahTiket) {
//                System.out.println("Maaf, stok tiket tidak mencukupi.");
//                System.out.println("Apakah Anda ingin mengulang? (ya/tidak): ");
//                ulang = scan.nextLine();
//                continue;
//            }
//
//            if (pilihan == 1) {
//                tiketFilmA -= jumlah;
//            } else if (pilihan == 2) {
//                tiketFilmB -= jumlah;
//            } else {
//                tiketFilmC -= jumlah;
//
//            }
//
//            System.out.println("Terima kasih telah melakukan pemesanan. Nikmati film Anda!");
//            System.out.println("Sisa Tiket Saat ini");
//            System.out.println("1. Film A - Sisa Tiket: " + tiketFilmA);
//            System.out.println("2. Film B - Sisa Tiket: " + tiketFilmB);
//            System.out.println("3. Film C - Sisa Tiket: " + tiketFilmC);
//
//            do {
//                System.out.println("Apakah Anda ingin melakukan pemesanan lagi? (ya/tidak): ");
//                ulang = scan.next();
//            } while (!ulang.equalsIgnoreCase("ya") && !ulang.equalsIgnoreCase("tidak"));
//        }
//
//        System.out.println("Terima kasih.");
//    }
//}

import java.util.Scanner;

public class UAP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int baris = scan.nextInt();
        int kolom = scan.nextInt();

        String[][] matriks = new String[baris][kolom];

        while (true) {
            String command = scan.next();
            if (command.equals("SELESAI")) {
                break;
            } else if (command.equals("MULAI")) {
                continue;
            } else {
                String nama = command;
                int barisScan;
                barisScan = scan.nextInt();
                int kolomScan;
                kolomScan = scan.nextInt();
                matriks[barisScan][kolomScan] = nama;
            }
        }

        String pengunjung1;
        pengunjung1 = scan.next();
        String pengunjung2;
        pengunjung2 = scan.next();

        int[] posisi1 = cariPosisi(matriks, pengunjung1);
        int[] posisi2 = cariPosisi(matriks, pengunjung2);

        int jarakX = Math.abs(posisi1[1] - posisi2[1]);
        int jarakY = Math.abs(posisi1[0] - posisi2[0]);

        if (posisi1[0] == posisi2[0]) {
            if (posisi1[1] < posisi2[1]) {
                System.out.printf("Jarak horizontal antara %s dan %s adalah %d ke kanan dan di baris yang sama\n", pengunjung1, pengunjung2, jarakX);
            } else if (posisi1[1] > posisi2[1]) {
                System.out.printf("Jarak horizontal antara %s dan %s adalah %d ke kiri dan di baris yang sama\n", pengunjung1, pengunjung2, jarakX);
            } else {
                System.out.printf("Jarak horizontal antara %s dan %s adalah %d ke kiri dan di baris yang sama\n", pengunjung1, pengunjung2, jarakX);
            }
        } else if (posisi1[1] == posisi2[1]) {
            if (posisi1[0] < posisi2[0]) {
                System.out.printf("Jarak vertikal antara %s dan %s adalah %d ke bawah dan di kolom yang sama\n", pengunjung1, pengunjung2, jarakY);
            } else {
                System.out.printf("Jarak vertikal antara %s dan %s adalah %d ke atas dan di kolom yang sama\n", pengunjung1, pengunjung2, jarakY);
            }
        } else {
            if (posisi1[0] < posisi2[0]) {
                System.out.printf("Jarak horizontal dan vertikal antara %s dan %s adalah %d ke kanan dan %d ke bawah\n", pengunjung1, pengunjung2, jarakX, jarakY);
            } else {
                System.out.printf("Jarak horizontal dan vertikal antara %s dan %s adalah %d ke kiri dan %d ke atas\n", pengunjung1, pengunjung2, jarakX, jarakY);
            }
        }
    }

    private static int[] cariPosisi(String[][] matriks, String pengunjung) {
        int[] posisi = new int[2];
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[0].length; j++) {
                if (matriks[i][j] != null && matriks[i][j].equals(pengunjung)) {
                    posisi[0] = i;
                    posisi[1] = j;
                    return posisi;
                }
            }
        }
        return posisi;
    }
}