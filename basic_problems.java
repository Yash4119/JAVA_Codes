import java.util.*;
public class basic_problems {

	public static void print1(int i, int n) {
		if(i>n)return;
		
		System.out.print(i + " ");
		print1(i+1,n);
	}
	
	public static void print2(int i, int n) {
		if(i < 1)return;
		
		System.out.print(i+" ");
		print2(i-1, n);
	}
	
	public static void print3(int i, int n) {
		if(i<1)return;
		
		print3(i-1,n);
		System.out.print(i+" ");
	}
	
	public static void print4(int i, int n) {
		if(i>n)return;
		
		print4(i+1,n);
		System.out.print(i+" ");
	}
	
	public static void print5(int i, int n) {
		if(i>n)return;
		
		System.out.print(i+". Yash ");
		print5(i+1,n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		
		System.out.println("1 to "+n+" linearly :- ");
		print1(1,n);
		System.out.println("");
		
		System.out.println(n + " to 1 linearly :- ");
		print2(n,n);
		System.out.println("");
		
		System.out.println("1 to "+n+" using bactracking :- ");
		print3(n,n);
		System.out.println("");
		
		System.out.println(n+" to 1 using backtracking :- ");
		print4(1,n);
		System.out.println("");
		
		System.out.println("Printing Yash "+n+" times ");
		print5(1,n);
	}

}
