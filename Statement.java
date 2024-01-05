import java.util.Scanner;
class Statement
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter value of i");
int i=sc.nextInt();
System.out.println("Enter the value of j");
int j=sc.nextInt();
if(j==0)
System.out.println("Division by error");
else
System.out.println(i+"divided by"+j+" is "+(i/j));
i=i+j;
}
}