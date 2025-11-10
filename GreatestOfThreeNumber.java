import java.util.*;
class GreatestOfThreeNumber{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter three number : ");
		int n1= sc.nextInt();
		int n2= sc.nextInt();
		int n3= sc.nextInt();
		int max = 0;

		// Method 1.
		// if (n1>n2 && n1>n3) {
		// 	max= n1;
		// }
		// else if(n2>n1 && n2>n3){
		// 	max=n2;
		// }
		// else{
		// 	max=n3;
		// }
		// System.out.println("Greatest Number Is : "+max); 

		// Method 2.
		int result,temp;
		temp = n1>n2 ? n1 : n2;
		result = temp < n3 ? n3 :temp;
		System.out.println("Greatest Number Is : "+result); 





	}
}