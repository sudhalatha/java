package testpkge;

 class Teacher {
	
	void teach() {
		  System.out.println("Teaching subjects");
		 }
	
	class Students extends Teacher {
		 void listen() {
		  System.out.println("Listening to teacher");
		 }
		}
		
	public class Teacher{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Teacher s1 = new Teacher();
			  s1.teach();
			  s1.listen();
	}

}
}
