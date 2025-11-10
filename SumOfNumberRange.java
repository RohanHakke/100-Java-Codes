import java.util.*;
class SumOfNumberRange{
	// Method 3 code.
	// public static int sumNumber(int n1,int n2){
	// 	if (n2 == (n1-1)) {
	// 		return n2;
	// 	}
	// 	return n2 + sumNumber(n1,n2-1);
	// }   

	// or
	// Another for recursion method.
	// public static int sumNumber(int n1,int n2){
	// 	if (n1>n2) {
	// 		return 0;
	// 	}
	// 	return n1 + sumNumber(n1+1,n2);
	// }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter final number : ");
		int n2 = sc.nextInt();
		int sum= 0;

		// //Method 1.
		for (int i = n1;i<=n2 ;i++ ) {
			sum=sum+i;
		}
		System.out.println("Sum of "+n1+" to "+n2+ " is "+sum);

		// // Method 2.  using formula.
		// sum = (n2*(n2+1))/2  - (n1*(n1+1))/2 + n1;
		// System.out.println("Sum of "+n1+" to "+n2+ " is "+sum);

		// // Method 3.  using recursion.
		// System.out.println("Sum of "+n1+" to "+n2+ " is "+sumNumber(n1,n2));
	}
}