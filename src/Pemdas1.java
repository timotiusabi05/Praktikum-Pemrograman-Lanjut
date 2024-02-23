import java.util.Scanner;

public class Pemdas1 {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int x;
        x = scn.nextInt();
        int h = x / 2;
        int y = x - (2*h);
        if (y==0) {
            System.out.println("Genap");
        } else
            System.out.println("Ganjil");


    }
}
