import java.util.Scanner;
class Unary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
boolean cond=true;
System.out.println("Cond is=" +cond);
System.out.println("Var1 is=" +a);
System.out.println("Var2 is=" +b);
System.out.println("Now cond is=" +!cond);
System.out.println("!(a<b)=" +!(a<b));
System.out.println("!(a>b)=" +!(a>b));
}
}

