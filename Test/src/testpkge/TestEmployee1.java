package testpkge;



  class Employees{
	 int id;
	 String name;
	 float salary;
	 
	void insert(int i, String n, float s){
	  id = i;
	  name = n;
	  salary = s;

	}

	void display(){
	System.out.println(id+" "+name+" "+salary);
	}

	
  class TestEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employees obj = new Employees();
		  Employees obj1 = new Employees();
		  Employees obj2 = new Employees();

		obj.insert(101,"sudha",1000);
		obj1.insert(102,"Latha",2000);
		obj2.insert(103,"sony",3000);
		 
		obj.display();
		obj1.display();
		obj2.display();

	}

}
}