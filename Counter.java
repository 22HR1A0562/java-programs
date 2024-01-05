//JAVA PRGM TO ILLUSTRATE THE USE OF STATIC VARIABLE WHICH IS SHARED WITH ALL OBJECTS
class Counter
{
static int count=0;
Counter()
{
count++;//INCREMENT THE VALUE OF STATIC VARIABLE
System.out.println(count);
}
public static void main(String args[])
{
Counter c1=new Counter();
Counter c2=new Counter();
Counter c3=new Counter();
}
}