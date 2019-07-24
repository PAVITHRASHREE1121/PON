import java.util.Scanner;
public class algorithm_ {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	int a=s.nextInt();
	int d=s.nextInt();
	{
	float x=n/2f;
	int y=2*a;
	int z=(n-1)*d;
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	double P=x*(y+z);
	System.out.println((int) P);
	}
}
}
