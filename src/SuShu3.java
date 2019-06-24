import java.util.*;

public class SuShu3 {
    public static void main(String[] args) {
        int num;
        int i;
        System.out.println("请输入一个数：");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        //这个地方，i先++再判断是否小于num所以不用i<=num也会取到num
        for (i = 2; i <= num; i++) {
            if (num % i == 0)
                break;
        }
        if (num == i) {
            System.out.println(num + "是素数");
        } else {
            System.out.println(num + "不是素数");
        }
    }
}