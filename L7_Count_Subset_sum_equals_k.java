import java.util.ArrayList;
import java.util.Scanner;

public class L7_Count_Subset_sum_equals_k {

	public static int count_sum_equals_target(int [] arr,int n,int target,int ind,int sum) {
//		Base Case :- 
//					check if size == n  and sum == target;
		if(ind == n) {
			if(sum==target) {
				return 1;
			}
			return 0;
		}
		
		int l = count_sum_equals_target(arr,n,target,ind+1,sum+arr[ind]);
		int r = count_sum_equals_target(arr,n,target,ind+1,sum);
		
		return l+r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array :- ");
		n = sc.nextInt();
		
		int [] arr = new int[n];
		System.out.println("Enter Elements of array :- ");
		for(int i=0;i<n;i++)arr[i] = sc.nextInt();
		
		ArrayList < Integer> ans = new ArrayList<>();
		System.out.println("Enter target :- ");
		int target = sc.nextInt();
		System.out.println("Subsequences whose sum is equal to :- "+target);
		System.out.println(count_sum_equals_target(arr,n,target,0,0));
	}
}
