// Timotius Abian Aribowo (235150400111030)
public class pemdasFaktorial {
    public static void main(String[] args) {
        System.out.println(faktorialLoop(5));
        System.out.println(faktorialRec(0));
        System.out.println();
    }
    public static int faktorialLoop(int angka){
        int hasil = 1;
        for (int i = angka; i >= 1 ; i--) {
            hasil *= i;
        }
        return hasil;
    }
    public static int faktorialRec(int x){
        if (x <= 1)
            return 1;
        else
            return x * faktorialRec(x - 1);
    }

    public static int pangkat(int a, int b) {
        int hasil = 1;
        for (int i = 0; i < b; i++) {
            hasil *= a;
        }
        return hasil;
    }
    public static int pangkatRec (int a, int b) {
        if (b == 0)
            return 1;
        else
            return a * pangkatRec(a, b-1);
    }
    public static int deretArit (int a, int b, int n){
        int hasil = a;
        for (int i = 0; i < n - 1; i++) {
            hasil +=b;
        }
        return hasil;
    }
    public static int deretRec (int a, int b, int n){
        return a + deretRec(b, n);
    }
    public static int deretRec (int b, int n){
        if (n == 0){
            return b = 0;
        }
        return b + deretRec(b, n-1);
    }
    public static int fibonacci (int n){
        if (n == 1)
            return 0;
        else if (n == 2)
            return 1;
        else
            return fibonacci (n-2) + fibonacci(n-1);
    }
}

//    public static void main(String[] args) {
//
//    }
    // modifier status returntype methodname (parameter)
    // parameternya berbeda

    //syarat OL:
    // - Signature harus sama
    // - nama methodnya sama
    // - parameternya HARUS berbeda, secara JUMLAH atau URUTAN TIPE DATA. kalo  jumlah sama, bs urutan yg diganti (JANGAN LIAT NAMANYAAA)
    // - KALO JUMLAH BEDA UDH PASTI OVERLOAD
    // - KALO JUMLAH SAMA BARU LIAT URUTANNYA

    // urutan byte - short - int - long - float - double

//    public static void cetak() {
//        System.out.println("tanpa parameter");
//    }
//    public static void cetak(String s) {
//        System.out.println("Isi data dari s:" + s );
//    }
//    public static void cetak(String s, int i) {
//        System.out.printf("isi dari s: %s, isi dari i: %d" , s, i);
//    }
//    public static void cetak(int i, String s) {
//        System.out.printf("isi dari i: %d, isi dari s: %s", i, s);
//    }

//    public static void cetak(int i, int s) {}
//    public static void cetak (int s, int i){} -> INI ERROR SOALNYA URUTAN TIPE DATA (INT) SAMA

    //---------------------------------------
    // usahakan makin kebawah semakin tinggi hindari int float trs bawahnya float int
//    public static void main(String[] args) {
//        number(1, 2);
//    }
////  ini cari yg mendekati. Di method 2 sama dan mendekati, method 3 mendekati mendekati, method 4 jauhhhhh, mendekati.
//    public static void number(int a, float b) {
//    }
//
//    public static void number(float a, float b) {
//    }
//
//    public static void number(double a, float b) {
//    }
//}


// kalo void xuma bsa satu cara maggil (dbwh). KALO TIDAK BUTUH KEMBALIAN PAKE VOIDDD
// psv m1 () {}
// m1();

// psi m1() {}
// m1();
// sout (m1());
// int a = m1 ();
//    public static void main(String[] args) {
//        int [] a = {10};
//        // ^^ buat inisialisasi array ke 0 = 10
//        m1(a);
//        System.out.println(a);
//    }
//    public static void m1(int a){
//        a++;
//    }
//    public static void m1 (int[] a){
//        a[0]++;
//    }
//}

// kalo void dipake di saat method tidak perlu dikembalikan
    // void gavbisa mengembalikan nilai, tp ttp bisa returntanpa nilai -> return;
    // kalo non void wajib ada return value nya. mis return 1; return "kadsdk"


//-METHOD RECURSIVE-
// Method yang memanggil dirinya sendiri
    // cara mengetahui recursive atau tidak: apakah method
//    public static void main(String[] args) {
//    m(2);
//}
//    public static void m(int i){
//        if (i <= 2)
//            return;
//        m(i);
//    }
//}


//recursive
//public static void main(String[] args) {
//
//    System.out.println(hitung(5));
//}
//    public static int hitung(int angka){
//        if ()
//    }
//}


