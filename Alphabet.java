import java.util.Scanner;
class Alphabet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch=sc.next().charAt(0);
if(((ch>='a')&&(ch<='z'))||((ch>='A')&&(ch<='Z')))
{
System.out.println("Entered number is an alphabet");
}
else
{
System.out.println("Entered number is not an alphabet");
}
}
}

