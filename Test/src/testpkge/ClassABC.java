package testpkge;

public class ClassABC {
	public void myMethod(){
		System.out.println("Overridden Method");
	   }
	}
	class XYZ extends ClassABC{

	   public void myMethod(){
		System.out.println("Overriding Method");
	   }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassABC obj = new XYZ();
		obj.myMethod();

	}

}
