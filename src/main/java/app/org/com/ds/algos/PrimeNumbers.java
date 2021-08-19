package app.org.com.ds.algos;

import java.util.Scanner;

public class PrimeNumbers {

	
	public static void main(String[] args) {  
	       Scanner sc = new Scanner(System.in);  
	       System.out.print("Enter the first number : ");  
	       int start = sc.nextInt();  
	       System.out.print("Enter the second number : ");  
	       int end = sc.nextInt();  
	       System.out.println("List of prime numbers between " + start + " and " + end);  
	       for (int i = start; i <= end; i++) {  
	           if (isPrime(i)) {  
	               System.out.println(i);  
	           }  
	       }  
	       sc.close();
	   }  
	   public static boolean isPrime(int n) {  
	       if (n <= 1) {  
	           return false;  
	       }  
	       for (int i = 2; i <= Math.sqrt(n); i++) {  
	           if (n % i == 0) {  
	               return false;  
	           }  
	       }  
	       return true;  
	   }  
	
}
