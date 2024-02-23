import java.util.Scanner;

public class PuluhanSatuan {
    //    public static void main(String[]args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Masukkan bilangan 2 digit");
//
//        int x;
//        x = scn.nextInt();
//        int angkaDepan = x/10;
//        int satuan = x - (angkaDepan*10);
//        int puluhan = x - satuan;
//
//        System.out.println("puluhan = " + puluhan + ", satuan = " + satuan);
//
//
//    }
//}
//        public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
//            int total = 0;
//            int hargaBarang;
//            int kodeBarang;
//            int jumlahBarang;
//            int hargaPerBarang;
//            String konfirmasi;
//            do {
//                System.out.println("Selamat Datang di kafe kami");
//                System.out.println();
//                System.out.println("Kode Minuman");
//                System.out.println("Es Kopi Susu (0)");
//                System.out.println("Es Caramel Macchiato (1)");
//                System.out.println("Es Matcha (2)");
//                System.out.println("Es Thai Tea (3)");
//                System.out.println("Es Vanilla Latte (4)");
//                System.out.println();
//                {
//                    System.out.println("Masukkan kode minuman");
//                    kodeBarang = scan.nextInt();
//                    if (kodeBarang == 0) {
//                        System.out.println("Es Kopi Susu");
//                        hargaPerBarang = 14000;
//                        System.out.println("Harga = Rp14000");
//                    } else if (kodeBarang == 1) {
//                        System.out.println("Es Caramel Macchiato");
//                        hargaPerBarang = 16000;
//                        System.out.println("Harga = Rp16000");
//                    } else if (kodeBarang == 2) {
//                        System.out.println("Es Matcha");
//                        hargaPerBarang = 12000;
//                        System.out.println("Harga Rp12000");
//                    } else if (kodeBarang == 3) {
//                        System.out.println("Es Thai Tea");
//                        hargaPerBarang = 12000;
//                        System.out.println("Harga Rp12000");
//                    } else if (kodeBarang == 4) {
//                        System.out.println("Es Vanilla Latte");
//                        hargaPerBarang = 16000;
//                        System.out.println("Harga Rp16000");
//                    } else {
//                        hargaPerBarang = 0;
//                        System.out.println("Kode barang tidak ditemukan");
//                    }
//                    System.out.println("Masukkan jumlah barang");
//                    jumlahBarang = scan.nextInt();
//                    hargaBarang = jumlahBarang * hargaPerBarang;
//                    total += hargaBarang;
//                    System.out.println("Harga item ini = Rp" + hargaBarang);
//                }
//                System.out.println("Apakah masih ada barang belanjaan yang ingin dibeli? (Ketikkan iya/tidak)");
//                while (true) {
//                    konfirmasi = scan.next();
//                    if (konfirmasi.equalsIgnoreCase("iya") || konfirmasi.equalsIgnoreCase("tidak")) {
//                        break;
//                    }
//                    else {
//                        System.out.println("Input yang dimasukkan tidak valid. Inputkan iya atau tidak.");
//                    }
//                }
//            }
//            while (konfirmasi.equalsIgnoreCase("iya"));
//            System.out.println("Es kopi susu " + jumlahBarang);
//            System.out.println("Total belanjaan anda adalah Rp" + total);
//            System.out.println("Terima kasih telah berbelanja di kafe kami!");
//        }
//    }
//    {{
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

            System.out.println("Masukkan kode minuman");
            kodeBarang = scan.nextInt();
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
            System.out.println("Es Kopi Susu: x" + jumlahEsKopiSusu);
        }
        if (jumlahEsCaramelMacchiato > 0) {
            System.out.println("Es Caramel Macchiato: x" + jumlahEsCaramelMacchiato);
        }
        if (jumlahEsMatcha > 0) {
            System.out.println("Es Matcha: x" + jumlahEsMatcha);
        }
        if (jumlahEsThaiTea > 0) {
            System.out.println("Es Thai Tea: x" + jumlahEsThaiTea);
        }
        if (jumlahEsVanillaLatte > 0) {
            System.out.println("Es Vanilla Latte: x" + jumlahEsVanillaLatte);
        }
        System.out.println("Total belanjaan anda adalah Rp " + total);
        System.out.println("Terima kasih telah berbelanja di kafe kami!");
    }
}