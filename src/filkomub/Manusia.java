package filkomub;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public boolean getJenisKelamin() {
        return jenisKelamin;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public String getNik() {
        return nik;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    public boolean getMenikah() {
        return menikah;
    }
    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25 : 20;
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return String.format("Nama           : %s%n" +
                        "NIK            : %s%n" +
                        "Jenis Kelamin  : %s%n" +
                        "Pendapatan     : %.1f%n",
                nama, nik,  (jenisKelamin ? "Laki-laki" : "Perempuan"), getPendapatan());
    }
}