import java.util.Scanner;

public class power_of_digitrs {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	int n=s.nextInt();
	int k=s.nextInt();
          int p=(int)Math.pow(n,k);	
	 System.out.println("the value is  "+ p);
}
}
