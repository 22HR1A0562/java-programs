import java.util.Scanner;
class Demo
{
public int[] input()//no argument with return array value function
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("Please type "+n+" Integers");
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
return arr;
}
public int add(int[] a)//with argument and with return value function
{
int sum=0;
for(int i=0;i<a.length;i++)
{
sum+=a[i];
}
return sum;
}
}
class TestArray
{
public static void main(String args[])
{
Demo d=new Demo();
int[] array=new int[5];
array=d.input();
int res=d.add(array);
System.out.println(res); 
}
}