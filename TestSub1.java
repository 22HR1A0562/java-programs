//with argument no return value function
import java.util.Scanner;
class Demo
{
public void displayMenu()
{
System.out.println("+ :Addition");
System.out.println("- :Subtraction\n* :Multiplication");
System.out.println("/ :Division");
}
public void add(int a,int b)//with argument no return value function
{
int res=a+b;
System.out.println(a+"+"+b+"="+res);
}
public int sub(int a,int b)
{
int res=a-b;
return res;
}
public int input()//without argument return value function
{
Scanner sc=new Scanner(System.in);
int temp=sc.nextInt();
return temp;
}
}
class TestSub1
{
public static void main(String args[])
{
Demo d=new Demo();
d.displayMenu();
Scanner sc=new Scanner(System.in);
int n1=d.input();
int n2=d.input();
d.add(n1,n2);
int r=d.sub(n1,n2);
System.out.println(n1+"-"+n2+"="+r);
}
}
