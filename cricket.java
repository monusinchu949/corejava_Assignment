package corejava;
import java.util.*;
public class cricket {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two teams score");
	int Ateam_score1=sc.nextInt();
	int Bteam_score2=sc.nextInt();
	if(Ateam_score1>Bteam_score2) {
		System.out.println("Ateam won the match");
	}
	else if(Ateam_score1==Bteam_score2) {
		System.out.println("Ateam and Bteam draw the match");
	}
	else {
		System.out.println("Bteam won the match");
	}
}
}
