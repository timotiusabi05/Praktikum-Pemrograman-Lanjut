package perpus;

import java.util.Scanner;

public class uiPerpus {
    public static void main(String[] args) {
        repositoryBuku perpus = new repositoryBuku();
        Scanner scan = new Scanner(System.in);
        String konfirmasi;
        int input;
        int totalBuku = 0;
        totalBuku += perpus.banyakBuku(perpus.getFiksi()) + perpus.banyakBuku(perpus.getFilsafat()) + perpus.banyakBuku(perpus.getPolitik()) + perpus.banyakBuku(perpus.getTeknologi()) + perpus.banyakBuku(perpus.getSejarah()) + perpus.banyakBuku(perpus.getPsikologi()) + perpus.banyakBuku(perpus.getAgama());
        System.out.println("Selamat datang di Perpusatakaan SI-C!");
        System.out.println("Kategori Buku Perpustakaan SI-C:");
        System.out.println("1. Teknologi");
        System.out.println("2. Filsafat");
        System.out.println("3. Sejarah");
        System.out.println("4. Agama");
        System.out.println("5. Psikologi");
        System.out.println("6. Politik");
        System.out.println("7. Fiksi");
        System.out.println();
        System.out.println("Total Buku Perpustakaan SI-C saat ini: " + totalBuku);
        System.out.println("==============================================");
        do {
            while (true) {
                System.out.println("Pilih kategori buku yang ada ingin inginkan! (Ketik 1-7)");
                input = scan.nextInt();
                if (input >= 1 && input <= 7) {
                    break;
                } else {
                    System.out.println("Silakan masukkan kode kategori yang valid!");
                    System.out.println();
                }
            }
            if (input == 1) {
                System.out.println("Buku Teknologi yang teresedia di Perpustakaan SI-C:");
                perpus.detailBuku(perpus.getTeknologi());
            }
            else if (input == 2) {
                System.out.println("Buku Filsafat yang teresedia di Perpustakaan SI-C:");
                perpus.detailBuku(perpus.getFilsafat());
            }
            else if (input == 3) {
                System.out.println("Buku Sejarah yang teresedia di Perpustakaan SI-C:");
                perpus.detailBuku(perpus.getSejarah());
            }
            else if (input == 4) {
                System.out.println("Buku Agama yang teresedia di Perpustakaan SI-C:");
                perpus.detailBuku(perpus.getAgama());
            }
            else if (input == 5) {
                System.out.println("Buku Psikologi yang teresedia di Perpustakaan SI-C:");
                perpus.detailBuku(perpus.getPsikologi());
            }
            else if (input == 6) {
                System.out.println("Buku Politik yang teresedia di Perpustakaan SI-C");
                perpus.detailBuku(perpus.getPolitik());
            }
            else if (input == 7) {
                System.out.println("Buku Fiksi yang teresedia di Perpustakaan SI-C:");
                perpus.detailBuku(perpus.getFiksi());
            }
            scan.nextLine();
            System.out.println();
            System.out.println("Apakah anda ingin melihat buku dengan kategori lain? (ketikkan ya/tidak)");
            while (true) {
                konfirmasi = scan.nextLine();
                if (konfirmasi.equalsIgnoreCase("ya") || konfirmasi.equalsIgnoreCase("tidak")) {
                    break;
                } else {
                    System.out.println("Input yang dimasukkan tidak valid. Inputkan ya atau tidak.");
                }
            }
        } while(konfirmasi.equalsIgnoreCase("ya"));
        System.out.println("Terima kasih telah menggunakan layanan Perpustakaan SI-C!");
    }
}

//else if (input == 8) {
//        int jumlah = 0;
//        jumlah += perpus.banyakBuku(perpus.getFiksi()) + perpus.banyakBuku(perpus.getFilsafat()) + perpus.banyakBuku(perpus.getPolitik()) + perpus.banyakBuku(perpus.getTeknologi()) + perpus.banyakBuku(perpus.getSejarah()) + perpus.banyakBuku(perpus.getPsikologi()) + perpus.banyakBuku(perpus.getAgama());
//        System.out.println("Jumlah total buku: " + jumlah + "\n");
//        }


