
import java.util.Scanner;

public class Ternary_Search {
	
	static int ternary_search(int n, int arr[], int target,int l, int h) {
		
		int mid1 = l + (h-l)/3;
		int mid2 = h - (h-l)/3;
		
		if(arr[mid1]==target) {
			return mid1;
		}
		else if(arr[mid2] == target) {
			return mid2;
		}
		else if(arr[mid1] > target) {
			return ternary_search(n,arr,target,0,mid1);
		}
		else if(arr[mid2] < target) {
			return ternary_search(n,arr,target,mid2,n-1);
		}
		else if(arr[mid1] < target && arr[mid2]>target) {
			return ternary_search(n,arr,target,mid1,mid2);
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array you want :- ");
		n = sc.nextInt();
		
		int [] arr = new int[n];
		System.out.print("Enter elements of your array :- ");
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("enter element you want to search :- ");
		int target = sc.nextInt();
		
		int ans = ternary_search(n ,arr,target,0,n-1);
		
		System.out.print("The element "+target+" is found at index "+ans);
	}

}
