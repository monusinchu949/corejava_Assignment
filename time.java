package corejava;
import java.util.*;
public class time {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the time");
	int number=sc.nextInt();
	printTime(number);
}
public static String printTime(int number) {
	
	if(number>=1&&number<=12) {
		return "am";
	}
	else if(number>=13&&number<=24) {
	    return "pm";
	}else {
		return "invalid input";
	}
}
}
