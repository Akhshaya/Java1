import java.util.Scanner;
class Reverseno
{
public static void main(String args[])
{
int n,rev=0;
System.out.println("Enter the Number:");
Scanner s=new Scanner(System.in);
n=s.nextInt();
while(n!=0)
{
rev=rev*10;
rev=rev+n%10;
n=n/10;
}
System.out.println("The rev of the entered number is"+rev);
}
}
