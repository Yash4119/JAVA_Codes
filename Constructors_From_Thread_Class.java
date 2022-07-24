
class Mythr extends Thread{
	public Mythr(String name) {
		super(name);
	}
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("This Myhtr Thread Recieveing nME ");
			i++;
		}
	}
}

public class Constructors_From_Thread_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is the code to check for Constructors form the Thread Class");
		
		Mythr t1 = new Mythr("yash");
		t1.start();
		System.out.println("The id of the thread is "+ t1.getId());
		System.out.println("Name of the thread is "+ t1.getName());
	}

}
