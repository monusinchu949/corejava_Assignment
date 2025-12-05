package corejava;
import java.util.*;
public class multipleof3 {
	public static void printMultiples(int arr[]) {
		int count=0;
		for(int num:arr) {
			if(num%3==0) {
				count++;
			}
		}
		System.out.println(count);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[] = new int[6];
	System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++) {
    	arr[i]=sc.nextInt();
    }
    printMultiples(arr);
}
}
