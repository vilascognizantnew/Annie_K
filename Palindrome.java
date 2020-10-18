
import java.util.Scanner;
class Palindrome 
{
public static void main(String[] args) 
{
int a,numb,b,rev=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter any num: ");
numb=s.nextInt();
b=numb;
while(numb>0)
{
a=numb%10;
numb=numb/10;
rev=rev*10+a;
}
if(rev==b)
{
System.out.println("Palindrome");
}
else
{
System.out.println("not Palindrome");
}
}
}