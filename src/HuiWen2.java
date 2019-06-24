import java.io.*;

public class HuiWen2 {
    public static void main(String args[]) {
        int num = 0;
        System.out.println("please input");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            num = Integer.parseInt(br.readLine());
        } catch (Exception e) {
        }
        if (num / 10000 == num % 10 && (num - num / 10000 * 10000) / 1000 == num / 10 % 10)
            System.out.println(num + "是回文数");
        else System.out.println(num + "不是回文数");
    }
}