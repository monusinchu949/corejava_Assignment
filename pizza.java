package corejava;

import java.util.Scanner;

public class pizza {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the pizza size");
	String size= sc.nextLine();
	int price=0;
	switch(size) {
	case "smallsize":{
		System.out.println(price=125);
		break;
	}
	case "mediumsize":{
		System.out.println(price=250);
		break;
	}
	case "largesize":{
		System.out.println(price=300);
		break;
	}
	case "verylarge":{
		System.out.println(price=350);
		break;
	}
	}
}
}
