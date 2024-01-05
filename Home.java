class Home
{
int length;
int height;
int breadth;
{
void inset(int l,int h,int b)
{
length=l;
height=h;
breadth=b;
}
void display
{
System.out.println(length*breadth*height);
}
}
}
class Home1
{
public static void main(String args[])
{
Home h=new Home();
h.insert(2,4,7);
h.display();
}
}