 package corejava;

public class sal {
public static void main(String[] args) {
	int HRA=10000, DA=20000, basic=15000;
	int total_sal=HRA+DA+basic;
	double tax=total_sal*15/100;
	double net_salary=total_sal-tax;
	System.out.println("total_salary="+total_sal);
	System.out.println("net_salary="+net_salary);
}
}
