package OopsConcepts;

import java.util.Scanner;

public class countelements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("enter the value for row"+(i+1)+"and column"+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
	}
		int number1=0;
		int number2=0;
		int number3=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
		int num=arr[i][j];
			if(num>1&&num<50) {
				number1++;
			}
			if(num>50&&num<100) {
				number2++;
			}
			if(num>100) {
				number3++;	
			}
			}
		}
		System.out.println("In the above array there are "+number1+"number between 1 to 50");
		System.out.println("In the above array there are "+number2+"number between 50 to 100");
		System.out.println("In the above array there are "+number3+"above 100");

	}
}
