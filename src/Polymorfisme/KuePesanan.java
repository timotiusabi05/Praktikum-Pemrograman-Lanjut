package Polymorfisme;

public class KuePesanan extends Kue {
    private double berat;

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * getBerat();
    }

    @Override
    public String toString() {
        return String.format("%s%nJenis Kue\t: Kue Pesanan%nBerat Kue\t: %.2f kg%nTotal Harga\t: Rp%,.2f%n",
                super.toString(), getBerat(), hitungHarga());
    }
}