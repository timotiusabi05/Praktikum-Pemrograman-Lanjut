import java.util.Scanner;
public class lk02arrraynomor3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka: ");
        int jumlahAngka = scan.nextInt();
        int [] angka = new int[jumlahAngka];
        for (int i = 0; i < jumlahAngka; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = scan.nextInt();
        }
        boolean[] sama = new boolean[jumlahAngka];
        for (int i = 0; i < jumlahAngka; i++) {
            for (int j = i + 1; j < jumlahAngka; j++) {
                if (angka[i] == angka[j]) {
                    sama[j] = true;
                }
            }
        }
        System.out.println();
        boolean angkaPertama = true;
        System.out.print("Angka unik: ");
        for (int i = 0; i < jumlahAngka; i++){
            if (!sama[i])
                if (angkaPertama) {
                    System.out.print(angka[i]);
                    angkaPertama = false;
                }
                else
                    System.out.print(", " + angka[i]);
        }
    }
}