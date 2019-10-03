package testpkge;

class Employee2{
	
	String name;
   static String companyname = "IBM";
	
  void display() {
	  
	  System.out.println("employee name:" + "Sudha" + "working in" +"IBM");
	  }

  class Programmer extends Employee{
	 float salary =4000;
}
 
   class Projectmanger extends Programmer{
	   
	   float salary = 3000;
	   
   }
   
   public class Employee{
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Projectmanger c = new Projectmanger();
		c.name = "Sudha";
		c.salary = 4000;
		c.salary = 3000;

	}

}
}
