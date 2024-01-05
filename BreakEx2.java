import java.util.Scanner;
class Ex2
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
byte i=0;
while(true)
{
System.out.print(i+",");
if(i==n)
break;
i++;
}
}
}