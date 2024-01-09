package task9;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {

		int a, b, c;
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter the value of A");
		a = sc.nextInt();
		

		System.out.println("Enter the value of B");
		b = sc.nextInt();
		

		System.out.println("Enter the value of C");
		c = sc.nextInt();
		
		int check,large;
		
		check=a>b?a:b;
		large=c>check?c:check;
		

		System.out.println("");
		System.out.println("Largest Value: " +large);
		

	}

}


/*

Output

Enter the value of A
12
Enter the value of B
13
Enter the value of C
14

Largest Value: 14

*/

