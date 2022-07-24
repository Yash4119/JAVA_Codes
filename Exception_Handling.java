


public class Exception_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 1000;
			int b = 0;
			
			try {
				int c = a/b;
				System.out.println("The result is " + c);
			}
			catch(Exception e) {
				System.out.println("Cannot Find Result , Error : ");
				System.out.println(e);
			}
			System.out.println("End Of The Program");
	}

}
