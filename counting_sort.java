
import java.util.Scanner;
import java.util.Arrays;

public class counting_sort {

	int get_max(int arr[] , int n) {
		int maxi = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i]>maxi) {
				maxi = arr[i];
			}
		}
		return maxi;
	}
	
	static void count_sort(int arr[],int n) {
		counting_sort ob = new counting_sort();
		int maxi = ob.get_max(arr,n);
		
		int [] count = new int[maxi+1];
		
		for(int i=0;i<=maxi;i++) {
			count[i] = 0;
		}
		
		for(int i=0;i<n;i++) {
			count[arr[i]]++;
		}
		
		for(int i=1;i<=maxi;i++) {
			count[i] += count[i-1];
		}
		
		int [] output = new int[n];
		for(int i=n-1;i>=0;i--) {
			output[count[arr[i]-1]] = arr[i];
			count[arr[i]-1]--;
		}
		
		for(int i=0;i<n;i++) {
			arr[i] = output[i];
		}
		
	}
	
	static int get_min(int [] arr,int n) {
		int mini = arr[0];
		
		for(int i=1;i<n;i++) {
			if(arr[i]<mini) {
				mini = arr[i];
			}
		}
		return mini;
	}
	
	static void count_sort_negative(int arr[],int n) {
		counting_sort ob = new counting_sort();
		int maxi = ob.get_max(arr,n);
		int mini = get_min(arr,n);
//		int maxi = Arrays.stream(arr).max().getAsInt();
//        int mini = Arrays.stream(arr).min().getAsInt();
		
		int [] count = new int[maxi-mini+1];
		
		for(int i=0;i<count.length;i++) {
			count[i] = 0;
		}
		
		for(int i=0;i<n;i++) {
			count[arr[i]-mini]++;
		}
		
		for(int i=1;i<count.length;i++) {
			count[i] += count[i-1];
		}
		
		int [] output = new int[n];
		for(int i=n-1;i>=0;i--) {
			output[count[arr[i]-mini]-1] = arr[i];
			count[arr[i]-mini]--;
		}
		
		for(int i=0;i<n;i++) {
			arr[i] = output[i];
		}
		
	}
	
	static void display(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,1,2,426,34,146,5,634,3,7};
		int n = arr.length;
		int [] arr2 = {4,1,-2,426,-34,146,-5,634,-3,7};
		int n2 = arr2.length;
		
		System.out.println("Array before Sorting is ");
		display(arr,n);
		
		count_sort(arr,n);
		
		System.out.println("Array after sorting is");
		display(arr,n);
//		counting_sort ob = new counting_sort();
//		System.out.println(get_min(arr,n));
		System.out.println("Array before Sorting is ");
		display(arr2,n2);
		
		count_sort_negative(arr2,n2);
		
		System.out.println("Array after sorting is");
		display(arr2,n2);
	}

}
