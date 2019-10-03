package testpkge; //parameter constructor.

public class Student6 {
	
	int id;
	String name;

	Student6(int i, String n)
	{
	id = i;
	name = n;
	}

	void display()
	{
	System.out.println(id+" "+name);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student6 s1 = new Student6(111, "karan");
		Student6 s2= new Student6(222, "Aryan");

		s1.display();
		s2.display();


	}

}
