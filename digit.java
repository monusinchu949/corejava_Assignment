package corejava;

public class digit {
public static void main(String[] args) {
	int num=5843;
	int sum=0;
	while(num>0) {
		int digit1=num%10;
		sum=sum+digit1;
		num=num/10;
	}
	System.out.println("sum of digits="+sum);
}
}
