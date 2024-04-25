package filkomub;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahun;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahun = LocalDate.of(tahunMasuk, bulanMasuk, tanggalMasuk);
        this.jumlahAnak = jumlahAnak;
    }
    public double getGaji() {
        return gaji;
    }
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    public LocalDate getTahun() {
        return tahun;
    }
    public void setTahun(LocalDate tahunMasuk) {
        this.tahun = tahunMasuk;
    }
    public int getJumlahAnak() {
        return jumlahAnak;
    }
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }
        public double getBonus() {
            int lamaKerja = LocalDate.now().getYear() - tahun.getYear();
            if (lamaKerja <= 5) {
                return gaji * 0.05;
            } else if (lamaKerja <= 10) {
                return gaji * 0.1;
            } else {
                return gaji * 0.15;
            }
        }

        @Override
        public double getPendapatan() {
            return super.getPendapatan() + getGaji() + getBonus() + (jumlahAnak * 20);
        }

        @Override
        public String toString() {
            return super.toString() +
                    "Tahun Masuk    : " + tahun + "\n" +
                    "Jumlah Anak    : " + jumlahAnak + "\n" +
                    "Gaji           : $" + gaji + "\n";
        }
    }

