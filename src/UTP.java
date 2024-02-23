import java.util.Scanner;
public class UTP {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        if (x + y + z == 180) {
            if (x == 90 || y == 90 || z == 90)
                System.out.println("Segitiga siku-siku");
            else if (x > 90 || y > 90 || z > 90)
                System.out.println("Segitiga tumpul");
            else if (x < 90 || y < 90 || z < 90)
                System.out.println("Segitiga lancip");
        }
            else
                System.out.println("Bukan segitiga");
    }
}
