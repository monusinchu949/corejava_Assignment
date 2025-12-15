package OopsConcepts;

public class student {
	int student_id;
	String student_firstname;
	String student_lastname;
	double fee;
public student(int student_id,String student_firstname,String student_lastname,double fee) {
		this.student_id=student_id;
		this.student_firstname=student_firstname;
		this.student_lastname=student_lastname;
		this.fee=fee;
	}
public void getname() {
	System.out.println("firstname= "+student_firstname+"lastname= "+student_lastname);
}
public void getfees() {
	System.out.println("the fee= "+fee);
}
public static void main(String[] args) {
	student s1=new student(11,"sinchu","HR",30000);
	student s2=new student(12,"rachana","KN",20000);
	s1.getname();
	s2.getfees();
	System.out.println(s1.student_id+","+s1.student_firstname+","+s1.student_lastname+","+s1.fee);
	System.out.println(s2.student_id+","+s2.student_firstname+","+s2.student_lastname+","+s2.fee);
}
}
