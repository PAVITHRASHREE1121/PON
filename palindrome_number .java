package prp;
import java.util.Scanner;
public class palindrome_number {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	int temp=n; 
	int sum=0;
		while(n<=1000)
		{
        int r=n%10;
	    sum=(sum*10+r);
		n=n/10;
		}
	if (sum==temp)
	{
		System.out.println("the given number is palindrome");
	}
	else
	{
		System.out.println("the given number is not palindrome");
	}
	s.close();
	
