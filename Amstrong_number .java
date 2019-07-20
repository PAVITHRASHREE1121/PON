import java.util.Scanner;
public class Amstrong_number {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	int sum=0;
	int temp=n;
	while(n>0)
	{
		int r=n%10;
	    sum=sum+(r*r*r);
		n=n/10;
	}
	if (temp==sum)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	s.close();
	
