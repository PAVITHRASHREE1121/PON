package prp;
import java.util.Scanner;
public class factorial_ {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	int fact=1;
	for (int i=1;i<=n;i++)
	{
	fact=fact*i;
	}
	System.out.println(fact);
	s.close();
}
}
