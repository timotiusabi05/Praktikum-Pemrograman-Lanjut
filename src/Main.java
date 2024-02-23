import java.math.BigInteger;
public class Main {
    public static void main(String[] args) {
                BigInteger base = new BigInteger("726");
                BigInteger exponent = new BigInteger("79");
                BigInteger modulus = new BigInteger("3337");

                BigInteger result = base.modPow(exponent, modulus);

                System.out.println("Hasil " + base + "^" + exponent + " mod " + modulus + " = " + result);
            }
        }
