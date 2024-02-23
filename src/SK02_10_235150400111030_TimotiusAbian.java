// Timotius Abian Aribowo (235150400111030)
// Pricilia Gladys Simbolon (235150400111029)
// Calista Aulia Rianka Rachma (235150407111032)
import java.util.Scanner;
public class SK02_10_235150400111030_TimotiusAbian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] namaBarang = {
                "Es Kopi Susu",
                "Es Caramel Macchiato",
                "Es Matcha",
                "Es Thai Tea",
                "Es Vanilla Latte",
                "Es Taro Latte",
                "Es Cappucino",
                "Hot Jasmine Tea",
                "Hot Earl Grey Tea",
                "Hot Milk Tea"
        };
        int[] hargaBarang = {14000, 16000, 12000, 12000, 16000, 15000, 15000, 10000, 10000, 10000};
        int[] jumlahBarangBeli = new int[10];

        int kodeBarang;
        int subtotal;
        String konfirmasi;
        int total = 0;
        System.out.println("Selamat Datang di kafe kami");
        System.out.println();
        System.out.println("Kode Minuman Kafe Kelompok 10");
        System.out.println("-------------------------");
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.println(namaBarang[i] + " Kode: " + i );
        }
        System.out.println("-------------------------");

        do {
            while (true) {
                System.out.println("Masukkan kode minuman (0-9)");
                kodeBarang = scan.nextInt();
                if (kodeBarang >= 0 && kodeBarang < namaBarang.length) {
                    break;
                } else {
                    System.out.println("Silakan masukkan kode minuman yang valid");
                }
            }
            System.out.println("Masukkan jumlah barang");
            int jumlahBarang = scan.nextInt();
            String namaBarangBeli = namaBarang[kodeBarang];
            int hargaPerJenis = hargaBarang[kodeBarang];
            subtotal = jumlahBarang * hargaPerJenis;

            System.out.println(namaBarangBeli + " x" + jumlahBarang + " Rp" + subtotal);
            System.out.println("Apakah masih ada barang belanjaan yang ingin dibeli? (Ketikkan iya/tidak)");
            total += subtotal;
            jumlahBarangBeli[kodeBarang] += jumlahBarang;
            while (true) {
                konfirmasi = scan.next();
                if (konfirmasi.equalsIgnoreCase("iya") || konfirmasi.equalsIgnoreCase("tidak")) {
                    break;
                } else {
                    System.out.println("Input yang dimasukkan tidak valid. Inputkan iya atau tidak.");
                }
            }
        } while (konfirmasi.equalsIgnoreCase("iya"));

        System.out.println();
        System.out.println("Barang yang telah anda beli:");
        for (int i = 0; i < namaBarang.length; i++) {
            if (jumlahBarangBeli[i] > 0) {
                System.out.println(namaBarang[i] + " x" + jumlahBarangBeli[i]  + " Cup");
            }
        }
        System.out.println("Total belanjaan anda adalah Rp" + total);
        System.out.println("Terima kasih telah berbelanja di kafe kami!");
    }
}

