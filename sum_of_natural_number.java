import java.util.Scanner;

public class sum_of_natural_number {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the n values");
		int n=s.nextInt();
		int sum=0;
		for (int i=0;i<=n;i++)
		{
		sum=sum+i;
		}
		System.out.println("the value is  "+ sum);
		s.close();
	}

}
