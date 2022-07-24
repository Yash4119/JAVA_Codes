
import java.util.Scanner;

public class merge_sort {

	void merge(int [] arr, int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		
		int [] left = new int[n1];
		int [] right = new int[n2];
		
		for(int i=0;i<n1;i++) {
			left[i] = arr[l+i];
		}
		for(int i=0;i<n2;i++) {
			right[i] = arr[m+1+i];
		}
		
		int i = 0,j = 0;
		int k=l;
		while(i<n1 && j<n2) {
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			}
			else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
		
	}
	
	void sort(int [] arr, int l, int r) {
		if(l<r) {
			int m = l + (r-l)/2;
			
			sort(arr, l , m);
			sort(arr, m+1, r);
			
			merge(arr, l, m, r);
		}
	}
	
	void display(int [] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {9,8,7,6,5,4,3,2,1,0};
		int n = arr.length;
		
		merge_sort ob = new merge_sort();
		
		System.out.println("Array befor sorting");
		ob.display(arr,n);
		
		ob.sort(arr, 0, n-1);
		
		System.out.println("Array after sorting");
		ob.display(arr, n);
	}

}
