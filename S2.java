class S2
{
void m(S2 obj)
{
System.out.println("method is invoked");
}
void a()
{
m(this);
}
public static void main(String args[])
{
S2 ob=new S2();
ob.a();
}
}