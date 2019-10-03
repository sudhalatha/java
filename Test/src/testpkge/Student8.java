package testpkge;  //reusing the constructor

class TestThis8{
	int rollno;
	String name, course;
	float fee;

	TestThis8(int rollno, String name, String course){
	this.rollno = rollno;
	this.name = name;
	this.course = course;
	//this.fee = fee;
	}

	TestThis8(int rollno, String name, String course, float fee){
	//this(rollno,name,course);// reusing the constructor.
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	this.fee = fee;
	}
	void display(){
	System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
	

}


public class Student8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThis8 s1 = new TestThis8(888,"Sudha","java");
		TestThis8 s2 = new TestThis8(777, "Latha", "java",4000f);
		s1.display();
		s2.display();

	}

}
