package tugasInterface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Koperasi Karyawan Perusahaan NV. Meneer");
        String konfirmasi;
        Employee employee;
        do {
            System.out.print("\nMasukkan nama\t\t\t\t: ");
            String name = scan.nextLine();
            System.out.print("Masukkan nomor registrasi\t: ");
            int registrationNumber = scan.nextInt();
            scan.nextLine();
            System.out.print("Masukkan gaji\t\t\t\t: ");
            int salaryPerMonth = scan.nextInt();

            employee = new Employee(registrationNumber, name, salaryPerMonth, null);

            System.out.println(employee);

            System.out.print("Apakah identitas Anda sudah benar? Ketikkan iya/tidak.");
            while (true) {
                konfirmasi = scan.next();
                if (konfirmasi.equalsIgnoreCase("iya") || konfirmasi.equalsIgnoreCase("tidak")) {
                    break;
                } else {
                    System.out.println("Input yang dimasukkan tidak valid. Inputkan iya atau tidak.");
                }
            }
            scan.nextLine();
        } while (konfirmasi.equalsIgnoreCase("tidak"));
        System.out.println("\n======================================\n");

        System.out.println("Masukkan jumlah invoice:");
        int numOfInvoices = scan.nextInt();
        scan.nextLine();
        employee.setInvoices(new Invoice[numOfInvoices]);

        for (int i = 0; i < numOfInvoices; i++) {
            System.out.println("Masukkan detail produk yang Anda beli!");
            System.out.print("Masukkan nama produk\t\t: ");
            String productName = scan.nextLine();
            System.out.print("Masukkan jumlah produk\t\t: ");
            int quantity = scan.nextInt();
            System.out.print("Masukkan harga satuan produk: ");
            int pricePerItem = scan.nextInt();
            scan.nextLine();

            employee.getInvoices()[i] = new Invoice(productName, quantity, pricePerItem);

            System.out.println("\nDetail produk : ");
            System.out.println(employee.getInvoices()[i]);
        }

        System.out.println("\n======================================\n");
        System.out.println("Barang yang dibeli: ");
        for (int i = 0; i < numOfInvoices; i++) {
            System.out.println(employee.getInvoices()[i]);
        }
        double remainingSalary = employee.getSalaryPerMonth() - employee.getPayableAmount();
        System.out.println(employee);
        employee.printInvoices();

        System.out.println("Gaji akhir anda: Rp" + remainingSalary);
        System.out.println("Terima kasih telah berbelanja di Koperasi Karyawan Perusahaan NV. Meneer!");
    }
}
