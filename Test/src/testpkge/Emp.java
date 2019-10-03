package testpkge;

public class Emp {
	
	int id;
	String name;
	Address1 address;
	
	public Emp(int id, String name, Address1 address) {
		 this.id = id;
		 this.name = name;
		 this.address = address;
	}
	
	void display() {
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+address.state+" "+address.country);
	}
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	Address1 c = new Address1("HNK", "nzm", "Wgl");
    	Address1 d = new Address1("tcp", "kar", "ban");
    	
    	Emp e = new Emp(111', "Sudha", "address1");
    	Emp f = new Emp(121', "Anne", "address2");

    			e.display();
    	        f.display();
    	
	}

}
