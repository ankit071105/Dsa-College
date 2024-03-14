import java.util.Scanner;
public class Question2 {
	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter how many lines");
int n = sc.nextInt();
String str[]= new String[n];
sc.nextLine();
for(int i =0;i<n;i++)
{
	System.out.println("Enter a sentence");
	str[i]=sc.nextLine();
}
System.out.println("display in reverse order");
for(int i=n-1;i>=0;i--)
{
	System.out.println(str[i]);
}
	}
}