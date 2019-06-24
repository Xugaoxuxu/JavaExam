import java.util.*;

public class JieCheng2 {
    public static void main(String args[]) {
        System.out.println("input");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i >= 20)
            System.out.println("reput");
        else
            System.out.println(i + "!=" + fact(i));
    }

    public static long fact(int n) {
        if (n == 1) return 1;
        else return n * fact(n - 1);
    }
}