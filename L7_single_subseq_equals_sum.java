import java.util.ArrayList;
import java.util.Scanner;

public class L7_single_subseq_equals_sum {

	public static Boolean sum_equals_target(ArrayList<Integer>ans
			,int [] arr,int n,int target,int ind,int sum) {
//		Base Case :- 
//					check if size == n  and sum == target;
		if(ind == n) {
			if(sum==target) {
				for(int i=0;i<ans.size();i++) {
					System.out.print(ans.get(i) + " ");
				}
				System.out.println(" ");
				return true;
			}
			return false;
		}
		
		ans.add(arr[ind]);
		sum += arr[ind];
		if(sum_equals_target(ans,arr,n,target,ind+1,sum))return true;
		
		ans.remove(ans.size()-1);
		sum -= arr[ind];
		
		return sum_equals_target(ans,arr,n,target,ind+1,sum);
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
		sum_equals_target(ans,arr,n,target,0,0);
	}
}
