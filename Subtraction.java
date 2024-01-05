import java.util.Scanner;
class Subtraction
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=a-b;
if(a<b)
{
System.out.println(b-a);
}
else
{
System.out.println(a-b);
}
int a1=sc.nextInt();
int b1=sc.nextInt();
int c1=a1-b1;
if(a1<b1)
{
System.out.println(b1-a1);
}
else
{
System.out.println(a1-b1);
}
int a2=sc.nextInt();
int b2=sc.nextInt();
int c2=a2-b2;
System.out.println(c2);
}
}