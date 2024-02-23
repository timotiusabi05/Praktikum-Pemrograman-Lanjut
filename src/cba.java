import java.util.Scanner;

public class cba {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Data Mahasiswa" + " " + ":" + " ");
        byte jumlahMhs = input.nextByte();

        String mahasiswa [][] = new String [jumlahMhs][3];
        for (int i = 0; i < jumlahMhs ; i++) {
            System.out.println("");
            System.out.println("Data Mahasiswa ke-" + (i+1));
            for (int j = 0; j < 3; j++) {
                if(j == 0) {
                    System.out.print("NIM   ");
                }
                else if (j == 1) {
                    System.out.print("Nama   ");
                }
                else {
                    System.out.print("Jurusan   ");
                }
                System.out.println("");
                mahasiswa[i][j] = input.next();
            }
        }
        System.out.println("Data Mahasiswa yang diinputkan");
        System.out.println(" ");
        System.out.println("NIM   Nama   Jurusan   ");
        for (int i = 0; i < jumlahMhs; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mahasiswa[i][j] + "   ");

            }
            System.out.println();
        }
    }
}
