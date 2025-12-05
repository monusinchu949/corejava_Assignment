package corejava;
import java.util.*;
public class arrayprogram {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] a=new int[5];
	System.out.println("enter five elements");
	for (int i=0;i<5;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("third element="+a[2]);
}
}