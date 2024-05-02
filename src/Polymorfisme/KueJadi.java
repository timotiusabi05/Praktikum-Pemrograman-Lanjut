package Polymorfisme;

public class KueJadi extends Kue {
    private double jumlah;

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * getJumlah() * 2.0;
    }

    public String toString() {
        return String.format("%s%nJenis Kue\t: Kue Jadi%nJumlah Kue\t: %.2f Buah%nTotal Harga\t: Rp%,.2f%n",
                super.toString(), getJumlah(), hitungHarga());
    }
}