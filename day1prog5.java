import java.util.Scanner;
class Table
{
public static int add(int a,int b)
{
return a+b;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of a:");
int a=sc.nextInt();
System.out.println("Enter value of b:"); 
int b=sc.nextInt();
Table.add(a,b);
System.out.println("a:"+a+"b:"+b+"sum:"+(a+b));
for(int i=0;i<=10;i++)
System.out.println(a+"*"+i+"="+a*i);
}
}

