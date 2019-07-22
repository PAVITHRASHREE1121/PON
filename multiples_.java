package prp;

import java.util.Scanner;

public class multiples_ {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the number");
	int n=s.nextInt();
      for (int i=1;i<=5;i++)
    {
	 System.out.println(n*i);
	}
      s.close();
}
}
