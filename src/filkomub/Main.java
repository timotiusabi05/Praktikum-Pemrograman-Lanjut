package filkomub;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test Case");
        System.out.println("1. Manusia:");
        System.out.println("a) Laki-laki telah menikah:");
        Manusia maleMenikah = new Manusia("Bobi Bola", "3275080900509302", true, true);
        System.out.println(maleMenikah);

        System.out.println("\nb) Perempuan telah menikah:");
        Manusia femaleMenikah = new Manusia("Park Jihyo", "327680990920222", false, true);
        System.out.println(femaleMenikah);

        System.out.println("\nc) Belum menikah:");
        Manusia belumMenikah = new Manusia("Kim Minji", "32456178000190290", false, false);
        System.out.println(belumMenikah);

        System.out.println("\n2. MahasiswaFilkom:");
        System.out.println("a) IPK kurang dari 3:");
        MahasiswaFILKOM ipkKurang = new MahasiswaFILKOM("175150407111015", 1.9, "Reza Rahadian", "34890891726372029", true, true);
        System.out.println(ipkKurang);

        System.out.println("\nb) IPK antara 3 dan 3,5:");
        MahasiswaFILKOM ipkSedang = new MahasiswaFILKOM("155150400001030", 3.4, "Pinkan Mambo", "3251567384999302", false, false);
        System.out.println(ipkSedang);

        System.out.println("\nc) IPK antara 3,5 dan 4:");
        MahasiswaFILKOM ipkTinggi = new MahasiswaFILKOM("225150401111119", 3.9, "Stefan William", "398273777480102", true, false);
        System.out.println(ipkTinggi);

        System.out.println("\n3. Pekerja:");
        System.out.println("a. Lama bekerja 2 tahun, anak 2:");
        Pekerja pekerjaBaru = new Pekerja(1200, 2020, 4, 7, 2, "Kim Mingyu", "327509817622276", true, true);
        System.out.println(pekerjaBaru);

        System.out.println("\nb. Lama bekerja 9 tahun:");
        Pekerja pekerjaTengah = new Pekerja(2500, 2016, 5, 30, 0, "Verrel Bramasta", "338936726000110", true, true);
        System.out.println(pekerjaTengah);

        System.out.println("\nc. Lama bekerja 20 tahun, anak 10:");
        Pekerja pekerjaLama = new Pekerja(4000, 2005, 12, 25, 10, "Tiara Andini", "32837488859490", false, true);
        System.out.println(pekerjaLama);

        System.out.println("\n4. Manager:");
        Manager manager = new Manager("Business Development", 10000, 2001, 5, 19, 3, "Raffi Ahmad", "337467802000109", true, true);
        System.out.println(manager);
    }
}
