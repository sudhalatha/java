package testpkge;


class Employee{
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

	class TestEmployee{ 
		public static void main(String[] args) {  
	  Employee obj = new Employee();
	  Employee obj1 = new Employee();
	  Employee obj2 = new Employee();

	obj.insert(101,"sudha",1000);
	obj1.insert(102,"Latha",2000);
	obj2.insert(103,"sony",3000);
	 
	obj.display();
	obj1.display();
	obj2.display();

	}
	}	}
