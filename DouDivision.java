import java.util.Scanner;
class DouDivision
{
public static double div(int a,int b)
{
double c=a/b;
return c;
}
public static int add(int a,int b)
{
int c=a+b;
return c;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int n1=sc.nextInt();
System.out.println("Enter a number");
int n2=sc.nextInt();
System.out.println(n1+"+"+n2+"="+add(n1,n2));
System.out.println(n1+"/"+n2+"="+div(n1,n2));
}
}