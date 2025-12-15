package OopsConcepts;

public class Employee {
	int id = 9235;
	String name = "saptagiri manu";
	double salary = 2000.00;

	public void getSalary() {
		System.out.println("the salary is " + salary);
	}

	public void getname() {
		System.out.println("the name is " + name);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println("the id is "+emp.id);
		emp.getSalary();
		emp.getname();
	}
}
