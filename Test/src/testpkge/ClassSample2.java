package testpkge;

class DisplayOverloading2
{
    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(int c)
    {
       System.out.println(c );
    }
}


public class ClassSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DisplayOverloading2 obj = new DisplayOverloading2();
        obj.disp('a');
        obj.disp(5);

	}

}
