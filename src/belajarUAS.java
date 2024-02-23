public class belajarUAS {
//    void aMethod (int x, int y) {
//        int z = x * y;
//    }
//    static void modify (int num){
//        num += 10;
//    }
//
//    public static void main(String[] args) {
//        int num = 5;
//        modify (num);
//        System.out.println(num);
//    }
//    void aMethod() {
//        for (int i = 0; i < 10; i++) {
//            if (i == 5){
//                return;
//            }
//        }
//        System.out.println("end");
//    }

//    public static void main(String[] args) {
//        int a = 25;
//        System.out.println(a < 25 || a == 25 ? "A" : "B");
//    }

//public static void main(String[] args) {
//    int sum = 0;
//    for (int i = 0; i < 10; ++i) {
//        sum += i;
//    }
//    System.out.println(sum);
//
//}

//    public static void main(String[] args) {
//        int [] data  = {10, 5, 1, 7};
//        method1(data);
//        cetak(data);
//    }
//
//    public static void cetak(int[] data) {
//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i] + " ");
//        }
//    }
//
//    public static void method1(int[] data) {
//        int temp = data [1];
//        data [2] = data[3];
//        data[4] = temp;
//    }
//public static void main(String[] args) {
//    process(10, 20);
//}
//    public static void process (long a, long b) {
//
//    }

//    public static void main(String[] args) {
//        System.out.println(hasil(10, 10));
//    }
//
//    public static int hasil(int a, int b) {
//        return 1;
//    }
//
//    public static void main(String[] args) {
//
//        int i = 1, j = -1;
//        switch (i) {
//            case 1:
//                j = 1;
//            case 2:
//                j = 2;
//            default:
//                j = 0;
//        }
//        System.out.println(j);


//        int x = 0;
//        int y = 0;
//        if (( ++x > 2) || (++y > 2))
//            x++;
//        System.out.println(x + " " + y);
//
//        for (int x = 0; x < 2; x++) {
//            if (x ==0) continue;
//            System.out.println("selamat");
//            for (int z = x; z < 3; z++) {
//                if (z==2) break;
//                System.out.println("datang");
//            }
//        }
//        System.out.println(f(8));
//    }
//    public static int f (int n) {
//        if (n<10) return 0;
//        else return f (n+1) + 5 * n;
//    }
public static void main(String[] args) {
    int [] x;
    int n = 6;
    x = new int [n];
    for (int i = 0; i < n; i++) {
        x[i] = 10 / i;
    }
    for (int i = n - 2; i > 0; i--) {
        x[5] += x[i];
    }
    System.out.println(x[3]);
}





































































}
