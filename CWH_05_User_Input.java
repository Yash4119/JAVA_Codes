import java.util.Scanner;
public class CWH_05_User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("User Input");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 :- ");
		int a = sc.nextInt();
		System.out.println("Enter Number 2 :- ");
		int b = sc.nextInt();
		System.out.println("The sum is :- ");
		System.out.println(a+b);
		String str = sc.nextLine();
		System.out.println(str);
	}

}
