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
int c=a*b;
System.out.println(a+"*" +b+"=" +c);
}
}