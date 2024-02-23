public class reviewloop {
    public static void main(String[] args) {
//        for (int z = 5; z > 0; z--) {
//            for (int n = 0; n < 3; n++) {
//            }
        // z = 5, dicek kondisinya apakah z lebih dari 0 -> True
        //Masuk kedalam ketemu for
        // Di for inisialisasi n = 1, dicek apakah n < 3 -> True
        // cetak z = 5
        // n di increment jadi 2, dicek apakah n <3 -> true
        //cetak z = 5
        // n di increment jadi 3 dicek apakah n < 3 -> false
        // Keluar looping n, balik ke for z,
        // z di decrement jadi 4, dicek apakah z > 0 -> true
        // masuk ke for, diinisialisasi n = 1, dicek apakh n <3 -> True
        // cetak z = 4
        // n di increment jadi 2, dicek apakah n < 3 -> true
        // cetak z = 4
        // n di increment jadi 3, dicek apakah n < 3 -> false
        // keluar dari for n, balik ke for z
        //dst
//        String s1 = "belajar";
//        int semester = 1;
//        float ipk = 3.298173721f;
//        System.out.printf("Kita sedang %s di semester %5d mendapatkan IPK %f", s1, semester, ipk);

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//
//                int hasil = i * j;
//
//                System.out.printf(" %2d |", hasil);
//            }
//
//            System.out.println();
//        }
        int baris = 5;
        int kolom = 5;
        System.out.print(" x |");

        for (int i = 1; i <= kolom; i++) {
            System.out.printf("%3d |", i);
        }
        System.out.println();
        for (int i = 1; i <= baris; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= kolom; j++) {
                int hasil = i * j;
                System.out.printf("%3d |", hasil);
            }
            System.out.println();
        }
    }
}




