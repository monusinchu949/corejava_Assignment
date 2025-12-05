package corejava;

public class greatest {
public static void main(String[] args) {
	int a=10;
	int b=100;
	int c=900;
	int d=450;
	int e=690;
	String f=(a>b)&&(a>c)&&(a>d)&&(a>e)? "greatest="+a: (b>c)&&(b>d)&&(b>e)? "greatest="+b: (c>d)&&(c>e)? "greatest="+c: (d>e)? "greatest="+d:"greatest="+e;
	System.out.println(f);
}
}
