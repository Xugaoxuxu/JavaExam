import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 十进制转二进制
 */
public class E0608 {
    public static void main(String[] args) {
        int c = 0;
        char ch = ' ';
        String s = " ";
        BufferedReader rr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入十进制整数");
        try {
            c=Integer.parseInt(rr.readLine());
            System.in.skip(2);
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (c > 0) {
            s = c % 2 + s;
            c = c / 2;
        }
        System.out.println("二进制数：" + s);
    }
}
