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
class SGet1
{
public static void main(String args[])
{
Student s1=new Student();
s1.setId(2345);
s1.setName("Afreen");
System.out.println("ID: "+s1.getId());
System.out.println("NAME: "+s1.getName());
Student s2=new Student();
s2.setId(1234);
s2.setName("Ayaan");
System.out.println("ID: "+s2.getId());
System.out.println("NAME: "+s2.getName());
Student s3=new Student();
s3.setId(9834);
s3.setName("Afsa");
System.out.println("ID: "+s3.getId());
System.out.println("NAME: "+s3.getName());
}
}