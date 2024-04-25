package filkomub;


public class Pekerja extends Manusia {
    private double gaji;
    private int tahunMasuk;
    private int bulanMasuk;
    private int tanggalMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.bulanMasuk = bulanMasuk;
        this.tanggalMasuk = tanggalMasuk;
        this.jumlahAnak = jumlahAnak;
    }
    public double getGaji() {
            return gaji;
        }
        public double getBonus() {
            int lamaKerja = 2024 - tahunMasuk;
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
                    "Tahun Masuk    : " + tahunMasuk + "\n" +
                    "Jumlah Anak    : " + jumlahAnak + "\n" +
                    "Gaji           : $" + gaji + "\n";
        }
    }

