import java.util.Scanner;
public class parkir {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int jenis = scan.nextInt();
        int waktu = scan.nextInt();
        int bayar = scan.nextInt();
        int harga = 0;
        int kembalian = 0;
        int uang10k;
        int uang5k;
        int uang500;
        int uang100;
        if (jenis == 1)
            harga = 2000 * waktu;
        else if (jenis == 2)
            harga = 4000 * waktu;
        else if (jenis == 3)
            harga = 9000 * waktu;

        if (harga == bayar)
            System.out.println("Uang yang dibayarkan pas.");
        else if (bayar < harga)
            System.out.println("Uang anda belum mencukupi");
        else if (bayar > harga) {
            kembalian = bayar - harga;
            uang10k = kembalian / 10000;
            kembalian %= 10000;
            uang5k = kembalian / 5000;
            kembalian %= 5000;
            uang500 = kembalian / 500;
            kembalian %= 500;
            uang100 = kembalian / 100;
            System.out.println(uang10k + " uang 10.000");
            System.out.println(uang5k + " uang 5.000");
            System.out.println(uang500 + " uang 500");
            System.out.println(uang100 + " uang 100");
        }
    }
}
