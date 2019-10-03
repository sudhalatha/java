package testpkge;

 class Address {  
String city,state,country;  
  
public Address(String city, String state, String country) {  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
  
}  

public class EMPSudha {
	
	int id;
	String name;
	Address address;

	EMPSudha(int id, String name, Address address){
	this.id = id;
	this.name = name;
	this.address = address;
	}

	void display(){
	System.out.println(id+" "+name);
	System.out.println(address.city+" "+address.state+" "+address.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address1 = new Address("gbn","up","india");
		Address address2 = new Address("nem","NZB","india");  

		EMPSudha e = new EMPSudha(222,"priya",address1);
		EMPSudha e1 = new EMPSudha(333,"latha",address2);

		e.display();
		e1.display();

	}

}
