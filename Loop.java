 /*import java.util.Scanner;
class Loop
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=n;i>=0;i=i-5)
System.out.println(i +",");
}
}*/

import java.util.Scanner;
class Loop
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=n;
while(i>=0)
{
System.out.println(i + ",");
i=i-5;
}
}
}