package corejava;
import java.util.*;
public class SumOfTwoDimensional {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[][]=new int[2][2];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.println("enter the value for row"+(i+1)+"and column"+(j+1));
			arr[i][j]=sc.nextInt();
		}
	}
    int sum=0;
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			
			sum+=arr[i][j];
		}
}
	System.out.println(sum);
}
}
