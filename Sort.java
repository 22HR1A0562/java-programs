import java.util.Scanner;
class Sort
{
public static void main(String args[])
{
int n,i=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();//SIZE OF ARRAY
int a[]=new int[n];
System.out.println("Enter elements");
for(i=0;i< n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
int temp=0;
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
//display array
for(int x:a)
{
System.out.println(x+" ");
}
}
}
