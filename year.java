package corejava;
import java.util.*;
public class year {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year");
	int year =sc.nextInt();
	if(isleapyear(year)) {
		System.out.println(year+"is a leap year");
	}
	else
		System.out.println(year+"is not leap year");
}
public static boolean isleapyear(int year) {
	return year%4==0; //&& year%100!=0) || (year%400==0);
}
}
