import java.util.Scanner;
public class vowels_consonants {
public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the letter");
	int i=0;
	char ch=s.next().charAt(0);
	if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
		System.out.println("vowels" );
	}
	else if(ch>='a' && ch<='z'||ch>='A' && ch<='Z')
	{
		System.out.println("consonants");
	}
	else
	{
		System.out.println("no alphabet");
	}
	
	s.close();
}
}
