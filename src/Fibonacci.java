/**
*面板显示输出斐波那契数列
*/
import javax.swing.JOptionPane;

public class Fibonacci{
	public static void main(String args[]){
		String output="";
		int f1=1;
		output+="\nf1="+f1;
		int f2=1;
		output+="\nf2="+f2;
		int f;
		for(int i=3;i<=10;i++){
			f=f1+f2;
			f1=f2;
			f2=f;
			output+="\nf"+i+"="+f;
		}
		JOptionPane.showMessageDialog(null,output,"Fibonacci Numbers",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}	