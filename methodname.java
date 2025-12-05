package corejava;

public class methodname {
public static void main(String[] args) {
	boolean value=canVote(15);
	if(value)
		System.out.println("can vote");
	else
		System.out.println("cannot vote");
}
public static boolean canVote(int age) {
	if (age>18) {
		return true;
	}
	else {
		return false;
	}
}
}

