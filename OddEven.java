import java.util.Scanner;
class OddEven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a%2==0)
{
System.out.println("Entered number is EVEN");
}
else
{
System.out.println("Entered number is ODD");
}
}
}