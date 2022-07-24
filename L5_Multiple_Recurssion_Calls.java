import java.util.*;

public class L5_Multiple_Recurssion_Calls {
	
	public static int fibonacci(int n) {
		if(n <= 1) {
			return n;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("4th fibonacci :- "+fibonacci(4));
		System.out.println("5th fibonacci :- "+fibonacci(5));
		System.out.println("6th fibonacci :- "+fibonacci(6));
		System.out.println("7th fibonacci :- "+fibonacci(7));
		System.out.println("8th fibonacci :- "+fibonacci(8));
		System.out.println("9th fibonacci :- "+fibonacci(9));
		System.out.println("30th fibonacci :- "+fibonacci(30));
	}

}
