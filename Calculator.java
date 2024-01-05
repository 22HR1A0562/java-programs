/*class Calculator
{
static int cube(int x)
{
return x*x*x;
}
public static void main(String args[])
{
int result=Calculator.cube(5);
System.out.println(result);
}
}*/

import java.util.Scanner;
class Calculator
{
static int cube(int x)
{
return x*x*x;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
/*static int cube(int n)
{
return x*x*x;
}*/
int result=Calculator.cube(n);
System.out.println(result);
}
}