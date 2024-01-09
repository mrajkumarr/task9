package task9;

public class StringReverse {

	public static void main(String[] args) {

		 	String input = "Welcome";  
	        String reversed = "";  

	        for (int i = input.length() - 1; i >= 0; i--)
	        {  
	            reversed += input.charAt(i);  
	            }   
	         
	        System.out.println("Original String: " + input);  
	        System.out.println();
	        System.out.println("Reversed String: " + reversed);  

	}

}

/*
Output:

Original String: Welcome

Reversed String: emocleW

*/