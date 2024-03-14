package Zoo;

import java.util.Scanner;

public class PlayingClass_235150400111030_TimotiusAbian {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        PantheraTigris tiger = new PantheraTigris();
        int currentYear;
        System.out.println("======================");
        System.out.println("Vet v2.0");
        System.out.println("by Timotius Abian");
        System.out.println("======================");
        System.out.println();
        System.out.print("Apakah ID harimau anda? ");
        tiger.id = scan.nextLine();
        System.out.print("Siapakah nama harimau anda? ");
        tiger.nama = scan.nextLine();
        System.out.print("Tahun berapa dia lahir? ");
        tiger.yearOfBirth = scan.nextInt();
        scan.nextLine();
        System.out.print("Tahun berapakah saat ini? ");
        currentYear = scan.nextInt();
        scan.nextLine();
        System.out.println("Selamat datang " + tiger.nama + " di Vet v2.0.");
        System.out.println("Tahun ini " + tiger.nama + " telah berumur " + tiger.getAge(currentYear) + " tahun.");

        while (true) {
            System.out.print("Ingin mengaum (y/t)? ");
            tiger.konfirmasi = scan.nextLine();
            if (tiger.konfirmasi.equalsIgnoreCase("y")) {
                tiger.roar();
                break;
            } else if (tiger.konfirmasi.equalsIgnoreCase("t")) {
                System.out.println("Baik, tidak apa. Mungkin lain kali.");
                break;
            } else {
                System.out.println("Input tidak valid. Ketikkan 'y' atau 't'.");
            }
        }
        System.out.println();
        System.out.println("Terima kasih telah menggunakan sistem ini.");
    }
}