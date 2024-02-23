import java.util.Scanner;
public class Klinik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama = scan.nextLine();
        int hari = scan.nextInt();
        scan.nextLine();
        String rambut = scan.nextLine();
        boolean catRambut = scan.nextBoolean();
        scan.nextLine();
        String member = scan.nextLine();
        int harga = 0;
        int hargaTotal = 0;
        int hargaSubTotal = 0;
        int hargaMember = 0;
        double diskon = 0;
        System.out.println("========================");
        System.out.println("------------------------");
        System.out.printf("%17s%n", "Rawr Cuts");
        System.out.println("========================");
        System.out.println(hari + " Oktober 2022");
        System.out.println();
        System.out.println(nama);
        if (rambut.equals("Junior Cut")) {
            harga = 50000;
            System.out.printf("%-14s Rp.%s", rambut, harga);
        } else if (rambut.equals("Senior Cut")) {
            harga = 75000;
            System.out.printf("%-14s Rp.%s", rambut, harga);
        } else if (rambut.equals("Cepmek Cut")) {
            harga = 100000;
            System.out.printf("%-14s Rp.%s", rambut, harga);
        }
        hargaSubTotal += harga;
        System.out.println();
        if (catRambut) {
            harga = 75000;
            System.out.printf("%-14s Rp.%s", "Lainnya", harga);
        } else {
            harga = 0;
            System.out.printf("%-14s Rp.%s", "Lainnya", harga);
        }
        hargaSubTotal += harga;
        System.out.println();
        System.out.println("------------------------");
        if (hari <= 14) {
            diskon = 0.40;
            System.out.printf("%-16s %6s", "Diskon", "40%");
        }
        else {
            diskon = 0;
            System.out.printf("%-16s %6s", "Diskon", "0%");
        }
        System.out.println();
        System.out.println();
        if (member.equals("baru")) {
            hargaMember = 50000;
            System.out.printf("%-14s Rp.%s", "Member", hargaMember);
        } else if (member.equals("lama")){
            hargaMember = 0;
            System.out.printf("%-14s Rp.%s", "Lainnya", hargaMember);
        }
        hargaTotal += (hargaSubTotal * (1 - diskon) + hargaMember);
        System.out.println();
        System.out.printf("%-14s Rp.%s%n", "Total", hargaTotal);
        System.out.println("========================");
        System.out.printf("%21s%n", "Terimakasih Banyak");
        System.out.println("------------------------");
        System.out.println("========================");
    }
}
//        int n = scan.nextInt();
//        if (n%3==0)
//            System.out.print("Wam");
//        if (n%5 == 0)
//            System.out.print("Boom");
//        if (n%7 == 0)
//            System.out.print("Pow");


//            int N = scan.nextInt();
//            int k = scan.nextInt();
//            if (N%k==0)
//                System.out.println("BENAR");
//            else if (k==0)
//                System.out.println("nol");
//            else
//                System.out.println("SALAH");

//        System.out.println("PROGRAM KASIR SOTO SATE CL");
//        String nama = scan.nextLine();
//        int n = scan.nextInt();
//        int jumlah = scan.nextInt();
//        String pesanan ="";
//        int harga = 0;
//        if (n%2 ==0) {
//            pesanan = "Nasi";
//            harga = jumlah * 3000;
//        }
//        else if (n%3 == 0) {
//            pesanan = "Soto";
//            harga = jumlah * 7000;
//        }
//        else if (n%5 == 0) {
//            pesanan = "Sate";
//            harga = jumlah * 5000;
//        }
//        System.out.println("|NAMA PESANAN        |JUMLAH         |               HARGA|");
//        System.out.printf("%-20s%-15d%-20s\n", pesanan, jumlah, harga);
//        System.out.printf("Total Harga: Rp %d\n", harga);

//        String n = scan.nextLine();
//        int jumlahKarakter = n.length();
//        if (jumlahKarakter <= 50){
//            System.out.println(n);
//        }
//        else {
//            n = n.replaceAll("yang", "yg");
//            n = n.replaceAll("enggak bisa", "gb");
//            n = n.replaceAll("enggak", "g");
//            n = n.replaceAll("bisa", "bs");
//            System.out.println(n);
//        }
//        int subtotal = scan.nextInt();
//        scan.nextLine();
//        String pengiriman = scan.nextLine();
//        double total = 0;
//        if (pengiriman.equals("Kirim")) {
//            total = subtotal + (subtotal * 0.01);
//            System.out.println("Total harga belanja : Rp " + subtotal + ".00");
//            System.out.println("Status delivery : Diantarkan");
//            System.out.println("Total harga yang perlu dibayar : Rp " + total + "0");
//        }
//        else if (pengiriman.equals("Ambil")) {
//            System.out.println("Total harga belanja : Rp " + subtotal + ".00");
//            System.out.println("Status delivery : Diambil");
//        }
//    }
//}
//        int x, y = 0;
//        for (x = 1; x <= 3; x++)
//            for (y = 3; y >= 1; y--) ;
//        System.out.printf("%d %d ", x, y);
//
//        for (x=1;x<=3;x++);
//        for (y=3;y>=1;y--);
//        System.out.printf("%d %d ",x,y);
//        double a = (1/2 + 3.5) * 2.0;
//        System.out.println(a);

//        int a = 1;
//        for (int i = 1; i < 3 ; i++) {
//            a++;
//            ++a;
//        }
//        System.out.println(a);
//        double a = Math.pow(2, 3);
//        if (a>1)
//            for (int i = 0; i < 5; i++)
//                a++;
//            for (int i = 0; i < 3; i++)
//                a--;
//        System.out.println(a);
//        int a = 6;
//        double c = 0.5;
//        c++;
//        double hasil = a/c;
//        System.out.printf("%.2f", hasil * ++c);
//        for (int x = 5; x >= 0 ; x--) {
//    if (x < 3 && x > 1)
//    continue;
//    if (x == 1)
//        break;
//            System.out.print(x);
//        }
//
//    }
//}
