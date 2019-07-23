import java.util.Scanner;
public class intervals_of_amstrong {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the first number");
	int n=s.nextInt();
	System.out.println("enter the second number");
	int p=s.nextInt();
	for (int i=n;i<p;i++)
	{
		int sum=0,r;
		int check=i;
		while (check!=0)
		{
			r=check%10;
			sum=sum+(r*r*r);
			check=check/10;
		}
		if(sum==i)
		{
			System.out.println(i);
		}
	}
	s.close();
}
}
