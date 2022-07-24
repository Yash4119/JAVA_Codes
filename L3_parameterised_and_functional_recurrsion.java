import java.util.Scanner;
public class L3_parameterised_and_functional_recurrsion {
	
	public static void func1(long i, long n) {
		if(i==0) {
			System.out.println("Sum is (func1):- "+n);
			return;
		}
		func1(i-1,n+i);
		return;
	}
	
	public static long func2(long n) {
		if(n==0) {
			return 0;
		}
		
		return n + func2(n-1);
	}
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return n * factorial(n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char ch;
		do {
			System.out.println("Enter a number :- ");
			int n = sc.nextInt();
			
			func1(n,0);
			long ans = func2(n);
			System.out.println("Sum is (func2) :- "+ans);
			
			System.out.println("do yo want to continue :- (y/n)");
			ch = sc.next().charAt(0);
		}while(ch == 'y' || ch == 'Y');
		
		System.out.println("Enter number you want factorial of :- ");
		int fact = sc.nextInt();
		int ans1 = factorial(fact);
		
		System.out.println("The factorial of "+ fact+" is :- "+ans1);
		
	}

}
