import java.util.Scanner;
class Largest
{
	public static void main(String[]args)
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int n1=sc.nextInt();
		System.out.println("enter second value");
		int n2=sc.nextInt();
		System.out.println("n1>n2 is"+(n1>n2));
		System.out.println("n1<n2 is"+(n1<n2));
		System.out.println("n1>=n2 is"+(n1>=n2));
		System.out.println("n1<=n2 is"+(n1<=n2));
		System.out.println("n1!=n2 is"+(n1!=n2));*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first value");
		int n1=sc.nextInt();
		System.out.println("enter second value");
		int n2=sc.nextInt();
		System.out.println("enter third value");
		int n3=sc.nextInt();
		if((n1>n2)&&(n1>n3))
		{
			System.out.println("First number is largest");
		}
		 if((n2>n1)&&(n2>n3))
		{
			System.out.println("Second number is largest");
		}
		else 
			{
				System.out.println("Third number is largest");
			}
		
	}
}