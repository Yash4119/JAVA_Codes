
import java.util.Scanner;

public class Radix_sort {

	static int get_max(int arr[], int n) {
		int maxi = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i] > maxi) {
				maxi = arr[i];
			}
		}
		return maxi;
	}
	
	static void count_sort(int arr[], int n, int exp) {
		int [] output = new int[n];
		int [] count = new int[10];
		
		for(int i=0;i<10;i++) {
			count[i] = 0;
		}
		
		for(int i=0;i<n;i++) {
			count[(arr[i]/exp)%10]++;
		}
		
		for(int i=1;i<10;i++) {
			count[i] += count[i-1];
		}
		
		for(int i= n-1; i>=0;i--) {
			output[count[(arr[i]/exp)%10]-1] = arr[i];
			count[(arr[i]/exp)%10]--;
		}
		
		for(int i=0;i<n;i++) {
			arr[i] = output[i];
		}
	}
	
	
	static void radix(int arr[], int n) {
		int maxi = get_max(arr,n);
		
		for(int exp=1;maxi/exp>0;exp*=10) {
			count_sort(arr,n,exp);
		}
		
	}
	
	static void display(int arr[], int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {4,1,2,426,34,146,5,634,3,7};
		int n = arr.length;
		
		System.out.println("Array before Sorting is ");
		display(arr,n);
		
		radix(arr,n);
		
		System.out.println("Array after sorting is");
		display(arr,n);
		
	}

}
