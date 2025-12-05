package corejava;
import java.util.*;
public class PrintAge {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the age");
	int age=sc.nextInt();
	if(age>0&&age<=12) {
		System.out.println("Kid");
	}
	else if(age>=13&&age<=19) {
		System.out.println("teenage");
	}
	else if(age>=20&&age<40) {
		System.out.println("youngster");
	}
	else if(age>=40&&age<=50) {
		System.out.println("aged man");
	}
	else if(age>=55&&age<=70) {
		System.out.println("old man");
	}
	}
}
