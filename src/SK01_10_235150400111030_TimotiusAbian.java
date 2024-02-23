import java.util.Scanner;
public class SK01_10_235150400111030_TimotiusAbian {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hargaBarang, kodeBarang, jumlahBarang, hargaPerBarang;
        int jumlahEsKopiSusu = 0;
        int jumlahEsCaramelMacchiato = 0;
        int jumlahEsMatcha = 0;
        int jumlahEsThaiTea = 0;
        int jumlahEsVanillaLatte = 0;
        String konfirmasi;
        int total = 0;
        do {
            System.out.println("Selamat Datang di kafe kami");
            System.out.println();
            System.out.println("Kode Minuman");
            System.out.println("Es Kopi Susu (0)");
            System.out.println("Es Caramel Macchiato (1)");
            System.out.println("Es Matcha (2)");
            System.out.println("Es Thai Tea (3)");
            System.out.println("Es Vanilla Latte (4)");
            System.out.println();

            while (true) {
                System.out.println("Masukkan kode minuman (0-4)");
                kodeBarang = scan.nextInt();
                if (kodeBarang >= 0 && kodeBarang <= 4) {
                    break;
                } else {
                    System.out.println("Silakan masukkan kode minuman yang valid");
                }
            }
            System.out.println("Masukkan jumlah barang");
            jumlahBarang = scan.nextInt();
            if (kodeBarang == 0) {
                System.out.println("Es Kopi Susu");
                hargaPerBarang = 14000;
                jumlahEsKopiSusu += jumlahBarang;
            } else if (kodeBarang == 1) {
                System.out.println("Es Caramel Macchiato");
                hargaPerBarang = 16000;
                jumlahEsCaramelMacchiato += jumlahBarang;
            } else if (kodeBarang == 2) {
                System.out.println("Es Matcha");
                hargaPerBarang = 12000;
                jumlahEsMatcha += jumlahBarang;
            } else if (kodeBarang == 3) {
                System.out.println("Es Thai Tea");
                hargaPerBarang = 12000;
                jumlahEsThaiTea += jumlahBarang;
            } else if (kodeBarang == 4) {
                System.out.println("Es Vanilla Latte");
                hargaPerBarang = 16000;
                jumlahEsVanillaLatte += jumlahBarang;
            } else {
                System.out.println("kode barang tidak valid");
                hargaPerBarang = 0;
            }
            hargaBarang = jumlahBarang * hargaPerBarang;
            total += hargaBarang;
            System.out.println("Harga item ini = Rp" + hargaBarang);
            System.out.println("Apakah masih ada barang belanjaan yang ingin dibeli? (Ketikkan iya/tidak)");
            while (true) {
                konfirmasi = scan.next();
                if (konfirmasi.equalsIgnoreCase("iya") || konfirmasi.equalsIgnoreCase("tidak")) {
                    break;
                } else {
                    System.out.println("Input yang dimasukkan tidak valid. Inputkan iya atau tidak.");
                }
            }
        } while (konfirmasi.equalsIgnoreCase("iya"));
        System.out.println("Barang yang telah anda beli:");
        if (jumlahEsKopiSusu > 0) {
            System.out.println("Es Kopi Susu " + jumlahEsKopiSusu + " Cup");
        }
        if (jumlahEsCaramelMacchiato > 0) {
            System.out.println("Es Caramel Macchiato " + jumlahEsCaramelMacchiato + " Cup");
        }
        if (jumlahEsMatcha > 0) {
            System.out.println("Es Matcha " + jumlahEsMatcha + " Cup");
        }
        if (jumlahEsThaiTea > 0) {
            System.out.println("Es Thai Tea " + jumlahEsThaiTea + " Cup");
        }
        if (jumlahEsVanillaLatte > 0) {
            System.out.println("Es Vanilla Latte " + jumlahEsVanillaLatte + " Cup");
        }
        System.out.println();
        System.out.println("Total belanjaan anda adalah Rp " + total);
        System.out.println("Terima kasih telah berbelanja di kafe kami!");
    }
}
//Ketua:   Timotius Abian Aribowo_235150400111030
//Anggota: Zaid Ilman Faqih Umar_235150400111031
//         Olivia Nagok Solagratia Sitorus_235150401111037


