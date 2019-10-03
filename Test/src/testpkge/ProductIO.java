package testpkge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductIO {
	
	
	private String Name;
	private int id;
	private float price;
	private float Quantity;

	private BufferedReader br;

	public void readData() throws IOException{

	br = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("Enter product id:");
	id = Interger.parseInt(br.readLine());

	System.out.print("Enter product name");
	 Name = br.readLine();

	System.out.print("Enter product price:");
	price = Float.parseFloat(br.readLine()); 

	System.out.print("Enter product Quantity:");
	Quantity = Float.parseFloat(br.readLine());
}
	public void showData(){
	System.out.println(id+"\t"+Name+"\t"+price+"\t"+"Quantity");
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		ProductIO e1 = new ProductIO();
		e1.showData();
	}

}
