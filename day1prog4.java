import java.util.Scanner;
class Loop
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a value");
int a=sc.nextInt();
for(int i=0;i<=10;i++)
System.out.println(a+"*"+i+"="+a*i);
}
}
