import java.util.Scanner;
class OddEven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a%2==0)
{
System.out.println("EVEN\n");
System.out.println(a+"is Even\n");
}
else
{
System.out.println("ODD\n");
System.out.println(a+"is Odd\n");
}
}
}