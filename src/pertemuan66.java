public class pertemuan66 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println("");
        }
        System.out.println();
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println("");
        }
        System.out.println();

        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(' ');
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(' ');
            }
            for (int k = 1; k <= i; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("///////////");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i * 2 - 1; k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("//////");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("///////");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= 5; k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("////////////");
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5-i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}




//for (int b = 0; b < 5; b++){
//        for (int c = 5; c > b + 1; c--) {
//        System.out.print(' ');
//        }
//        for (int d = 0; d <= b; d++){
//        System.out.print('*');
//        }
//        System.out.println();
//
//        }