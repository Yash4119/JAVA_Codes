import java.util.*;
public class L1_Basic {
	
	public static void print(int n) {
		if(n==0) {
			return;
		}
		print(n-1);
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		System.out.println("Now we will print the 1st "+n+" terms using recurssion");
		print(n);
		System.out.println("Done!!!!");
		
	}

}
