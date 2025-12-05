package corejava;

import java.util.Scanner;

public class electricity {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the unit");
	double units= sc.nextDouble();
	double cost=0;
	if(units<30) {
		cost=units/3.50;
	}
	else if(units>=30&&units<50) {
		cost=units/4.25;
	}
	else if(units>=50&&units<100) {
		cost=units/5.25;
	}
	else if(units>=100) {
		cost=units/5.85;
	}
	System.out.println("original unit="+units);
	System.out.println("cost="+cost);
	
}
}
