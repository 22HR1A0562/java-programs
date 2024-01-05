class Test2
{
public static void main(String args[])
{
int i=0;
int sum=0;
//while(i<=100)
for(i=0;i<=100;i=i+5)
{
System.out.print(i+"+");
sum=sum+i;//sum+=i;
}
System.out.print("\b"+"="+sum);
}
}