package testpkge;
// Abstract class can extend only one class
class Example1{
	   public void display1(){
	      System.out.println("display1 method");
	   }
	}
	abstract class Example2{
	   public void display2(){
	      System.out.println("display2 method");
	   }
	}
	abstract class Example3 extends Example1{
	   abstract void display3();
	}
	class Example4 extends Example3{
	   public void display3(){
	      System.out.println("display3 method");
	   }
	}
	

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Example4 obj=new Example4();
    obj.display3();
	}

}
