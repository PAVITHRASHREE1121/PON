import java.util.Scanner;
public class prime_number {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	boolean b=true;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
	   b=false;
	   break;
		}
	}
	if (b)
	{
		System.out.println("yes");
	}
	else
	{
	System.out.println("No");	
	}
	s.close();
}
}
