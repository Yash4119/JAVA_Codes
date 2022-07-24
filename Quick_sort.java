
import java.util.Scanner;

public class Quick_sort {
	
	static void swap(int [] arr ,int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static int partition(int [] arr, int low, int high) {
		int pivot = arr[high];
		int i = low-1;
		
		for(int j = low;j<high;j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,high);
		return i+1;
	}
	
	static void sorting(int [] arr, int low, int high) {
		if(low<high) {
			int part = partition(arr,low,high);
			
			sorting(arr,low,part-1);
			sorting(arr,part+1,high);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {9,8,7,6,5,4,3,2,1,0};
		int n = arr.length;
		
		System.out.println("Array befor sorting");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		sorting(arr,0,n-1);
		System.out.println("Array after sorting");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
