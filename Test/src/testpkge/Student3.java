package testpkge;

public class Student3 {
	int id;
	String name;
	
	void display() {
		System.out.println(id +", "+name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student3 cp = new Student3();
		Student3 cp1 = new Student3();
		
		cp.display();
		cp1.display();

	}

}
