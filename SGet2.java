class Student
{
private int id;
private String name;
public void setId(int id)
{
this.id=id;
}
public void setName(String name)
{
this.name=name;
}
public int getId()
{
return this.id;
}
public String getName()
{
return this.name;
}
}
class SGet2
{
public static void main(String args[])
{
Student[] s1=new Student[3];
s1[0]=new Student();
s1[0].setId(2345);
s1[0].setName("Afreen");
System.out.println("ID: "+s1[0].getId());
System.out.println("NAME: "+s1[0].getName());
s1[1]=new Student();
s1[1].setId(1234);
s1[1].setName("Ayaan");
System.out.println("ID: "+s1[1].getId());
System.out.println("NAME: "+s1[1].getName());
s1[2]=new Student();
s1[2].setId(9834);
s1[2].setName("Afsa");
System.out.println("ID: "+s1[2].getId());
System.out.println("NAME: "+s1[2].getName());
}
}