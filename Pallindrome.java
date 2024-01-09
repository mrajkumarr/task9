package task9;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {

		 int a,b,sum=0;    
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the value: ");
		 int c = sc.nextInt();  
		 b=c;    
		  
		  while(c>0){    
		   a=c%10;   
		   sum=(sum*10)+a;    
		   c=c/10;    
		  }    
		  if(b==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome number");    

	}

}

/*
 Output:
 
input - 236
 
Enter the value: 236
not palindrome number

input:252

Enter the value: 252
palindrome number 

 */

