class C
{
public void display()
{
System.out.println("Method of class c");
}
}
class A extends C 
{
public void display()
{
System.out.println("Method of class a");
}
}
class B extends C
{
public void display()
{
System.out.println("Method of class b");
}
}
class D extends A
{
public void display()
{
System.out.println("Method of class d");
}
public static void main(String args[])
{
D d1=new D();
d1.display();
}
}