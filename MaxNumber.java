import java.util.*;
class MaxNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 number : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int max = 0;

		// Method 1.
		if (num1==num2) {
			System.out.println("Both are equal");
			return;    // exit the current method.
		}
		if (num1>num2) { 
			 max = num1;
		}else{
			max = num2;
		}
		System.out.println("Greatest Number Is : "+max);  

		// Method 2.   using ternary
		// String result = (num1==num2) ? "Both are equal number." : (num1>num2) ? "Greatest Number Is : " + num1 : "Greatest Number Is : " + num2;
		// System.out.println( result); 

		// Method 3.   using inbuild java method
		// if (num1==num2) {
		// 	System.out.println("Both are equal number.");
		//  return;
		// }
		// System.out.println("Greatest Number Is : "+Math.max(num1,num2));
	}
}