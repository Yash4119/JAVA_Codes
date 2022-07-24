
import java.util.Scanner;

public class Selection_Sort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array you want :- ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("Enter Elements into the array :- ");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		//selection(arr,n);
		for(int i=0;i<n-1;i++) {
			int mini_idx = i;
			for(int j= i+1; j<n;j++) {
				if(arr[j] < arr[mini_idx]) {
					mini_idx = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[mini_idx];
			arr[mini_idx] = temp;
		}
		
		System.out.println("Array is :- ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
