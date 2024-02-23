package Zoo;

import java.util.Scanner;

public class pemlan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        vet tiger = new vet();
        System.out.println("======================");
        System.out.println("Vet v1.0");
        System.out.println("by Abi");
        System.out.println("======================");
        System.out.println();
        System.out.print("Apakah ID harimau anda? ");
        tiger.id = scan.nextLine();
        System.out.print("Siapakah nama harimau anda? ");
        tiger.nama = scan.nextLine();
        System.out.print("Tahun berapa dia lahir? ");
        tiger.yearOfBirth = scan.nextInt();
        scan.nextLine();
        System.out.println();
        System.out.println("Selamat datang " + tiger.nama + " di Vet v1.0.");
        System.out.println("Tahun ini " + tiger.nama + " telah berumur " + (tiger.yearOfBirth - 2024) + " tahun.");
        System.out.println();
        System.out.print("Ingin mengaum (y/t)? ");
        tiger.konfirmasi = scan.nextLine();
        if(tiger.konfirmasi.equals("y"))
            tiger.roar();
        else if (tiger.konfirmasi.equals("t"))
            System.out.println("Baik, tidak apa. Mungkin lain kali.");
        System.out.println();
        System.out.println("Terima kasih telah menggunakan sistem ini.");
    }
}
//nama variabel & method -> tataKelola
// nama class -> TataKelola
// kalo konstanta -> pake final, variabelnya uppercase semua -> final int KONSTANTA_X = 11;