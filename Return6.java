package corejava;

public class Return6 {
public static void main(String[] args) {
	System.out.println(checkSix(6,8));
	System.out.println(checkSix(4,2));
	System.out.println(checkSix(8,2));
	System.out.println(checkSix(1,2));
}
public static boolean checkSix(int num1,int num2) {
	boolean cond1=(num1==6);
	boolean cond2=(num2==6);
	boolean cond3=(num1+num2==6);
	boolean cond4=(Math.abs(num1-num2)==6);
	return cond1||cond2||cond3||cond4;
	
}
}
