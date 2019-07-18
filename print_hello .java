import java.util.Scanner;

public class print_hello {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the n values");
		int n=s.nextInt();
		int count=0;
		for (int i=0;i<n;i++)
		{
		String s1="Hello";
		System.out.println(s1);
		count++;
		}
		s.close();
	}

}
