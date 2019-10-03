package testpkge;

import java.util.Scanner;

public class Scannerclass {
	private String Name;
	private int id;
	private float price;
	private float Quantity;

	private Scanner sc;

	public void readData(){
	 sc=new Scanner(System.in);
	
	System.out.print("Enter product id:");
	id = sc.nextInt();
	System.out.print("Enter product Name:");
	Name = sc.next();
	System.out.print("Enter product price:");
	price = sc.nextFloat();
	System.out.print("Enter product Quantity:");
	Quantity = sc.nextFloat();
	}
	
	public void showData(){
		System.out.println(id+"\t"+Name+"\t"+price+"\t"+Quantity);
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scannerclass e1 = new Scannerclass();
		e1.showData();
		
	
	}

}
