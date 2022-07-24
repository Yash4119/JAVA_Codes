


public class Heap_sort {

	static void sort(int [] arr, int n) {
		
		for(int i=(n/2)-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		System.out.println("Max heap is");
		display(arr,n);
		
		for(int i=n-1 ; i>0;i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			
			heapify(arr,i,0);
			
		}
		
	}
	
	static void heapify(int arr[] ,int n, int i) {
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		
		if(l<n && arr[l]>arr[largest]) {
			largest = l;
		}
		if(r<n && arr[r]>arr[largest]) {
			largest = r;
		}
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr,n,largest);
		}
		
	}
	
	static void display(int [] arr, int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {4,6,2,6,2,24,652,45,6,4,45};
		int n = arr.length;
		
		System.out.println("Array before sorting is");
		display(arr,n);
		
		sort(arr,n);
		
		System.out.println("Array after sorting");
		display(arr,n);
		
	}

}
