/**
 * 辗转相除法求最大公约数
 */
public class DoWhileTest {
    public static void main(String[] args) {
        int a = 20, b = 12, k;
        int c = a, d = b;
        do {
            k = c % d;
            c = d;
            d = k;
        } while (k != 0);
        System.out.println("gcd(" + a + "," + b + ") = " + c);
    }

}
