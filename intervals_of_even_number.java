import java.util.Scanner;

public class intervals_of_even_number {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	int m=s.nextInt();
	for (int i=n+1;i<m;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
	s.close();
}
}
