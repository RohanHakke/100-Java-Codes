import java.util.*;
class SumOfNNumber{
	// THis is Method 3 code.
	// public static int sumOfNumber(int num){
	// 	if (num == 0) {
	// 		return num;
	// 	}
	// 	return num + sumOfNumber(num-1);
	// }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n  = sc.nextInt();
		int sum = 0;

		// Method 1
		for (int i = 1; i<=n ;i++ ) {
			sum=sum+i;
		}
		System.out.println("Sum of upto "+n+" is "+sum);

		// Method 2    Using formula.
		// sum = (n*(n+1))/2;
		// System.out.println("Sum of upto "+n+" is "+sum);

		// Method 3  Using recursion.
		// System.out.println("Sum of upto "+n+" is "+sumOfNumber(n));
	}
}