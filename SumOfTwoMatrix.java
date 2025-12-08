package corejava;

import java.util.Scanner;

public class SumOfTwoMatrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int matrix1[][]=new int[2][2];
	int matrix2[][]=new int[2][2];
	for (int i = 0; i < matrix1.length; i++) {
		for (int j = 0; j < matrix2[i].length; j++) {
			System.out.println("enter the value of matrix1 for row"+(i+1)+"and column"+(j+1));
			matrix1[i][j]=sc.nextInt();
		}
	}
	for (int i = 0; i < matrix1.length; i++) {
		for (int j = 0; j < matrix2[i].length; j++) {
			System.out.println("enter the value of matrix2 for row"+(i+1)+"and column"+(j+1));
			matrix2[i][j]=sc.nextInt();
		}
	}
	int sum[][]=new int[2][2];
	for (int i = 0; i < matrix1.length; i++) {
		for (int j = 0; j < matrix2[i].length; j++) {
			
			sum[i][j]= matrix1[i][j]+matrix2[i][j];
		}
}
	for (int i = 0; i < matrix1.length; i++) {
		for (int j = 0; j < matrix2[i].length; j++) {
			System.out.print(sum[i][j]+" ");
		}
		System.out.println();
}
}
}
