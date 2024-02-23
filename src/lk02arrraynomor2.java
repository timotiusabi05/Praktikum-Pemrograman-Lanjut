import java.util.Scanner;
public class lk02arrraynomor2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        System.out.print("Masukkan jumlah siswa dalam kelas: ");
        int jumlahSiswa = scan.nextInt();
        int [] nilai = new int[jumlahSiswa];
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Nilai siswa ke-" + (i + 1) + ": ");
            nilai[i] = scan.nextInt();
            total += nilai[i];
        }
        double rataRata = (double) total / jumlahSiswa;
        System.out.println();
        System.out.println("Niai rata-rata siswa sebesar " + rataRata);
    }
}
