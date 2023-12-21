package constructor;

public class CopyConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=========================First Object=========================");
		Employee employee = new Employee(1,"Neha");
		System.out.println("Id is : "+employee.id);
		System.out.println("Name is : "+employee.name);
		
		System.out.println("=========================Second Object=========================");
		Employee employeeCopy = new Employee(employee);
		System.out.println("Id is : "+employeeCopy.id);
		System.out.println("Name is : "+employeeCopy.name);
	}

}

class Employee{
	
	int id;
	String name;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Employee(Employee empCopy) {
		super();
		this.id = empCopy.id;
		this.name = empCopy.name;
	}
}
