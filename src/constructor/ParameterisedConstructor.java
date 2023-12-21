package constructor;

public class ParameterisedConstructor {
	
	int id;
	String name;
	
	ParameterisedConstructor(int id, String name){
		
		this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterisedConstructor con = new ParameterisedConstructor(1,"Name");
		System.out.println("Id is : "+con.id);
		System.out.println("Name is : "+con.name);
	}

}
