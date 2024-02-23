import java.util.Scanner;
public class pemdasSeleksi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mau berapa kali transaksi?");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            int kodeBarang, jumlahBarang, harga;
            System.out.println("Masukkan kode barang");
            kodeBarang = scan.nextInt();

            if (kodeBarang == 0) {
                System.out.println("Spidol");
                harga = 3000;
            } else {
                if (kodeBarang == 1) {
                    System.out.println("kopi");
                    harga = 5000;
                } else {
                    if (kodeBarang == 2) {
                        System.out.println("Pop Mie");
                        harga = 2500;
                    } else {
                        harga = 0;
                        System.out.println("Kode barang tidak ditemukan");
                    }
                }
            }
            System.out.println("Masukkan jumlah barang");
            jumlahBarang = scan.nextInt();
            System.out.println("subtotal = " + jumlahBarang * harga);
        }
    }
}
// jml barang min 5, jml barang dibeli diminta user, di for ( i<2) mengikuti flowchart