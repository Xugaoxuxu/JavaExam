import javax.swing.JOptionPane;

public class RectNumTable {
    public static void main(String args[]) {
        int i = 0;
        String output = "";
        for (int row = 0; row <= 3; row++) {
            output += "\n";
            i = row;
            //这个地方是column <= row,因为在一行里row就只赋值过一次行下标，剩下的都是列元素的值
            for (int column = 0; column <= 3; column++) {
                if (column < row) {
                    i = column;
                }else{
                    i = row;
                }
                output += "  " + i;
            }
        }
        JOptionPane.showMessageDialog(null, output, "RectNumber", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}