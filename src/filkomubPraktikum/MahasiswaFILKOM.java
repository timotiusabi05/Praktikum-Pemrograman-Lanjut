package filkomubPraktikum;


public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public String getNim() {
        return nim;
    }
    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    public double getIpk() {
        return ipk;
    }
    public String getStatus() {
        int angkatan = Integer.parseInt(nim.substring(0, 2));
        int prodi = Integer.parseInt(nim.substring(6, 7));
        String programStudi = "";
        if (prodi == 2) {
            programStudi = "Teknik Informatika";
        } else if (prodi == 3) {
            programStudi = "Teknik Komputer";
        } else if (prodi == 4) {
            programStudi = "Sistem Informasi";
        } else if (prodi == 6) {
            programStudi = "Pendidikan Teknologi Informasi";
        } else if (prodi == 7) {
            programStudi = "Teknologi Informasi";
        } else {
            programStudi = "Prodi tidak ada di Fakultas Ilmu Komputer";
        }
        return String.format("%s, %d", programStudi, 2000 + angkatan);
    }

    public double getBeasiswa() {
        if (ipk <= 4.0 && ipk > 3.5) {
            return 75;
        } else if (ipk <= 3.5 && ipk > 3) {
            return 50;
        } else {
            return 0;
        }
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return String.format("%s" +
                        "NIM            : %s%n" +
                        "IPK            : %.1f%n" +
                        "Status         : %s%n",
                super.toString(), nim, ipk, getStatus());
    }
}