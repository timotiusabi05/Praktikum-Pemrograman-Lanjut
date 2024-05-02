package Polymorfisme;

public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        return String.format("Nama Kue\t: %s%nHarga Kue\t: Rp%,.2f", getNama(), getHarga());
    }
}
