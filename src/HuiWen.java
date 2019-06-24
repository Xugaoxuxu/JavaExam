import java.util.*;

public class HuiWen {
    public static void main(String args[]) {
        System.out.println("please input");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num / 10000 == num % 10 && (num - num / 10000 * 10000) / 1000 == num / 10 % 10)
            System.out.println(num + "yes");
        else System.out.println(num + "no");
    }
}