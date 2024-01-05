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
class SGet
{
public static void main(String args[])
{
Student s1=new Student();
s1.setId(2345);
s1.setName("Afreen");
System.out.println("ID: "+s1.getId());
System.out.println("NAME: "+s1.getName());
}
}