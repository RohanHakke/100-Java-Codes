import java.util.*;
class FibonacciN{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int first = 0;
		int second = 1;
		int next = 0;
		
		if (n == 1) {
			System.out.print(first);
		}
		else if(n==2){
			System.out.print(first + " "+second);
		}else{
			System.out.print(first + " "+second + " ");
		}

		for (int i=3;i<=n;i++ ) {
			next = first + second;
			System.out.print(next + " ");
			first=second;
			second=next;
		}
	}
}