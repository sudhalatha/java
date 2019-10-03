package testpkge;

public class Student7 {
	
	int id;
	String name;
	int age;

	Student7(int i, String n)  //creating two arg constructor
	{
	id = i;
	name = n;
	}

	Student7(int i, String n, int a)  // creating three arg constructor
	{
	id = i;
	name = n;
	age = a;
	}
	

 void display(){
 System.out.println(id+" "+name+" "+age);
}


	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student7 s1 = new Student7(111, "karan");
		Student7 s2= new Student7(222, "Aryan");

		s1.display();
		s2.display();


	}

}
