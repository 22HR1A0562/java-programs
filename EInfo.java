class Info
{
int id;
String name;
String dept;
void employee(int i,String n,String d)
{
id=i;
name=n;
dept=d;
}
void display()
{
System.out.println(id+"  "+name+"  "+dept);
}
}
class EInfo
{
public static void main(String args[])
{
Info i1=new Info();
Info i2=new Info();
Info i3=new Info();
i1.employee(543,"Chaithanya","CSE");
i2.employee(578,"Latha","ECE");
i3.employee(562,"Afreen","AI DS");
i1.display();
i2.display();
i3.display();
}
}