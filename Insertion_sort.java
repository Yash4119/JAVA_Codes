
import java.util.Scanner;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {6,5,4,3,2,1};
		int n = 6;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
//		int i = -1;
		for(int i =1;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}
		
	}

}
