import java.util.Scanner;
class Test
{
public static void checkEvenOdd(int a)
{
if((a/2)*2==a)
{
System.out.println("EVEN");
}
else
{
System.out.println("ODD");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
Test.checkEvenOdd(a);
}
}