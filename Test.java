class A
{
A()
{
System.out.println("Hello a from default constructor");
}
A(int x)
{
this();
System.out.println(x);
}
}
class Test
{
public static void main(String args[])
{
A a=new A(10);
}
}