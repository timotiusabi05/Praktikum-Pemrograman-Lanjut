
//    public static void main(String[] args) {
//        int hasil = tambah(5, 3);
//        System.out.println("hasil: " + hasil);
//
//        String pesan = buatPesan("Halo, ", "Java!");
//        System.out.println(pesan);
//    }
//
//    public static int tambah(int a, int b) {
//        return a + b;
//    }
//    public static String buatPesan (String s1, String s2) {
//        return s1 + s2;
//    }
//}
//
//import java.util.Scanner;
//public class methodpraktikum {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String fromCurrency = scan.nextLine();
//        double amount = scan.nextDouble();;
//        scan.nextLine();
//        String toCurrency = scan.nextLine();
//        double result = convertCurrency(fromCurrency, amount, toCurrency);
//        System.out.printf("%.1f %s%n", result, toCurrency);
//    }
//
//    public static double convertCurrency(String fromCurrency, double amount, String toCurrency) {
//        double rateFromUSD = getExchangeRate(fromCurrency);
//        double rateToUSD = getExchangeRate(toCurrency);
//        return (amount / rateFromUSD) * rateToUSD;
//        }
//
//        public static double getExchangeRate(String currency) {
//        switch (currency) {
//                case "USD":
//                    return 1.0;
//                case "JPY":
//                    return 110.0; // 1 USD = 110 JPY
//                case "KR":
//                    return 1200.0; // 1 USD = 1200 KR
//                case "AUD":
//                    return 1.4; // 1 USD = 1.4 AUD
//                case "CAD":
//                    return 1.25; // 1 USD = 1.25 CAD
//                case "EUR":
//                    return 0.88; // 1 USD = 0.88 EUR
//                case "GBP":
//                    return 0.75; // 1 USD = 0.75 GBP
//                default:
//                    return 0;
//        }
//    }
//}
import java.util.Scanner;
public class methodpraktikum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer[] array = new Integer[5];
        int size = 0;
        boolean run = true;
        while (run) {
            String input = scan.nextLine();
            String[] command = input.split(" ");

            if (command[0].equals("INSERT")) {
                int value = Integer.parseInt(command[1]);
                size = insert(array, size, value);
            } else if (command[0].equals("DELETE")) {
                int index = Integer.parseInt(command[1]);
                size = delete(array, size, index);
            } else if (command[0].equals("UPDATE")) {
                int index = Integer.parseInt(command[1]);
                int newValue = Integer.parseInt(command[2]);
                size = update(array, size, index, newValue);
            } else if (command[0].equals("DISPLAY")) {
                display(array, size);
            } else if (command[0].equals("END")) {
                display(array, size);
                break;
            }
        }

    }

    public static int insert(Integer[] array, int size, int value) {
        if (size < array.length) {
            array[size] = value;
            return size + 1;
        }
        return size;
    }

    public static int delete(Integer[] array, int size, int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            return size - 1;
        }
        return size;
    }

    public static int update(Integer[] array, int size, int index, int newValue) {
        if (index >= 0 && index < size) {
            array[index] = newValue;
        }
        return size;
    }

    public static void display(Integer[] array, int size) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.print(array[i]);
            } else {
                System.out.print("null");
            }
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

