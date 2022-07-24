import java.util.*;
class MyException extends Exception{
	@Override
	public String toString() {
		return super.toString()+"I am ToString()";
	}
	@Override
	public String getMessage() {
		return super.getMessage()+"I am getMessage()";
	}
}

public class Exception_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if(a<9) {
			try{throw new MyException();}
			catch(Exception e){
				System.out.println(e.getMessage());
				System.out.println(e.toString());
				System.out.println(e);
				e.printStackTrace();
			}
		}
	}

}
