import java.util.Scanner;
public class belajarUTP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlaha = scan.nextInt();
        int jumlahks = scan.nextInt();
        int jumlahkv = scan.nextInt();
        int jumlahc = scan.nextInt();
        int jumlahmr = scan.nextInt();
        int a = 20000;
        int ks = 28000;
        int kv = 23000;
        int c = 31000;
        int mr = 35000;
        double totala;
        double totalks;
        double totalkv;
        double totalc;
        double totalmr;
        int totalpesanan;
        if (jumlaha > 3)
            totala = a * jumlaha * 0.95;
        else
            totala = a * jumlaha;
        if (jumlahks > 2)
            totalks = ks * jumlahks * 0.92;
        else
            totalks = ks * jumlaha;
        if (jumlahkv > 4)
            totalkv = kv * jumlahkv * 0.88;
        else
            totalkv = kv *jumlahkv;
        if (jumlahmr > 2)
            totalmr = (mr * jumlahmr) - 10000;
        else
            totalmr = mr * jumlahmr;
        totalc = c * jumlahc;
        totalpesanan = jumlaha + jumlahks + jumlahkv + jumlahc + jumlahmr;
        System.out.printf("");


    }
}
