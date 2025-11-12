import java.util.*;
class ReverseNumber{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		int rev = 0;
		
		// Method 1.   using while loop
		while(num!=0){
			rev=rev*10 + num%10;
			num=num/10;
		}
		System.out.println(rev);

		// // Method 2.  using for loop
		// for (; num!=0; num=num/10) {
		// 	rev = rev*10 + num%10;
		// }
		// System.out.println(rev);
	}
}