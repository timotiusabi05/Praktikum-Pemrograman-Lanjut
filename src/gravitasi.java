import java.util.Scanner;
public class gravitasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sudut = scan.nextInt();
        double radian = Math.toRadians(sudut);
        int tinggi = 50;
        int kecepatan = scan.nextInt();
        int waktu = 6;

        double jarakHorizontal = tinggi * Math.tan(radian);
        int jarak = (int) Math.ceil(jarakHorizontal);
        int jarakmax = waktu * kecepatan / 36 * 10;
        boolean berhasil = jarakmax > jarakHorizontal;
        System.out.println("Jarak horizontal bola terhadap gedung: " + jarak + " meter");
        System.out.println("Peserta dapat menangkap bola: "+ berhasil);
    }
}
