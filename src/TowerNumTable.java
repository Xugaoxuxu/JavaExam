import javax.swing.JOptionPane;

public class TowerNumTable {
    public static void main(String args[]) {
        int i = 0;
        String output = "";
        for (int row = 1; row <= 4; row++) {
            output += "\n";
            i = row;
            for (int column = -3; column <= 3; column++) {
                if (column < 0)
                    i = row + column;
                else
                    i = row - column;
                if (i <= 0)
                    output += "   ";
                else
                    output += " " + i;
            }
        }
        JOptionPane.showMessageDialog(null, output, "TowerNumber", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}