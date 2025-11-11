import java.util.*;

class CheckPrimeNum{
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		boolean isPrime = false;

		// Method 1.
		if (num <= 3) {
			isPrime = false;
		}else{
			for (int i = 2;i<=num/2 ;i++ ) {
				if (num%i==0){
					isPrime = true;
					break;
				}
			}
		}

		// Method 2. using square root.
		// if (num <= 3) {
		// 	isPrime = false;
		// }else{
		// 	for (int i = 2;i<=Math.sqrt(num) ;i++ ) {
		// 		if (num%i==0){
		// 			isPrime = true;
		// 			break;
		// 		}
		// 	}
		// }

		// Method 3. check even and skip that
		// if (num <= 3) {
		// 	isPrime = false;
		// }else{
		// 	for (int i = 2;i<=Math.sqrt(num) ;i++ ) {
		// 		if (num%i==0){
		// 			isPrime = true;
		// 			break;
		// 		}
		// 	}
		// }

		if (isPrime) {
			System.out.println(num +" Is not prime number.");
		}else{
			System.out.println(num +" Is a prime number.");
		}
	}
}