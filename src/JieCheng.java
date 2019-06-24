import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class JieCheng extends Applet implements ActionListener {
    Label result;
    TextField in;
    Button btn;

    int n = 0;
    long p = 1L;

    public void init() {
        result = new Label("please input a number <=20");
        in = new TextField(5);
        btn = new Button("start");
        add(result);
        add(in);
        add(btn);
        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        n = Integer.parseInt(in.getText());
        if (n > 20)
            result.setText("reput");
        else {
            for (int i = 1; i <= n; i++)
                p *= (long) i;
            result.setText(n + "!=" + p);
            p = 1L;
        }
    }
}