import java.util.Scanner;
import java.util.*; 

public class L4_Problems {
	
	public static void swap(int n, int m) {
		int temp = n;
		n = m;
		m = temp;
	}
	
	public static void reverse_01(int arr[] , int l, int r) {
		if(l>=r) {
			return;
		}
// 		swap(arr[l],arr[r]);
        int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		reverse_01(arr,l+1,r-1);
	}
	
	public static void reverse_02(int arr[], int i) {
		if(i>=arr.length/2) {
			return;
		}
// 		swap(arr[i], arr[arr.length-i-1]);
        int r = arr.length-i-1;
        // System.out.println(arr[i] + " " + arr[r]);
        int temp = arr[i];
		arr[i] = arr[r];
		arr[r] = temp;
// 		System.out.println(arr[i] + " " + arr[r]);
		reverse_02(arr,i+1);
	}
	
	public static Boolean is_palindrome(String s, int i) {
		if(i>=s.length()/2) {
			return true;
		}
		if(s.charAt(i) != s.charAt(s.length()-i-1)) {
			return false;
		}
		return is_palindrome(s, i+1);
	}
	
	public static void display(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array you want");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the string you want check is a palindrome or not");
		String s = sc.next();
		
		
		
		System.out.println("Reversing the array using 2 pointers");
		reverse_01(arr,0,n-1);
		display(arr);
		
		System.out.println("Reversing the arrya using single pointer");
		reverse_02(arr,0);
		display(arr);
		
		System.out.println("Checking for Palindrome");
			if(is_palindrome(s,0)) {
				System.out.println("Given string is Palindrome");
			}
			else {
				System.out.println("Given string is not Palindrome");
			}
	}

}
