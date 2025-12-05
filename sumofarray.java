package corejava;
import java.util.*;
public class sumofarray {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int[] num=new int[4];
	int sum=0;
	System.out.println("enter the elements");
	for (int i=0;i<num.length;i++) {
		num[i]=sc.nextInt();
	}
	for (int i = 0; i < num.length; i++) {
		sum+=num[i];
	}
	System.out.println(sum);
	}
}
