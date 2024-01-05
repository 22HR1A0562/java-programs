import java.util.Scanner;
import java.io.*;
class Addition
{
public static void main(String[] args)
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter value of a");
int a=sc.nextInt();
System.out.println("Enter value of b");
int b=sc.nextInt();
int sum=a+b;
int sub=a-b;
int mul=a*b;
int div=a/b;
int mod=a%b;
System.out.println("The sum of two numbers is=" +sum);
System.out.println("The difference  of two numbers is=" +sub);
System.out.println("The product of two numbers is=" +mul);
System.out.println("The division of two numbers is=" +div);
System.out.println("The quotient of two numbers is=" +mod);
}
}