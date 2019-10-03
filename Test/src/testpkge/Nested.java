package testpkge;

public class Nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a=1,b=2,c=3,d=4,e=5;
		if(a>b&&a>c&&a>d&&a>e)
		{
			System.out.println(a+ " is larger number");
		}
		
		
		else if(b>a&&b>c&&b>d&&b>e)
		{
			System.out.println(b+ " is larger number");
		}
		else if(c>a&&c>b&&c>d&&c>e)
		{
			System.out.println(c+ " is larger number");
		}
		else if(d>a&&d>b&&d>c&&d>e)
		{
			System.out.println(d+ " is larger number");
		}
		
		
			else
			{
				System.out.println(e+ " is larger number");
			}
	}
}
