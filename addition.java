import java.util.Scanner;

public class addition {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	int n=s.nextInt();
	if(n>0)
	{
		System.out.println("postive");
	}
	else if (n==0)
	{
		System.out.println("zero");
	}
	else
	{
		System.out.println("negative");
	}
	s.close();
}
}
