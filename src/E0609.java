import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 求矩阵行、列和以及对角线和
 */
public class E0609 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] fArray = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("请输入第" + i + "行第" + j + "列整数");
                try {
                    fArray[i][j] = Integer.parseInt(br.readLine());
                } catch (IOException e) {
                    System.out.println("输入有误，请重新运行！");
                }
            }
        }
        int x = 0;
        for (int i = 0; i < 4; i++) {
            x = 0;
            for (int j = 0; j < 4; j++) {
                x += fArray[i][j];
            }
            System.out.println("第" + i + "行元素的和为" + x);

            x = 0;
            for (int j = 0; j < 4; j++) {
                x += fArray[j][i];
            }
            System.out.println("第" + i + "列元素的和为" + x);

            x = 0;
            for (int j = 0; j < 4; j++) {
                x += fArray[j][j];
            }
            System.out.println("\\对角元素的和为" + x);

            x = 0;
            for (int j = 0; j < 4; j++) {
                x += fArray[j][3 - j];
            }
            System.out.println("/对角元素的和为" + x);
        }
    }
}
