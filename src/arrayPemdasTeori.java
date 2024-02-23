
public class arrayPemdasTeori {
    public static void main(String[] args) {
int a = 1, b = 5;
for(;a<b;)
    System.out.print(a++);

System.out.println(++a);
////        int [] arr; -> deklarasi
////        arr = new int [10];
//        // ini merupakan instansiasi , buat ngatur berapa PANJANG INDEKS ARRAY, karena mulai dari 0 jadi sampe ke 9
////        arr [5] = 7;
//        // assignment indeks ke 5 valuenya 7
//        //int [] arr = new int [10]; -> ini declare sekaligus inisialisasi PANJANG INDEKS ARRAY
//        // int
////        int [] larik = new int [10];
////        larik [2] =5;
//        // INI KALO KITA CUMA TAU JUMLAH/BANYAKNYA AJA, GATAU VALUENYA
//
//        String [] mahasiswa = new String[]{"andika", "erwin", "joko"};
//        // kalo mau assign value langsung bisa begini, jadi gaperlu nentuin panjang indeksnya | INI KALO  KITA TAU DATANYA SIAPA AJA/VALUENYA
////        String [] mahasiswa = new String[]{"andika", "erwin", "joko"}; -> KALO ADA DUA KALI kode sama, yg bermasalah di deklarasinya soalnya gaboleh ada dua delarasi dengan variabel yang sama
//
//        String [] mahasiswa2 = {"andika", "erwin", "joko"};
//        // cara singkat, khusus tipe data array new string[] bisa diilangin
//
////        int [] larik = {2, 3, 6, 1, 5, 7};
////        for (int i = 5; i >= 0; i--) {
////            if (i > 0)
////            System.out.print(larik[i] + ", ");
////            else
////                System.out.print(larik[i]);
////        }
//        int []arr = {10};
//        int []brr = arr;
//        brr[0] += 1;
//        System.out.println(arr[0]);
//        // hasilnya 11 karena si brr bakal mereferensi alamat si a, jadi si arr ngikut ditambahin 1. (KARENA SATU ALAMAT) YANG DISAMAIN ITU ALAMATNYA BUKAN VALUENYA
//        int []crr = {10};
//        int [] drr = new int[];
//        crr[0] = drr[0];
////        Karena ada indeksnya, jadi yang dicopy valuenya bukan alamatnya (Integer bukan array integer! jadi primitif)
//        arr[0] += 100;
//        System.out.println(brr[0]);
//        // int b[5];
//        // b[5] = {0,0,0,0,0} error soalnya b[5] itu b di indeks ke 5, jadi tipe datanya integer dan cuma dimasukkin satu integer.
//    }
//}


// --------------------------------------------------------------------------------------
// int [] arr; -> deklarasi
// arr = new int [5]; -> instansiasi
// arr [3] = 7
// arr [1] = 4
// arr [5] GABOLEH
// sout arr -> cuma nampilin alamat
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]); -> yang kesout 0 4 0 7 0 bcs 0 adalah nilai default dari int (gw gak ngasi value buat arr ke 0 3 5)
//        }
        // KALO MAU LANGSUNG  int []arr = {0, 4, 0, 7, 0}
// ARR 2D
//        String [][] larik;
//        larik = new String [2][3];
//        larik [0][0] = "00";
//        larik [0][1] = "01";
//        larik [0][2] = "02";
//        larik [1][0] = "10";
//        larik [1][1] = "11";
//        larik [1][2] = "12";
//        String [][] larik = {{"00", "01", "02"}, {"10", "11", "12"}};
//        for (int i = 0; i < larik[0].length; i++) {
//            for (int j = 0; j < larik.length; j++) {
//                System.out.print(larik[j][i] + " ");
//            }
//            System.out.println();
//        }
// bisa larik.length, bisa 2 soale barisnya 2 BUAT BARIS
// bisa larik[0].length, bisa 3 buat kolom
        // for yang didalem buat nentuin yang mana yang mau dicetak lebih dahulu
//        -------
//        int [][] larik1 = {{1, 2, 3}, {4, 5, 6}};
//        int [][] larik2 = {{1, 3, 7}, {4, 2, 5}};
//
//        for (int i = 0; i < larik1.length; i++) {
//            for (int j = 0; j < larik1[0].length; j++) {
//                int hasil = larik1[i][j] + larik2 [i][j];
//                System.out.print(hasil + " ");
//            }
//            System.out.println();
//        int hasil = larik1[i][j] + larik2[i][j];
//        }
//        -----
//        int [][] larik1 = {{1, 2}, {3, 4}, {5, 6}};
//        int [][] larik2 = {{1, 3}, {2, 4}};
//
//        for (int i = 0; i < larik1.length; i++) {
//            for (int j = 0; j < larik1[0].length; j++) {
//                for (int k = 0; k < larik1[0].length; k++) {
//                    int hasil = larik1[i][k] * larik2[k][j];
//                    System.out.println(hasil + " ");
//                }
//                System.out.println();
//            }
//            boolean[] data = new boolean[5];
//            data[4] = true;
//            System.out.println((data[3]));




















    }
}
