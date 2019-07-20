import java.util.Scanner;

public class leap_year {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the year");
	int year=s.nextInt();
	if(year%4==0)
	{
		System.out.println(" yes the given year is leap year");
	}
	else
	{
		System.out.println(" No the given year is not leap year");
	}
	s.close();
}
}
