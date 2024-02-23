import java.util.Scanner;
public class lk02arrraynomor1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa dalam kelas: ");
        int jumlahSiswa = scan.nextInt();
        int [] nilai = new int[jumlahSiswa];
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Nilai siswa ke-" + (i +1) + ": ");
            nilai[i] = scan.nextInt();
        }
        int nilaiMax = Integer.MIN_VALUE;
        int siswaMax = 0;
        for (int i = 0; i < jumlahSiswa; i++) {
            if (nilai[i] > nilaiMax)
                nilaiMax = nilai[i];
            siswaMax = i;
        }
        System.out.println();
        for (int i = 0; i < jumlahSiswa; i++) {
            String kelulusan = "";
            if (nilai [i] < 70)
                kelulusan = "gagal";
            else if (nilai [i] >= 70)
                kelulusan = "lulus";
            System.out.println("Siswa ke-" + (i + 1) +  " " + kelulusan);
        }
        System.out.println("Nilai terbaik siswa ke-" + siswaMax + " sebesar " + nilaiMax);
    }
}
