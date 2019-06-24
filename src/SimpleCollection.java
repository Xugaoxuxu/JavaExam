import java.util.*;

public class SimpleCollection{
	public static void main(String args[]){
	Collection<Integer> c = new ArrayList<Integer>();
	for(int i=1;i<10;i++)
		c.add(i);
	for(Integer i : c)
		System.out.print(i+" ");
	}
}
