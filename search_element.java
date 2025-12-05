package corejava;
import java.util.*;
public class search_element {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[6];
	System.out.println("enter the array elements");
	for (int i = 0; i < arr.length; i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("enter array element to search");
	int key=sc.nextInt();
	boolean found=false;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]==key) {
			found=true;
			break;
		}
	}
	if(found) {
		System.out.println(key+ "element is in the array");
	}
	else {
		System.out.println(key+ "element is not in the array");
	}
}
}
