import java.util.Scanner;
public class count_digit {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
	int count=0;
	while(n>0)
	{
		n=n/10;
		count =count +1;
	}
	System.out.println(count);
	s.close();
}
}
