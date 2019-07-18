import java.util.Scanner;
public class alpahabets {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
	    System.out.println("Enter the letter");
	    char ch=s.next().charAt(0);
	    if((ch>=65&&ch<=90) ||(ch>=97&&ch<=122))
	    {
	    	System.out.println(ch+" Alpahabet");
	    }
	    else
	    {
        System.out.println("no alphabet");
	    }
	    s.close();
	 }
	}
