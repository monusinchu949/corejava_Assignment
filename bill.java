package corejava;
import java.util.*;
public class bill {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter total bill amount");
	double amount= sc.nextDouble();
	double discount=0;
	if(amount>2000) {
		discount=amount*15/100;
	}
	else if(amount>1000) {
		discount=amount*8/100;
	}
	else {
		discount=0;
	}
	double famount=amount-discount;
	System.out.println("original amount="+amount);
	System.out.println("discount applied="+discount);
	System.out.println("final amount= "+famount);
}
}
