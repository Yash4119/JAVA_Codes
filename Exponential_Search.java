import java.util.Arrays;
import java.util.Scanner;



public class Exponential_Search {
	
	static int Binary_Search(int arr[],int s,int e,int x){
		
		
		while(s<=e) {
			int mid = s + (e-s)/2;
			if(arr[mid] == x) {
				return mid;
			}
			else if(arr[mid] > x) {
				e = mid-1;
			}
			else {
				s = mid+1;
			}
		}
		return -1;
	}
	
	static int ExponentialSearch(int arr[], int n, int x) {
		if(arr[0] == x) {
			return 0;
		}
		
		int i = 1;
		while(i<n && arr[i] <= x) {
			i = i * 2;
		}
		
		return Binary_Search(arr,i/2,Math.min(i, n-1),x);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array you want :- ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		int x;
		System.out.println("Enter elements into the array :- ");
		for(int i=0;i<6;i++) {
			arr[i] = sc.nextInt();
		}
		do{
		System.out.println("Enter the Element you want to search :- ");
		x = sc.nextInt();
		
		if(ExponentialSearch(arr,arr.length,x)<0) {
			System.out.println("Element not found************");
		}
		else {
			System.out.println("Element found at index :- "+ExponentialSearch(arr,arr.length,x));
		}
		System.out.println("enter 1 if you want to continue");
		ch = sc.nextInt();
		
		}while(ch==1);

	}

}
