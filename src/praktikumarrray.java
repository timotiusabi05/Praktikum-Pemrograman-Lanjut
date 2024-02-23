import java.util.Arrays;
import java.util.Scanner;

public class praktikumarrray {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
        //deklarasi
        int [] firstArray;
        String secondArray [];

        //inisialisasi buat batasan dari array
        firstArray = new int [5];
        secondArray = new String [5];

        //dec and in 5 itu sebagai panjang atau batasan
        int [] array = new int[5];
        String array2 [] = new String [5];

        // memberikan value pada array, mis. array ke 0 valuenya 5
        array[0] = 5;
        array2[2] = "2";

        //inisialisasi tp langsung semua value, gausah dikasi batasan. jadinya ada valuenya gak 0000 doang.
        int [] arr = {1,2,3,4,5};


        //ngasih value pake looping
        for (int i = 0; i < 5; i++) {
            array2[i] = "nomor" + i;
        }

        //print hanya address
        System.out.println(array);

        //print value (horizontal)
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array));

        //print fori (vertikal ke bawah)
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        //user yg input
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = scan.nextLine();
//        }
        //print foreach ????

        //duplicate array pake
        array.clone();

        int[] riza = new int [5];
        int [] reza = new int [5];
        riza[0] =5;
        reza [0] = 5;
        //nyamain value, diatas valuenya sama-sama 5 makanya true
        System.out.println(Arrays.equals(riza, reza));

        //nyamain nya address doang pasti false. JANGAN DIPAKE.
        System.out.println(riza.equals(reza));
    }
}
