public class pemdasmethodteori {
    public static void main(String[] args) {
        System.out.println(luasLingkaran(7));
        System.out.println(luasPersegiPanjang(4,5));
        System.out.println(luasPermukaanTabung(7,8));
        System.out.println(volumeTabung(5,7));
    }
    public static float luasLingkaran (int radius) {
        return (float) radius * radius * 3.14f;
    }
    public static int luasPersegiPanjang (int panjang, int lebar) {
        return panjang * lebar;
    }
    public static float luasPermukaanTabung (int radius, int tinggi) {
        return (float) 2 * 3.14f * radius * (radius + tinggi);
    }
    public static float volumeTabung (int radius, int tinggi){
        return 3.14f * radius * radius * tinggi;
    }
}
    //    public static void main (String[] args) {
////        int panjang = 5;
////        int lebar = 6;
////        int luas = panjang * lebar;
////        System.out.println(luas);
//        System.out.println("");
//        System.out.println(hitungLuasPersegiPanjang(5, 3));
//        System.out.println(hitungLuasPersegiPanjang(4,6));
//    }
//    public static int hitungLuasPersegiPanjang(int panjang, int lebar) {
//        return panjang * lebar;
//    }
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int coba = scan.nextInt();
//        System.out.println("!");
//        main();
//    }
//
//    public static void main(String args) {
//        System.out.println("2");
//        System.out.println(hitungLuasPersegiPanjang(3,4));
//    }
//        public static int hitungLuasPersegiPanjang(int panjang, int lebar) {
//        return panjang * lebar;
//    }
//}
//    public static void main(String[] args) {
//        System.out.println(luasPrisma(10, 4, 2));
//        System.out.println(luasPrisma(4,3,10));
//        System.out.println(luasPrisma(1,1,1));
//    }
//
//    public static float luasSegitiga (int alasPrisma, int tinggi){
//        return (float) alasPrisma * tinggi / 2;
//    }
//
//    public static float luasPersegiPanjang (int panjang, int alasPrisma){
//        return (float) panjang * alasPrisma;
//    }
//
//    public static float luasPrisma (int panjang, int alasPrisma, int tinggi) {
//        return luasSegitiga(alasPrisma, tinggi) * 2 + luasPersegiPanjang(panjang, alasPrisma) * 3;
//    }

//TUGAS
// buat method untuk luas lingkaran
// buat method untuk luas persegi pqnjqng
// buat method LP tabung
// buat method volume tabung
//    public static void main(String[] args) {
//        System.out.println(luasLingkaran(7));
//        System.out.println(luasPersegiPanjang(4,5));
//        System.out.println(luasPermukaanTabung(7, 7));
//        System.out.println(volumeTabung(7,7));
//    }
//    public static float luasLingkaran (int radius) {
//        return (float) radius * radius * 3.14f;
//    }
//    public static int luasPersegiPanjang (int panjang, int lebar) {
//        return panjang * lebar;
//    }
//    public static float luasPermukaanTabung (int radius, int tinggi) {
//        return (float) 2 * luasLingkaran(radius) + 22/7f * 2 * radius * tinggi;
//    }
//    public static float volumeTabung (int radius, int tinggi) {
//        return luasLingkaran(radius) * tinggi;
//    }
//}



