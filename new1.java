/*
Shriraman is a great Java programmer. He writes thousand lines of code every day. But today he is not in a mode of writing any code. So, he need you to write a program which will calculate sum of prime numbers from 1 to N in java. If the N is invalid then print Invalid. Shriraman will enter the value of N i.e the upper limit of the series. Sample input:- 10 Sample output:- Sum of all the prime numbers between 1 to 10 is:- 17

*/
import java.util.Scanner;
import java.io.*;
class new1
{
  public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int sum= 0 ;
    int N= sc.nextInt();
    if(N<=0){
    System.out.println("Invalid");
    }
    else{
    for (int j=1; j<=N ;j++) {
      int flag= 0;
      for(int i=2;i<=j/2;++i)
      {
        if(j%i==0)
        {
          flag=1;
          break;
        }
      }
      if (flag==0){
          sum+=j ;
//        System.out.println("is a prime number."+ j);
      }
      else{
//        System.out.println("is not a prime number." + j);
      }
    } 
      System.out.println("Sum of all the prime numbers between 1 to " + N + "is:" + sum );
    }
  }
}  